package com.example.application.viewModel.training.newTraining

import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Observer
import androidx.lifecycle.viewModelScope
import com.example.application.base.BaseViewModel
import com.example.application.database.dao.TrainingDao
import com.example.application.database.dao.TrainingExerciseDao
import com.example.application.database.model.WorkoutExercise
import com.example.application.database.model.WorkoutExercises
import com.example.application.di.Injector
import kotlinx.coroutines.launch
import javax.inject.Inject

class PageNewTrainingViewModel : BaseViewModel() {

    @Inject
    lateinit var trainingDao: TrainingDao

    @Inject
    lateinit var exerciseDao: TrainingExerciseDao

    var trainingId =  MutableLiveData<Long>()
    var isSaved = false
    var isAdding = false
    var itemsCount = 0

    val exercises = MutableLiveData<List<WorkoutExercise>>()

    init {
        Injector.component.inject(this)
    }

    fun insert() = viewModelScope.launch {
        val id = trainingDao.insert(WorkoutExercises())
        trainingId.postValue(id)
    }

    fun getExercises(owner: LifecycleOwner){
        exerciseDao.getAllByParentId(trainingId.value ?: 0).observe(owner, Observer {
            exercises.postValue(it)
        })
    }

    fun delete() = viewModelScope.launch {
        trainingId.value?.let {
            trainingDao.deleteById(it)
        }
    }

    fun deleteExercise(id: Long) = viewModelScope.launch {
        exerciseDao.deleteById(id)
    }
}