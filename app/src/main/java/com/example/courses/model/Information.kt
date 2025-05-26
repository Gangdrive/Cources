package com.example.courses.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Information(
    @DrawableRes val image: Int,
    @StringRes val courseName: Int,
    @StringRes val numberOfAssociatedCourses: Int
)
