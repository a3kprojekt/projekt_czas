package com.example.application.viewModel.training

import com.example.application.R
import com.example.application.base.BaseViewModel
import com.example.application.model.MenuItem

class TrainingPageViewModel : BaseViewModel() {
    val menuItems = listOf(
        MenuItem("Ćwiczenia", R.id.page_exercises, icon = R.drawable.ic_fitness),
        MenuItem("Ustal trening", R.id.page_new_training, icon = R.drawable.ic_new_training),
        MenuItem("Zacznij trening", R.id.page_trainings, icon = R.drawable.ic_training)
    )
}