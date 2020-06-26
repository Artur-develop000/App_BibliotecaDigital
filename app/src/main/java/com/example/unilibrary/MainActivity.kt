package com.example.unilibrary

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener {
            val usuario = text_user.text.toString();
            val senha = text_password.text.toString();

            if (usuario.isEmpty()) {
                text_user.error = "Digite seu usuário"
            }else if(senha.isEmpty()){
                text_password.error = "Digite sua senha"}

             if ((usuario == "admin") && (senha == "12345")) {
                val intent = Intent(this, StudentActivity::class.java)
                startActivity(intent)
            }else
                text_user.text.clear();
                text_password.text.clear();

        }
    }
}
