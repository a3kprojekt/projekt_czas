package com.example.application.viewModel.training.exercise

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.example.application.base.BaseViewModel
import com.example.application.database.dao.ExercisesDao
import com.example.application.database.model.WorkoutExerciseName
import com.example.application.di.Injector
import kotlinx.coroutines.launch
import javax.inject.Inject

class AddExercisePageViewModel : BaseViewModel() {

    @Inject
    lateinit var exercisesDao: ExercisesDao

    val onInsert = MutableLiveData<Any>()

    init {
        Injector.component.inject(this)
    }

    fun insertExercise(name: String) = viewModelScope.launch {
        exercisesDao.insert(WorkoutExerciseName(exerciseName = name))
        onInsert.postValue(true)
    }
}
