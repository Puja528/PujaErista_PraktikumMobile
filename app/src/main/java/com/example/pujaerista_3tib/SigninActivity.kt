package com.example.pujaerista_3tib

import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.pujaerista_3tib.databinding.ActivitySigninBinding

class SigninActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySigninBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        binding = ActivitySigninBinding.inflate(layoutInflater)
        setContentView(binding.root)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

//        val tombolLogin: Button = findViewById(R.id.btnLogin)
//        val email: EditText = findViewById(R.id.edtEmail)
//        val password: EditText = findViewById(R.id.edtPassword)

        binding.btnGoogle.setOnClickListener {
                Toast.makeText(this, "Tombol Login diklik!", Toast.LENGTH_SHORT).show()
        }
    }
}