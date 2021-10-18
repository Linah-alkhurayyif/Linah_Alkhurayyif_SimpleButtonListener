package com.example.linah_alkhurayyif_simplebuttonlistener

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
var message ="xml"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        kotlin.setOnClickListener {
            message ="kotlin"
            displayToast(main)
        }
    }
    fun displayToast(view: View){
        Toast.makeText(this,message,Toast.LENGTH_SHORT).show()
        message ="xml"
    }
}