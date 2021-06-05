package com.example.bibliotecaonline

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.content.Intent
import com.example.bibliotecaonline.login.ui.login.LoginActivity


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonLogIn= findViewById<Button>(R.id.login_button)
        buttonLogIn.setOnClickListener{
           val intent= Intent(this, LoginActivity::class.java )
            startActivity(intent)
        }
        val buttonRegister=findViewById<Button>(R.id.register_button)
        buttonRegister.setOnClickListener{
            //val intent=Intent(this,RegisterActivity::class.java)
            //startActivity(intent)
        }


    }
}