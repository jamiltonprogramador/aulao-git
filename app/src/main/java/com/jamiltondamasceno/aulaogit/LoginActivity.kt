package com.jamiltondamasceno.aulaogit

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.jamiltondamasceno.aulaogit.databinding.ActivityLoginBinding
import com.jamiltondamasceno.aulaogit.databinding.ActivityMainBinding

class LoginActivity : AppCompatActivity() {

    private val binding by lazy {
        ActivityLoginBinding.inflate( layoutInflater )
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView( binding.root )

        binding.btnLogar.setOnClickListener {
            startActivity(
                Intent(this, MainActivity::class.java)
            )
        }

    }
}