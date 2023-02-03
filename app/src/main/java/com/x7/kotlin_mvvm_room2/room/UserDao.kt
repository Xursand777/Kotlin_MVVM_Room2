package com.x7.kotlin_mvvm_room2.room

import androidx.room.*
import com.x7.kotlin_mvvm_room2.Constants.TABLE_NAMEE

@Dao
interface UserDao {
    @Query("SELECT * FROM $TABLE_NAMEE")
    fun getAllUsers():List<User>
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertUser(user: User)
    @Update
    fun updateUser(user: User)
    @Delete
    fun deleteUser(user: User)
    @Query("DELETE FROM $TABLE_NAMEE")
    fun deleteAllUsers()
    @Query("SELECT * FROM $TABLE_NAMEE WHERE id=:idd ")
    fun loadbyid(idd:Int):User
}