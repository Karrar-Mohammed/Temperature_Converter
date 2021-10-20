package com.example.temperatureconverter.viewModels

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow

class MainViewModel : ViewModel() {

    val fahrenheit = MutableStateFlow<String>("32")

}