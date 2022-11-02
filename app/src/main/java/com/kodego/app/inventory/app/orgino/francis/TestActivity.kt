package com.kodego.app.inventory.app.orgino.francis

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.kodego.app.inventory.app.orgino.francis.databinding.ActivityTestBinding

class TestActivity : AppCompatActivity() {

    lateinit var binding: ActivityTestBinding
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTestBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnGetName.setOnClickListener(){
            Toast.makeText(applicationContext, "Hello World",Toast.LENGTH_LONG).show()
        }

        binding.radioGroup.setOnCheckedChangeListener { radioGroup, checkedOption ->
            when(checkedOption){
            R.id.radioButton -> Toast.makeText(applicationContext,"option 1 selected", Toast.LENGTH_LONG).show()
            R.id.radioButton2 -> Toast.makeText(applicationContext,"option 2 selected", Toast.LENGTH_LONG).show()
            R.id.radioButton3 -> Toast.makeText(applicationContext,"option 3 selected",Toast.LENGTH_LONG).show()
            }
        }
    }
}