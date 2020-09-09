package com.example.application.database.dao

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.example.application.database.model.WorkoutExerciseName

@Dao
interface ExercisesDao {

    @Insert
    suspend fun insert(exercise: WorkoutExerciseName)

    @Query("SELECT * FROM WorkoutExerciseName")
    fun getAll(): LiveData<List<WorkoutExerciseName>>

    @Query("DELETE FROM WorkoutExerciseName WHERE id = :id")
    suspend fun deleteById(id: Long)
}