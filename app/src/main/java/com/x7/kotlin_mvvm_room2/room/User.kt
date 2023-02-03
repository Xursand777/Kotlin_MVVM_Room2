package com.x7.kotlin_mvvm_room2.room

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.x7.kotlin_mvvm_room2.Constants.TABLE_NAMEE

@Entity(tableName = TABLE_NAMEE)
class User constructor(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id")
    val uid:Int,
    @ColumnInfo(name = "name")
    val name:String,

)