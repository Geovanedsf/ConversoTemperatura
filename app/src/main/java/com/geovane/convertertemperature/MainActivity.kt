package com.geovane.convertertemperature

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.geovane.convertertemperature.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        var view = binding.root

        setContentView(view)

        binding.buttonResult.setOnClickListener{
            converterTemperatura()
        }
    }

    fun converterTemperatura(){
        val temperatura = binding.valortemperatura.text.toString().toDouble()
        val cF = (temperatura * 1.8) + 32
        val cK = temperatura + 273
        val cC = temperatura
        val fC = (temperatura - 32) / 1.8
        val fK = (temperatura + 459.67) * 5 / 9
        val fF = temperatura
        val kC = temperatura - 273
        val kF = ((temperatura- 273) * 9 / 5) + 32
        val kK = temperatura

    when {
        binding.celsius1.isChecked && binding.fahren2.isChecked ->
            binding.resultado.setText("%.2f".format(cF))
        binding.celsius1.isChecked && binding.kelvin2.isChecked ->
            binding.resultado.setText("%.2f".format(cK))
        binding.celsius1.isChecked && binding.celsius2.isChecked ->
            binding.resultado.setText("%.2f".format(cC))
        binding.fahren1.isChecked && binding.celsius2.isChecked ->
            binding.resultado.setText("%.2f".format(fC))
        binding.fahren1.isChecked && binding.kelvin2.isChecked ->
            binding.resultado.setText("%.2f".format(fK))
        binding.fahren1.isChecked && binding.fahren2.isChecked ->
            binding.resultado.setText("%.2f".format(fF))
        binding.kelvin1.isChecked && binding.celsius2.isChecked ->
            binding.resultado.setText("%.2f".format(kC))
        binding.kelvin1.isChecked && binding.fahren2.isChecked ->
            binding.resultado.setText("%.2f".format(kF))
        binding.kelvin1.isChecked && binding.kelvin2.isChecked ->
            binding.resultado.setText("%.2f".format(kK))
    }
    }

    }

