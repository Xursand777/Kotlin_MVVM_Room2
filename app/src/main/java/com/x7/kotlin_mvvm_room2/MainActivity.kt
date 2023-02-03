package com.x7.kotlin_mvvm_room2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.x7.kotlin_mvvm_room2.Constants.MAINACTIVITY
import com.x7.kotlin_mvvm_room2.Constants.mydatabase
import com.x7.kotlin_mvvm_room2.Constants.userDao
import com.x7.kotlin_mvvm_room2.databinding.ActivityMainBinding
import com.x7.kotlin_mvvm_room2.room.User
import com.x7.kotlin_mvvm_room2.view.UserAdapter
import com.x7.kotlin_mvvm_room2.viewmodel.MainViewModel

class MainActivity : AppCompatActivity() {
    lateinit var userAdapter: UserAdapter
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        MAINACTIVITY=this

        userDao= mydatabase(this@MainActivity).userDao()

        var viewModel = ViewModelProvider(this@MainActivity).get(MainViewModel::class.java)

        viewModel.readfromroom()
        binding.apply {
            button1.setOnClickListener {
                val user= User(0,edittext1.text.toString())
                userDao.insertUser(user)
                viewModel.readfromroom()
            }
        }

        binding.recyclerview1.layoutManager= LinearLayoutManager(this@MainActivity)
        viewModel.liveData.observe(this@MainActivity,{
            binding.textview1.text= it.size.toString()
            userAdapter= UserAdapter(this@MainActivity,it)
            binding.recyclerview1.adapter=userAdapter

        })
    }




}