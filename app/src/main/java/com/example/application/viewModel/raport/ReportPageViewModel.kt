package com.example.application.viewModel.raport

import androidx.lifecycle.MutableLiveData
import com.example.application.base.BaseViewModel
import com.example.application.database.SharedPrefLocalStorage
import com.example.application.database.dao.TrainingDao
import com.example.application.database.dao.TrainingExerciseDao
import com.example.application.di.Injector
import javax.inject.Inject

class ReportPageViewModel : BaseViewModel() {

    @Inject
    lateinit var localStorage: SharedPrefLocalStorage

    @Inject
    lateinit var trainingDao: TrainingDao

    @Inject
    lateinit var trainingExerciseDao: TrainingExerciseDao

    var trainingCount = MutableLiveData<Int>()
    var doneTrainingCount = MutableLiveData<Int>()

    init {
        Injector.component.inject(this)
        trainingCount.postValue(0)
        doneTrainingCount.postValue(0)
    }
}
