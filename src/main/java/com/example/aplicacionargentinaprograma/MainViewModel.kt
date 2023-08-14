package com.example.aplicacionargentinaprograma
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    private val _comparisonResult = MutableLiveData<String>()
    val comparisonResult: LiveData<String>
        get() = _comparisonResult

    fun compareStrings(text1: String, text2: String) {
        _comparisonResult.value = if (text1 == text2) "Las cadenas son iguales" else "Las cadenas son diferentes"
    }
}