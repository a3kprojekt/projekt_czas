package com.example.application.database.dao

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.application.database.model.MealSet

@Dao
interface MealsSetDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(meal: MealSet)

    @Query("SELECT * FROM MealSet")
    fun getAllMeals(): LiveData<List<MealSet>>
}