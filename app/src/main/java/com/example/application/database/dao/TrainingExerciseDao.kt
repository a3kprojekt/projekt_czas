package com.example.application.database.dao

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.example.application.database.model.WorkoutExercise

@Dao
interface TrainingExerciseDao {
    @Insert
    suspend fun insert(workoutExercise: WorkoutExercise)

    @Query("SELECT * FROM workoutexercise WHERE parentId =:id")
    fun getAllByParentId(id: Long): LiveData<List<WorkoutExercise>>

    @Query("SELECT * FROM workoutexercise")
    fun getAll(): LiveData<List<WorkoutExercise>>

    @Query("UPDATE workoutexercise SET done =:status WHERE id =:id")
    suspend fun updateStatus(id: Long, status: Boolean)

    @Query("DELETE FROM workoutexercise WHERE id= :id")
    suspend fun deleteById(id: Long)

    @Query("DELETE FROM workoutexercise WHERE parentId= :id")
    suspend fun deleteByParentId(id: Long)
}