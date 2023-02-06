package com.example.googlefulllayout

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.googlefulllayout.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Creamos un array con todos los botones y CardViews
        val array = arrayListOf(binding.imageButton5, binding.imageButton7, binding.imageButton6, binding.CardView1, binding.CardView2, binding.CardView3, binding.imageButton3, binding.imageButton4)

        // A cada elemento del array le asignamos un listener que nos lleve a la ActivityEmptyTemp
        for (i in array){
            i.setOnClickListener {
                val intent = Intent(this, ActivityEmptyTemp::class.java)
                startActivity(intent)
            }
        }
    }
}