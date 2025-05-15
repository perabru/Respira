package com.example.respira

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnRespiracao = findViewById<Button>(R.id.btnRespiracao)
        val btnSom = findViewById<Button>(R.id.btnSom)
        val btnDiario = findViewById<Button>(R.id.btnDiario)

        btnRespiracao.setOnClickListener {
            startActivity(Intent(this, RespiracaoActivity::class.java))
        }

        btnSom.setOnClickListener {
            startActivity(Intent(this, SomRelaxanteActivity::class.java))
        }

        btnDiario.setOnClickListener {
            startActivity(Intent(this, DiarioActivity::class.java))
        }
    }
}
