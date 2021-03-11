/*
 * Copyright 2021 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.androiddevchallenge.ui.screen.details

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
