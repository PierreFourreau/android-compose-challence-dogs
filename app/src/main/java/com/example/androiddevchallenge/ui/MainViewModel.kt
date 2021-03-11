package com.example.androiddevchallenge.ui

import androidx.lifecycle.ViewModel
import com.example.androiddevchallenge.R
import com.example.androiddevchallenge.data.Dog
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

class MainViewModel : ViewModel() {

    val DOGS = arrayListOf(
        Dog(
            "Alyssa",
            "Refuge la ferme des arches",
            R.drawable.alyssa,
            4,
            "Large",
            "Border Collie"
        ),
        Dog(
            "Anna",
            "Refuge la Loue",
            R.drawable.anna,
            6,
            "Medium",
            "Unknown"
        ),
        Dog(
            "Isaac",
            "Refuge la Rochette",
            R.drawable.isaac,
            3,
            "Medium",
            "Herdsman"
        ),
        Dog(
            "James",
            "Refuge Le Moulin d'en Haut",
            R.drawable.james,
            5,
            "Large",
            "Brachet"
        ),
        Dog(
            "Jamie",
            "Maison SPA",
            R.drawable.jamie,
            2,
            "Small",
            "Spaniel"
        ),
        Dog(
            "Jaycee",
            "Refuge la ferme des arches",
            R.drawable.jaycee,
            4,
            "Medium",
            "Shiba Inu"
        ),
        Dog(
            "Marliese",
            "Refuge la Rochette",
            R.drawable.marliese,
            3,
            "Small",
            "Beagle"
        ),
    )

    private val _dogs = MutableStateFlow(DOGS)
    val dogs = _dogs.asStateFlow()
}