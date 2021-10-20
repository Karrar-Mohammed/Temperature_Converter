package com.example.temperatureconverter

import android.view.View
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.databinding.BindingAdapter
import com.example.temperatureconverter.utils.round3Digits

@BindingAdapter(value = ["customBackground"])
fun setBackgroundColor(view: View, fahrenheit: String){
    if (fahrenheit.isEmpty()) {
        view.setBackgroundColor(ContextCompat.getColor(view.context, R.color.white))
    } else {
        val celsius = convertFahrenheitToCelsius(fahrenheit).toInt()
        when (celsius) {
            in Int.MIN_VALUE..0 ->
                view.setBackgroundColor(ContextCompat.getColor(view.context, R.color.blue))
            in 0..20 ->
                view.setBackgroundColor(ContextCompat.getColor(view.context, R.color.green))
            in 21..30 ->
                view.setBackgroundColor(ContextCompat.getColor(view.context, R.color.yellow))
            in 31..40 ->
                view.setBackgroundColor(ContextCompat.getColor(view.context, R.color.orange))
            in 40..Int.MAX_VALUE ->
                view.setBackgroundColor(ContextCompat.getColor(view.context, R.color.red))
        }
    }
}

@BindingAdapter(value = ["setCelsius"])
fun setCelsius(textView: TextView, fahrenheit: String){
    if (fahrenheit.isEmpty()){
        textView.text = ""
    } else {
        textView.text = convertFahrenheitToCelsius(fahrenheit).toString()
    }

}


private fun convertFahrenheitToCelsius(fahrenheit: String): Double {
    val temperature = fahrenheit.toDouble()
    return ((temperature - 32) / 1.8).round3Digits()
}








