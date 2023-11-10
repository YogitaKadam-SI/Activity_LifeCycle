package com.example.activity_lifecycle

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.activity_lifecycle.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {

    /*lateinit var input2 : TextView
    lateinit var backBtn : Button*/

    private lateinit var binding: ActivitySecondBinding

    override fun onCreate(savedInstanceState: Bundle?) {


        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

       /* input2 = findViewById(R.id.receivedData)
        val str = intent.extras?.getString("")
        input2.setText(str)
        intent.hasExtra("input")

        backBtn = findViewById(R.id.backBtn)
        backBtn.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)

        }*/


        //***********************View Binding usage***************************//

        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val inputText = intent.getStringExtra("input")
        binding.receivedData.text = inputText

        binding.backBtn.setOnClickListener{
            finish()
        }


    }
}