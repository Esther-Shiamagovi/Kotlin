package com.example.hello

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.hello.databinding.ActivityFourthBirdBinding
import com.example.hello.databinding.ActivityThirdBirdBinding
import com.squareup.picasso.Picasso

class FourthBirdActivity : AppCompatActivity() {
    lateinit var binding: ActivityFourthBirdBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFourthBirdBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnPrev3.setOnClickListener(){
            finish()
        }
        binding.btnNext4.setOnClickListener() {
            val intent = Intent(this, FifthBirdActivity::class.java)
            startActivity(intent)
        }
        Picasso.get().load("https://i.pinimg.com/236x/5a/aa/c1/5aaac1dca23d4e36a18eeb563ba37770.jpg").into(binding.imageView3)
    }
}