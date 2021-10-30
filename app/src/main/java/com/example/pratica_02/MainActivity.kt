package com.example.pratica_02

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.SeekBar
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var BarraVermelha: SeekBar
    private lateinit var BarraVerde: SeekBar
    private lateinit var BarraAzul: SeekBar
    private lateinit var tela: View
    private  lateinit var RGB: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        this.BarraVermelha = findViewById(R.id.BarraVermelha)
        this.BarraVermelha.setOnSeekBarChangeListener(OnChange())

        this.BarraVerde = findViewById(R.id.BarraVerde)
        this.BarraVerde.setOnSeekBarChangeListener(OnChange())

        this.BarraAzul = findViewById(R.id.BarraAzul)
        this.BarraAzul.setOnSeekBarChangeListener(OnChange())

        this.tela = findViewById(R.id.TelaRGB)

        this.tela.setBackgroundColor(Color.rgb(this.BarraVermelha.progress, BarraVerde.progress, BarraAzul.progress))

        this.RGB = findViewById(R.id.TelaRGBMudarCor)
        this.RGB.setText(java.lang.Integer.toHexString(Color.rgb(this.BarraVermelha.progress, BarraVerde.progress, BarraAzul.progress)).substring(2,8).toUpperCase())

    }
    inner class OnChange:SeekBar.OnSeekBarChangeListener {
        private lateinit var tela: View
        private lateinit var BarraVermelha: SeekBar
        private lateinit var BarraVerde: SeekBar
        private lateinit var BarraAzul: SeekBar
        private  lateinit var RGB: TextView

        override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) { // toda vez que alterar faz
            this.tela = findViewById(R.id.TelaRGB)
            this.BarraVermelha = findViewById(R.id.BarraVermelha)
            this.BarraVerde = findViewById(R.id.BarraVerde)
            this.BarraAzul = findViewById(R.id.BarraAzul)
            this.RGB = findViewById(R.id.TelaRGBMudarCor)

            this.tela.setBackgroundColor(Color.rgb(this.BarraVermelha.progress, BarraVerde.progress, BarraAzul.progress))

            this.RGB.setText(java.lang.Integer.toHexString(Color.rgb(this.BarraVermelha.progress, BarraVerde.progress, BarraAzul.progress)).substring(2,8).toUpperCase())

        }

        override fun onStartTrackingTouch(seekBar: SeekBar?) {

        }

        override fun onStopTrackingTouch(seekBar: SeekBar?) {

        }
    }




}