package com.example.unilibrary

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_adm.*
import kotlinx.android.synthetic.main.activity_student.*

class AdmActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_adm)

        button2.setOnClickListener {

            val nome = cadastro_nome_livro.text.toString()
            val codigo = cadastro_codigo_livro.text.toString().toInt()
            if (nome.isNotEmpty()) {
                varGlobal.set(codigo,nome);
            } else {
                cadastro_nome_livro.error = "Preencha um nome"
            }

        }
    }
}
