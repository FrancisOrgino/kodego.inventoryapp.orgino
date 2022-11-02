package com.kodego.app.inventory.app.orgino.francis

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.kodego.app.inventory.app.orgino.francis.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button5.setOnClickListener() {
            var userName: String = binding.editTextTextPersonName.text.toString()
            var passWord: String = binding.editTextTextPassword.text.toString()


            checkCredential(userName, passWord)
        }
    }

    fun checkCredential(userName:String,passWord:String):Boolean{
        val correctUserName: String = "admin"
        val correctPassWord: String = "admin123"

        if ((correctUserName == userName)&&(correctPassWord == passWord)){

            val intent = Intent(this,HomeActivity::class.java)
            startActivity(intent)
            finish()
            Toast.makeText(applicationContext,"You are logged in",Toast.LENGTH_SHORT).show()
            return true
        }else{
            Toast.makeText(applicationContext,"Invalid Credentials",Toast.LENGTH_SHORT).show()
            return false
        }
    }

}
