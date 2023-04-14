package com.emobilis.loginregistration

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class LoginActivity : AppCompatActivity() {
    lateinit var texttoregister:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        texttoregister=findViewById(R.id. Txt_gotoregister)

        texttoregister.setOnClickListener {
            val intent=Intent(packageContext:this,MainActivity::class.java)
            startActivity(intent) 


        }
}