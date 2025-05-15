package com.example.respira



import android.content.Context
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class DiarioActivity : AppCompatActivity() {
    private lateinit var editTexto: EditText
    private lateinit var btnSalvar: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_diario)

        editTexto = findViewById(R.id.editTexto)
        btnSalvar = findViewById(R.id.btnSalvar)

        val prefs = getSharedPreferences("diario", Context.MODE_PRIVATE)

        btnSalvar.setOnClickListener {
            val texto = editTexto.text.toString()
            prefs.edit().putString("entrada", texto).apply()
        }

        editTexto.setText(prefs.getString("entrada", ""))
    }
}
