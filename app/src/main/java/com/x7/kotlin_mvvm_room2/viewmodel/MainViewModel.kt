package com.x7.kotlin_mvvm_room2.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.x7.kotlin_mvvm_room2.model.MainRepository
import com.x7.kotlin_mvvm_room2.room.User

class MainViewModel:ViewModel() {

    val repository= MainRepository()
    val liveData= MutableLiveData<ArrayList<User>>()

    fun readfromroom(){
        repository.readalldata()
        liveData.value=repository.arrayList
    }

}