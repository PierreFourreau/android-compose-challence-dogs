package com.example.androiddevchallenge.ui.screen.list

import androidx.lifecycle.ViewModel
import com.example.androiddevchallenge.data.DogList
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

class MainViewModel : ViewModel() {

    private val _dogs = MutableStateFlow(DogList.getList())
    val dogs = _dogs.asStateFlow()
}