package com.example.unilibrary

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.core.content.ContextCompat.startActivity
import kotlinx.android.synthetic.main.activity_student.*

class StudentActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_student)

            edit_button.setOnClickListener {
            val intent = Intent(this, AdmActivity::class.java)
            startActivity(intent)
        }

      }
    }
