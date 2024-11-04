package com.example.customchrometabspoc

import android.content.Context
import android.net.Uri
import androidx.browser.customtabs.CustomTabsIntent

fun openUrlInTab(context: Context, url:String){
    val builder = CustomTabsIntent.Builder()
    val customTabsIntent = builder.build()
    customTabsIntent.launchUrl(context, Uri.parse(url))
}