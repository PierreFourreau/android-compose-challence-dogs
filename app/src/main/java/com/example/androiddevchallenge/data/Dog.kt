package com.example.androiddevchallenge.data

import androidx.annotation.DrawableRes

data class Dog(
    val id: String,
    val name: String,
    val shelter: String,
    @DrawableRes val drawableId: Int,
    val year: Int,
    val size: String,
    val race: String
)