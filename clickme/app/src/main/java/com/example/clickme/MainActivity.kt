package com.example.clickme

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private var button: Button?= null//boton
    private var userInput: EditText?=null //plaintext
    private var textView: TextView?= null
    private var button2: Button?= null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val userInput= findViewById<EditText>(R.id.editText)
        val button: Button= findViewById<Button>(R.id.button)
        textView= findViewById<TextView>(R.id.textView)
        val button2: Button= findViewById<Button>(R.id.button2)

        button?.setOnClickListener(object :View.OnClickListener{
        override fun onClick(p0: View?) {
            textView?.append(userInput.text)
            textView?.append("\n")
            userInput.setText("")
        }
    })
    button2?.setOnClickListener(object: View.OnClickListener{
    override fun onClick(p0: View?) {
        textView?.text = ""
    }
        })
    }
}