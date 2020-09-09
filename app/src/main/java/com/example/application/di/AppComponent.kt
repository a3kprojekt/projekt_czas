package com.example.application.di

import com.example.application.di.module.AppModule
import com.example.application.di.module.DbModule
import com.example.application.viewModel.MainActivityViewModel
import com.example.application.viewModel.home.HomeViewModel
import com.example.application.viewModel.meals.AddMealFromListViewModel
import com.example.application.viewModel.meals.AddMealViewModel
import com.example.application.viewModel.meals.MealsPageViewModel
import com.example.application.viewModel.organizer.OrganizerPageViewModel
import com.example.application.viewModel.organizer.calendar.CalendarPageViewModel
import com.example.application.viewModel.organizer.note.AddNotePageViewModel
import com.example.application.viewModel.organizer.note.NotePageViewModel
import com.example.application.viewModel.organizer.pomodoro.PomodoroActiveViewModel
import com.example.application.viewModel.organizer.pomodoro.PomodoroPageViewModel
import com.example.application.viewModel.raport.ReportPageViewModel
import com.example.application.viewModel.training.exercise.AddExercisePageViewModel
import com.example.application.viewModel.training.exercise.ExercisesPageViewModel
import com.example.application.viewModel.training.newTraining.AddExerciseToNewTrainingPageViewModel
import com.example.application.viewModel.training.newTraining.PageNewTrainingViewModel
import com.example.application.viewModel.training.trainings.PageTrainingsViewModel
import com.example.application.viewModel.training.trainings.StartTrainingPageViewModel
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        DbModule::class,
        AppModule::class
    ]
)
interface AppComponent {
    fun inject(into: MealsPageViewModel)
    fun inject(into: AddMealViewModel)
    fun inject(into: CalendarPageViewModel)
    fun inject(into: NotePageViewModel)
    fun inject(into: AddNotePageViewModel)
    fun inject(into: PomodoroPageViewModel)
    fun inject(into: PomodoroActiveViewModel)
    fun inject(into: OrganizerPageViewModel)
    fun inject(into: MainActivityViewModel)
    fun inject(into: ExercisesPageViewModel)
    fun inject(into: AddExercisePageViewModel)
    fun inject(into: PageNewTrainingViewModel)
    fun inject(into: AddExerciseToNewTrainingPageViewModel)
    fun inject(into: PageTrainingsViewModel)
    fun inject(into: StartTrainingPageViewModel)
    fun inject(into: AddMealFromListViewModel)
    fun inject(into: HomeViewModel)
    fun inject(into: ReportPageViewModel)
}