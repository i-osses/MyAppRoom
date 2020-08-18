package com.prodev.myapproom

import android.content.Context
import android.os.strictmode.InstanceCountViolation
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [Task::class], version = 1, exportSchema = false)
abstract class TaskDataBase : RoomDatabase() {
    abstract fun getTaskDao(): TaskDao
    companion object{
        @Volatile
        private var INSTANCE: TaskDataBase? = null

        fun getDatabase(context: Context): TaskDataBase {
            val tempInstance = INSTANCE
            if (tempInstance != null) {

                return tempInstance
            }
            synchronized(this){
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    TaskDataBase::class.java,"word_database"
                ).build()

                INSTANCE = instance
                return instance
            }

        }

    }
}