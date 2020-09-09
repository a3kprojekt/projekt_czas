package com.example.application.viewModel.training.trainings

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.example.application.base.BaseViewModel
import com.example.application.database.dao.TrainingDao
import com.example.application.database.dao.TrainingExerciseDao
import com.example.application.database.model.WorkoutExercises
import com.example.application.di.Injector
import kotlinx.coroutines.launch
import javax.inject.Inject

class PageTrainingsViewModel : BaseViewModel() {

    @Inject
    lateinit var exerciseDao: TrainingDao

    @Inject
    lateinit var trainingExerciseDao: TrainingExerciseDao

    val trainings = MutableLiveData<List<WorkoutExercises>>()

    init {
        Injector.component.inject(this)
    }

    fun removeById(id: Long) = viewModelScope.launch {
        exerciseDao.deleteById(id)
        trainingExerciseDao.deleteByParentId(id)
    }
}