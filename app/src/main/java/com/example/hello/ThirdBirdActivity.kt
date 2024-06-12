package com.example.hello

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.hello.databinding.ActivitySecondBirdBinding
import com.example.hello.databinding.ActivityThirdBirdBinding
import com.squareup.picasso.Picasso

class ThirdBirdActivity : AppCompatActivity() {
    lateinit var binding: ActivityThirdBirdBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityThirdBirdBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnPrev2.setOnClickListener(){
            finish()
        }
        binding.btnNext3.setOnClickListener() {
            val intent = Intent(this, FourthBirdActivity::class.java)
            startActivity(intent)
        }

        Picasso.get().load("https://i.pinimg.com/236x/67/3c/16/673c161f3d818ab80e13a55988db5111.jpg")
            .centerCrop()
            .resize(1300,1300)
            .into(binding.imageView10)
    }
}