package com.example.respira

import android.media.MediaPlayer
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class SomRelaxanteActivity : AppCompatActivity() {
    private var player: MediaPlayer? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_som_relaxante)

        val btnTocarSom = findViewById<Button>(R.id.btnTocarSom)
        val btnPararSom = findViewById<Button>(R.id.btnPararSom)

        player = MediaPlayer.create(this, R.raw.chuva) // coloque um arquivo 'chuva.mp3' em res/raw

        btnTocarSom.setOnClickListener {
            player?.start()
        }

        btnPararSom.setOnClickListener {
            player?.pause()
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        player?.release()
    }
}
