package com.example.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.View.*
import android.widget.Toast
import androidx.core.view.WindowCompat
import kotlinx.android.synthetic.main.activity_main.*

@Suppress("DEPRECATION")
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        window.decorView.systemUiVisibility= SYSTEM_UI_FLAG_FULLSCREEN
        btn_start.setOnClickListener{
            if(et_name.text.toString().isEmpty())
            {
                Toast.makeText(this, "Please enter your name", Toast.LENGTH_SHORT).show()
            }
            else{
                val intent = Intent(this, QuizQuestionsActivity::class.java)//creating an intent to start an activity
                intent.putExtra(Constants.USER_NAME,et_name.text.toString())
                startActivity(intent)//using the intent to start a new actvity
                finish()//closes the current activities
            }
        }
    }
}