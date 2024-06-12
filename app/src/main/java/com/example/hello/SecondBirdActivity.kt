package com.example.hello

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.hello.databinding.ActivityMainBinding
import com.example.hello.databinding.ActivitySecondBirdBinding
import com.squareup.picasso.Picasso

class SecondBirdActivity : AppCompatActivity() {
    lateinit var binding: ActivitySecondBirdBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBirdBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnPrev.setOnClickListener(){
            finish()
        }
        binding.btnNext2.setOnClickListener(){
            val intent = Intent(this,ThirdBirdActivity::class.java)
            startActivity(intent)
        }


        Picasso.get().load("https://i.pinimg.com/236x/56/a8/e2/56a8e203296d4373b05b88b7b609446a.jpg")
            .centerCrop()
            .resize(500,500)
            .into(binding.imageView9)
    }

}