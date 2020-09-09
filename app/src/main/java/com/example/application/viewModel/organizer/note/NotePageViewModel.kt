package com.example.application.viewModel.organizer.note

import androidx.lifecycle.*
import com.example.application.database.dao.NoteDao
import com.example.application.di.Injector
import kotlinx.coroutines.launch
import javax.inject.Inject

class NotePageViewModel() : ViewModel() {

    @Inject
    lateinit var noteDao: NoteDao

    val notes = MutableLiveData<List<Any>>()

    init {
        Injector.component.inject(this)
    }

    fun deleteNote(id: Long) = viewModelScope.launch {
        noteDao.deleteById(id)
    }
}