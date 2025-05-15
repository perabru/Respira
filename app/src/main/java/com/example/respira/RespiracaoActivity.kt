package com.example.respira


import android.os.Bundle
import android.os.Handler
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class RespiracaoActivity : AppCompatActivity() {
    private lateinit var textRespiracao: TextView
    private val handler = Handler()
    private var etapa = 0

    private val etapas = listOf("Inspire profundamente...", "Segure o ar...", "Expire devagar...")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_respiracao)

        textRespiracao = findViewById(R.id.textRespiracao)
        iniciarRespiracao()
    }

    private fun iniciarRespiracao() {
        etapa = 0
        handler.post(runnable)
    }

    private val runnable = object : Runnable {
        override fun run() {
            textRespiracao.text = etapas[etapa]
            etapa = (etapa + 1) % etapas.size
            handler.postDelayed(this, 4000)
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        handler.removeCallbacks(runnable)
    }
}
