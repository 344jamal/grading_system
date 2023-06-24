package com.jamal.gradingsystem

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun ButtonOnClickEvent(view: View) {
        val entermarks = findViewById<EditText>(R.id.txtmarks)
        val grade = findViewById<TextView>(R.id.txtgrade)
        val marks:String = entermarks.text.toString()
        if (marks.toInt() in 80..10){
            grade.text = "Your Grade is A"
            return
        }
        if (marks.toInt() in 75..79){
            grade.text = "Your Grade is B+"
            return
        }
        if (marks.toInt() in 70..74){
            grade.text = "Your Grade is B"
            return
        }
        if (marks.toInt() in 65..69){
            grade.text = "Your Grade is C+"
            return
        }
        if (marks.toInt() in 60..64){
            grade.text = "Your Grade is C"
            return
        }
        if (marks.toInt() in 55..59){
            grade.text = "Your Grade is D+"
            return
        }
        if (marks.toInt() in 50..54){
            grade.text = "Your Grade is D"
            return
        }
        if (marks.toInt() in 0..49){
            grade.text = "Retake the course Unit"
            return
        }
        else{
            grade.text = "Invalid Marks"
        }
    }
}