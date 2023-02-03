package com.x7.kotlin_mvvm_room2.model

import com.x7.kotlin_mvvm_room2.Constants.userDao
import com.x7.kotlin_mvvm_room2.room.User

class MainRepository {


    var arrayList=ArrayList<User>()

    fun readalldata(){
        arrayList= userDao.getAllUsers() as ArrayList<User>
    }
}