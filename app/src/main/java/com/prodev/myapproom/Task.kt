package com.prodev.myapproom

import androidx.room.Entity
import androidx.room.PrimaryKey
import org.jetbrains.annotations.NotNull

@Entity(tableName = "task_table")
data class Task(
    @PrimaryKey(autoGenerate = true) @NotNull val idTask: Int,
    val task: String,
    val creationDate: String,
    val finishDate: String
)