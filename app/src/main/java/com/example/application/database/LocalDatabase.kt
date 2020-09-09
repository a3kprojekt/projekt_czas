package com.example.application.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.application.database.dao.*
import com.example.application.database.model.*

@Database(
    entities = [Meal::class, MealSet::class, EventDay::class, Note::class, Pomodoro::class, WorkoutExerciseName::class, WorkoutExercises::class, WorkoutExercise::class],
    version = 4
)

abstract class LocalDatabase : RoomDatabase() {
    abstract fun mealsDao(): MealsDao
    abstract fun mealsSetDao(): MealsSetDao
    abstract fun eventDao(): EventDao
    abstract fun noteDao(): NoteDao
    abstract fun pomodoroDao(): PomodoroDao
    abstract fun exercisesDao(): ExercisesDao
    abstract fun trainingDao(): TrainingDao
    abstract fun trainingExercisesDao(): TrainingExerciseDao
}