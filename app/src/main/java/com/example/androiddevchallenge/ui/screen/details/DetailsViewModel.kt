package com.example.androiddevchallenge.ui.screen.details

import androidx.lifecycle.ViewModel
import com.example.androiddevchallenge.R
import com.example.androiddevchallenge.data.Dog
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

class DetailsViewModel : ViewModel() {

    private val fakeDog = Dog(
        "Alyssa",
        "Refuge la ferme des arches",
        R.drawable.alyssa,
        4,
        "Large",
        "Border Collie"
    )

    private val _dog = MutableStateFlow(fakeDog)
    val dog = _dog.asStateFlow()
}