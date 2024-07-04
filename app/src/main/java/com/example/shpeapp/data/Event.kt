package com.example.shpeapp.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "event")
data class Event(
    @PrimaryKey(autoGenerate = true) val id: String = 0,
    val title: String,
    val detail: String,
    val location: String,
    val dateTime: String,
    val signInLink: String
)
