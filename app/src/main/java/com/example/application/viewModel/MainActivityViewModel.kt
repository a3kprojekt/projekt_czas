package com.example.application.viewModel

import androidx.lifecycle.viewModelScope
import com.example.application.R
import com.example.application.base.BaseViewModel
import com.example.application.database.dao.PomodoroDao
import com.example.application.di.Injector
import com.example.application.model.MenuItem
import kotlinx.coroutines.launch
import javax.inject.Inject

class MainActivityViewModel : BaseViewModel(){

    @Inject
    lateinit var dao: PomodoroDao

    init {
        Injector.component.inject(this)
    }

    fun deleteSession() = viewModelScope.launch {
        dao.delete()
    }

    val menuItems = listOf(
        MenuItem("Posiłki", R.id.page_meals),
        MenuItem("Organizer", R.id.page_organizer),
        MenuItem("Trening", R.id.page_training),
        MenuItem("Raport", R.id.page_report)
    )
}