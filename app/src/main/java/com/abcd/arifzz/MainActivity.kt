package com.abcd.arifzz


import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val edt1 = findViewById(R.id.editText) as EditText
        val edt2 = findViewById(R.id.editText2) as EditText
        val result = findViewById(R.id.editText3) as TextView
        val btnadd = findViewById(R.id.button1) as Button
        val btnsub = findViewById(R.id.button2) as Button
        val btnmul = findViewById(R.id.button3) as Button
        val btndiv = findViewById(R.id.button4) as Button

//below is the function for button add
        btnadd.setOnClickListener {
            val a: String = edt1.text.toString()
            val b: String = edt2.text.toString()

            if (editText.text.isEmpty() && editText2.text.isEmpty()) {
                Toast.makeText(applicationContext, "Enter the Value", Toast.LENGTH_SHORT).show()
            } else {
                val c = a.toInt()
                val d = b.toInt()
                val e = c + d
                result.setText(e.toString())
            }
        }
//below is the function for button substract
        btnsub.setOnClickListener {
            if (edt1.text.isEmpty() || edt2.text.isEmpty()) {
                Toast.makeText(applicationContext, "Enter the Value", Toast.LENGTH_SHORT).show()
            } else {
                val a: Int = edt1.text.toString().toInt()
                val b: Int = edt2.text.toString().toInt()
                val c: Int = a - b
                result.setText(c.toString())
            }
        }

        //below is the function for button multiplication
        btnmul.setOnClickListener {
            if (edt1.text.isEmpty() || edt2.text.isEmpty()) {
                Toast.makeText(applicationContext, "Enter the Value", Toast.LENGTH_SHORT).show()
            } else {
                val a: Int = edt1.text.toString().toInt()
                val b: Int = edt2.text.toString().toInt()
                val c: Int = a * b
                result.setText(c.toString())
            }
        }
        //below is the function for button divide
        btndiv.setOnClickListener {
            if (edt1.text.isEmpty() || edt2.text.isEmpty()) {
                Toast.makeText(applicationContext, "Enter the Value", Toast.LENGTH_SHORT).show()
            } else {
                val a: Int = edt1.text.toString().toInt()
                val b: Int = edt2.text.toString().toInt()
                val c: Int = a / b
                result.setText(c.toString())
            }
        }
    }
}
