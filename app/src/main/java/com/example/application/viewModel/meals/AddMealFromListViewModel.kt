package com.example.application.viewModel.meals

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.example.application.base.BaseViewModel
import com.example.application.database.dao.MealsDao
import com.example.application.database.dao.MealsSetDao
import com.example.application.database.model.Meal
import com.example.application.di.Injector
import com.example.application.database.model.MealSet
import kotlinx.coroutines.launch
import org.joda.time.DateTime
import javax.inject.Inject

class AddMealFromListViewModel : BaseViewModel() {

    @Inject
    lateinit var dao: MealsDao

    @Inject
    lateinit var mealsSetDao: MealsSetDao

    val onInsert = MutableLiveData<Any>()
    private val currentDate = DateTime.now()
    private val queryDate = DateTime(currentDate.year,currentDate.monthOfYear, currentDate.dayOfMonth , 0 ,0)

    var meals: List<MealSet>? = null

    init {
        Injector.component.inject(this)
    }

    fun insert(meal: MealSet) = viewModelScope.launch {
        dao.insert(Meal(
            name = meal.name,
            carbohydrates = meal.carbohydrates,
            fats = meal.fats,
            proteins =  meal.proteins,
            energy = meal.energy,
            date = queryDate.toDate().time
        ))
        onInsert.postValue(true)
    }

    fun filterList(value: String): List<MealSet>{
        return if (value.isNullOrBlank()){
            meals ?: emptyList()
        }else{
            meals?.filter { it.name.toLowerCase().contains(value.toLowerCase()) } ?: emptyList()
        }
    }
}