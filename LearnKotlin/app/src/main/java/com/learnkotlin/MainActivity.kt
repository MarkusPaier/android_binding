package com.learnkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import com.learnkotlin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private val myName: MyName = MyName("franz mustermann")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        binding.myName = myName

        //val btnAddNewName = findViewById<Button>(R.id.button_add)
        //btnAddNewName.setOnClickListener { addNickname("matthias") }

        binding.buttonAdd.setOnClickListener { addNickname("matthias") }

        addNickname("markus")
    }

    private fun addNickname(nickname: String) {

        binding.apply {
            textviewText.text = nickname
        }

        //val tvNickname = findViewById<TextView>(R.id.textview_text)
        //tvNickname.text = nickname
    }
}
