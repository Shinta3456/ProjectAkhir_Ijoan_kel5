package com.example.ijo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_login.*

class login : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_login)
    val intentButton : Button = findViewById(R.id.button)
    intentButton.setOnClickListener{viewlogin()}

}

    private fun viewlogin() {
        val intent = Intent(this, crud::class.java)
        startActivity(intent)
    }

}

