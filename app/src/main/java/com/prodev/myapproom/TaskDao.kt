package com.prodev.myapproom

import androidx.room.*
import java.nio.channels.SelectableChannel

@Dao
interface TaskDao {

    @Insert (onConflict = OnConflictStrategy.REPLACE)
    fun insertTask(
        task: Task
    )

    @Insert
    fun instertMultipleTask(
        list: List<Task>
    )

    @Update
    fun updateTask(
        task: Task
    )

    @Delete
    fun deleteOneTask(
        task: Task
    )

    @Query(value = "SELECT * FROM  task_table ORDER BY idTask ASC")
    fun getAllTask():
            List<Task>
}
