package com.example.activity_lifecycle

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.example.activity_lifecycle.databinding.ActivityMainBinding
import kotlinx.coroutines.Delay
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        //Toast.makeText(this, "OnCreate Called" , Toast.LENGTH_LONG).show()
        super.onCreate(savedInstanceState)
        Log.e("Activity LifeCycle", "onCreate() Called")

       //****************************Intent Data send and switch part **************************************************
        /*val input : EditText
        val btnNext : Button
        val text = "Empty"
        val duration = Toast.LENGTH_SHORT

        val toast = Toast.makeText(this, text, duration) // in Activity


        input  = findViewById(R.id.editText)
        btnNext = findViewById(R.id.btnNext)

        btnNext.setOnClickListener{
            val data = input.getText().toString()

            if (data.isNotEmpty()){
                val intent = Intent(this,SecondActivity::class.java)
                intent.putExtra("input", data)
                startActivity(intent)
            }
            else {
                toast.show()
            }
        }*/
        //******************************************************************************************//

        //**************************View Binding **************************************************//

        val text = "Text cannot be empty"
        val duration = Toast.LENGTH_SHORT

        val toast = Toast.makeText(this , text , duration)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.btnNext.setOnClickListener{
            val inputText = binding.editText.text.toString()

            if(inputText.isNotEmpty()){
                val intent = Intent(this, SecondActivity::class.java)
                intent.putExtra("input" , inputText)
                startActivity(intent)
            }
            else{

                toast.show()
            }

        }

    }

        //*******************************************************************************************************//

        //**************************Implementation of Coroutines************************************//

       /* GlobalScope.launch {
                delay(9000L)
            Log.e("Main Activity" , "Coroutine waited one says hello from thread ${Thread.currentThread().name}")
        }

        Log.e("Main Activity" , "Coroutine says hello from thread ${Thread.currentThread().name}")
*/
        //************************************************************************************************//





    override fun onStart() {
        super.onStart()
        //Toast.makeText(this, "OnStart Called" , Toast.LENGTH_LONG).show()
        Log.e("Activity LifeCycle", "onStart() Called")
    }

    override fun onResume() {
        super.onResume()
        //Toast.makeText(this, "OnResume Called" , Toast.LENGTH_LONG).show()
        Log.e("Activity LifeCycle", "OnResume() Called")
    }

    override fun onPause() {
        super.onPause()
        //Toast.makeText(this, "onPause Called" , Toast.LENGTH_LONG).show()
        Log.e("Activity LifeCycle", "onPause() Called")
    }

    override fun onStop() {
        super.onStop()
        //Toast.makeText(this, "onStop Called" , Toast.LENGTH_LONG).show()
        Log.e("Activity LifeCycle", "onStop() Called")
    }

    override fun onRestart() {
        super.onRestart()
        //Toast.makeText(this, "onRestart Called" , Toast.LENGTH_LONG).show()
        Log.e("Activity LifeCycle", "onRestart() Called")
    }

    override fun onDestroy() {
        super.onDestroy()
        //Toast.makeText(this, "OnDestroy Called" , Toast.LENGTH_LONG).show()
        Log.e("Activity LifeCycle", "OnDestroy() Called")
    }

}


