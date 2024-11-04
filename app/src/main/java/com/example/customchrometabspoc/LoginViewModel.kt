package com.example.customchrometabspoc

import android.content.Context
import androidx.lifecycle.ViewModel

class LoginViewModel: ViewModel() {
    fun openSignUpUrl(context: Context){
        val signUpUrl = BuildConfig.URL
        openUrlInTab(context,signUpUrl)
    }
}
