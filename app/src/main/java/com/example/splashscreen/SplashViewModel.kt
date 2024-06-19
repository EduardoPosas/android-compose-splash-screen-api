package com.example.splashscreen

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class SplashViewModel : ViewModel() {
    val _splashShow = MutableStateFlow(false)
    val splashShow: StateFlow<Boolean> = _splashShow.asStateFlow()

    init {
        viewModelScope.launch {
            // not recommended exceed 1000ms
            delay(1000L)
            _splashShow.value = false
        }
    }
}