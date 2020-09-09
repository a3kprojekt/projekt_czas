package com.example.application.model

import org.joda.time.LocalDateTime

data class CalendarDay(val day: LocalDateTime, var isEvent:Boolean = false)