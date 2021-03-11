package com.example.androiddevchallenge.ui.screen.details

import android.util.Log
import androidx.lifecycle.ViewModel
import com.example.androiddevchallenge.R
import com.example.androiddevchallenge.data.Dog
import com.example.androiddevchallenge.data.DogList
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

class DetailsViewModel : ViewModel() {

    private val emptyDog = Dog(
        id = "",
        name = "",
        shelter = "",
        drawableId = R.drawable.ic_launcher_background,
        year = 0,
        size = "",
        race = ""
    )
    private val _dog = MutableStateFlow(emptyDog)
    val dog = _dog.asStateFlow()

    fun initDetails(id: String) {
        DogList.getList().find { it.id == id }?.let { foundedDog ->
            _dog.value = foundedDog
        }
    }
}