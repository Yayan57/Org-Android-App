package com.example.shpeapp.ui.events

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.viewModelScope
import com.example.shpeapp.data.AppDatabase
import com.example.shpeapp.data.Event
import kotlinx.coroutines.launch

class EventsViewModel(application: Application) : AndroidViewModel(application) {
    private val eventDao = AppDatabase.getDatabase(application).eventDao()


    fun insertEvent(event: Event) {
        viewModelScope.launch {
            eventDao.insert(event)
        }
    }

    fun getAllEvents(): LiveData<List<Event>> {
        return eventDao.getAllEvents()
    }
}
