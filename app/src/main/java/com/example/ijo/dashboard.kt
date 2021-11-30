package com.example.ijo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_dashboard.*
import kotlinx.android.synthetic.main.activity_login.*


class dashboard : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

        val IntentButtonlogin: Button = findViewById(R.id.calathea)
        IntentButtonlogin.setOnClickListener { viewLogin() }
    } private fun viewLogin() {
        val intentbtn = Intent(this, crud::class.java)
        startActivity(intentbtn)
    }


    }






