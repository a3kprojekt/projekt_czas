package com.example.application.viewModel.training.trainings

import androidx.lifecycle.viewModelScope
import com.example.application.base.BaseViewModel
import com.example.application.database.dao.TrainingExerciseDao
import com.example.application.di.Injector
import kotlinx.coroutines.launch
import javax.inject.Inject

class StartTrainingPageViewModel : BaseViewModel() {

    @Inject
    lateinit var exercisesDao: TrainingExerciseDao

    init {
        Injector.component.inject(this)
    }

    fun update(id: Long, status: Boolean) = viewModelScope.launch {
        exercisesDao.updateStatus(id, status)
    }
}