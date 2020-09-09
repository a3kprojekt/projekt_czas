package com.example.application.viewModel.training.exercise

import androidx.lifecycle.viewModelScope
import com.example.application.base.BaseViewModel
import com.example.application.database.dao.ExercisesDao
import com.example.application.di.Injector
import kotlinx.coroutines.launch
import javax.inject.Inject

class ExercisesPageViewModel : BaseViewModel() {

    @Inject
    lateinit var exercisesDao: ExercisesDao

    init {
        Injector.component.inject(this)
    }

    fun delete(it: Long) = viewModelScope.launch {
        exercisesDao.deleteById(it)
    }
}

