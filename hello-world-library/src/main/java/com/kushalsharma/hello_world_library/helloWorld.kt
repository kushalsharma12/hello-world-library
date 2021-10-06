package com.kushalsharma.hello_world_library

import android.content.Context
import android.widget.Toast

fun helloWorld(text : String, context : Context){
    Toast.makeText(context, text, Toast.LENGTH_SHORT).show()
}