package com.example.application.viewModel.training.newTraining

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.example.application.base.BaseViewModel
import com.example.application.database.dao.ExercisesDao
import com.example.application.database.dao.TrainingExerciseDao
import com.example.application.database.model.WorkoutExercise
import com.example.application.di.Injector
import kotlinx.coroutines.launch
import javax.inject.Inject

class AddExerciseToNewTrainingPageViewModel : BaseViewModel() {

    @Inject
    lateinit var exercisesDao: ExercisesDao

    @Inject
    lateinit var trainingExerciseDao: TrainingExerciseDao

    var parentId: Long? = null

    val onInsert = MutableLiveData<Int>()

    init {
        Injector.component.inject(this)
    }

    fun insert(name: String, repeatCount: Int, weight: Float?, time: Long?, seriesCount: Int) = viewModelScope.launch {
        parentId?.let {
            val e = WorkoutExercise(
                parentId = it,
                exerciseName = name,
                done = false,
                load = weight,
                repeatCount = repeatCount,
                time = time
            )
            for (i in 0 until seriesCount){
                trainingExerciseDao.insert(e)
            }

            onInsert.postValue(seriesCount)
        }

    }
}