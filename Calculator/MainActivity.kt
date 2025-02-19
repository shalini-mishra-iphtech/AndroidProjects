package com.example.calculatorapp

import android.annotation.SuppressLint
import android.os.Bundle
import android.os.Parcel
import android.os.Parcelable
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity() : AppCompatActivity(), Parcelable {

    constructor(parcel: Parcel) : this() {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {

    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<MainActivity> {
        override fun createFromParcel(parcel: Parcel): MainActivity {
            return MainActivity(parcel)
        }

        override fun newArray(size: Int): Array<MainActivity?> {
            return arrayOfNulls(size)
        }
    }

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val editText1: EditText = findViewById(R.id.id1)
        val editText2: EditText= findViewById(R.id.id2)
        val textView3: TextView = findViewById(R.id.id3)
        val addBtn: Button = findViewById(R.id.Add)
        val subBtn:Button=findViewById(R.id.sub)
        val mulBtn:Button=findViewById(R.id.mul)
        val divBtn:Button=findViewById(R.id.div)

        //set the click listener for the button
        addBtn.setOnClickListener {
            //get the number from textViews ,convert them Integers
            val number1 = editText1.text.toString().toInt()
            val number2 = editText2.text.toString().toInt()

            //perform the addition
            val result = number1 + number2

            //Display the result in third textview
            textView3.text = result.toString()
        }
        subBtn.setOnClickListener{
            //get the number access
            val number1=editText1.text.toString().toInt()
            val number2=editText2.text.toString().toInt()
            val result=number1-number2
            textView3.text=result.toString()
        }
        mulBtn.setOnClickListener{
            val number1=editText1.text.toString().toInt()
            val number2=editText2.text.toString().toInt()
            val result=number1*number2
            textView3.text=result.toString()
        }
        divBtn.setOnClickListener{
            val number1=editText1.text.toString().toInt()
            val number2=editText2.text.toString().toInt()
            val result=number1/number2
            textView3.text=result.toString()
        }


    }
}




