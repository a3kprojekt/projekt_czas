package com.example.application.viewModel.organizer.pomodoro

import androidx.lifecycle.viewModelScope
import com.example.application.base.BaseViewModel
import com.example.application.database.dao.PomodoroDao
import com.example.application.database.model.Pomodoro
import com.example.application.database.model.PomodoroStatus
import com.example.application.di.Injector
import kotlinx.coroutines.launch
import javax.inject.Inject

class PomodoroPageViewModel : BaseViewModel() {

    @Inject
    lateinit var pomodoroDao: PomodoroDao

    init {
        Injector.component.inject(this)
    }

    fun insert(sessionCount: Int, sessionLength: Long, breakLength: Long) = viewModelScope.launch {
        val p = Pomodoro(
            sessionCount = sessionCount,
            sessionLength = sessionLength,
            breakLength = breakLength,
            status = PomodoroStatus.ACTIVE.ordinal,
            startTime = System.currentTimeMillis()
        )

        pomodoroDao.insert(p)
    }

}