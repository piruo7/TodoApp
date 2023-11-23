package com.cramirez.todoapp.addtasks.data

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [TaskEntity::class], version = 1)
abstract class TodoDataBase:RoomDatabase() {
    //Dao
    abstract fun taskDao():TaskDao

}