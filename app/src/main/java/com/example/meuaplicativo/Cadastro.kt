package com.example.meuaplicativo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Cadastro : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cadastro)

        val botaoSalvar = findViewById<Button>(R.id.btn_salvar)
        botaoSalvar.setOnClickListener {
            finish()
        }
    }
}