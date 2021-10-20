package com.example.temperatureconverter.utils

fun Double.round3Digits() = String.format("%.3f", this).toDouble()