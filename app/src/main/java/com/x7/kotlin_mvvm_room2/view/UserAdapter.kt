package com.x7.kotlin_mvvm_room2.view

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

import com.x7.kotlin_mvvm_room2.databinding.RecyclerviewItemBinding
import com.x7.kotlin_mvvm_room2.room.User

class UserAdapter constructor(
    val context: Context,
    val arrayList: ArrayList<User>
): RecyclerView.Adapter<UserAdapter.UserViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserViewHolder {
        val view= RecyclerviewItemBinding.inflate(LayoutInflater.from(context),parent,false)
        return UserViewHolder(view)
    }

    override fun onBindViewHolder(holder: UserViewHolder, position: Int) {
        holder.binding.apply {
            textviewusername.text="${arrayList.get(position).uid} ${arrayList.get(position).name}"
        }
    }

    override fun getItemCount(): Int =arrayList.size
    class UserViewHolder(val binding: RecyclerviewItemBinding): RecyclerView.ViewHolder(binding.root)

}