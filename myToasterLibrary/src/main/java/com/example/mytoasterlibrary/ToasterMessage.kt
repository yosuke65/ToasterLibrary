package com.example.mytoasterlibrary

import android.content.Context
import android.widget.Toast

class ToasterMessage() {
    companion object{
        fun t (context: Context, message:String){
            Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
        }
    }
}