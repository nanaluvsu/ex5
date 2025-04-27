package com.example.exercicio5

import android.os.Bundle
import android.widget.Toast
import android.content.Intent
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.exercicio5.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        val al = Aluno("dam@aulakotlin.com","24011150")
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.login.setOnClickListener {
            val email = binding.email.text.toString()
            val senha = binding.senha.text.toString()

            if (email.isBlank()) {
                val toast = Toast.makeText(this, "Campo e-mail está vazio.", Toast.LENGTH_SHORT).show()

            } else if (email != al.email ) {
                val toast = Toast.makeText(this, "E-mail não coincide.", Toast.LENGTH_SHORT).show()
            } else if (senha.isBlank()) {
                    val toast = Toast.makeText(this, "Campo senha está vazio.", Toast.LENGTH_SHORT).show()
            } else if (senha != al.senha) {
                    val toast = Toast.makeText(this, "Senha não coincide. ", Toast.LENGTH_SHORT).show()
            } else {
                    val toast = Toast.makeText(this, "eba", Toast.LENGTH_SHORT).show();
                val intent = Intent(this@MainActivity, login::class.java)
                startActivity(intent)
                }
            }
        }
        }


class Aluno (
    val email: String,
    val senha: String
)