package com.example.gpa

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener {
           var C1 = editTextNumber.text.toString()
            var C2 = editTextNumber2.text.toString()
            var C3 = editTextNumber3.text.toString()
            var C4 = editTextNumber4.text.toString()
            var C5 = editTextNumber5.text.toString()
            var P1 = editTextNumber6.text.toString()
            var P2 = editTextNumber7.text.toString()
            var P3 = editTextNumber8.text.toString()
            var P4 = editTextNumber9.text.toString()
            var P5 = editTextNumber10.text.toString()

            if (C1 == "" || C2 == "" || C3 == "" || C4 == "" || C5 == "" || P1 == "" || P2 == "" || P3 == "" || P4 == "" || P5 == "" || editTextTextPersonName.text.isEmpty() || editTextTextPersonName2.text.isEmpty() || editTextTextPersonName3.text.isEmpty() || editTextTextPersonName4.text.isEmpty() || editTextTextPersonName5.text.isEmpty())
                return@setOnClickListener Toast.makeText(this@MainActivity, "Plase Input All Text Box Before Press OK!!", Toast.LENGTH_SHORT).show()
            var T = C1.toInt() + C2.toInt() + C3.toInt() + C4.toInt() + C5.toInt()
            textView13.text = T.toString()
            var Sum = 0.0
            Sum += (C1.toDouble() * P1.toDouble()) + (C2.toDouble() * P2.toDouble()) + (C3.toDouble() * P3.toDouble()) + (C4.toDouble() * P4.toDouble()) + (C5.toDouble() * P5.toDouble())
            textView14.text = String.format("%.2f",Sum / T)
        }
            button2.setOnClickListener {
                editTextTextPersonName.text.clear()
                editTextTextPersonName2.text.clear()
                editTextTextPersonName3.text.clear()
                editTextTextPersonName4.text.clear()
                editTextTextPersonName5.text.clear()
                editTextNumber.text.clear()
                editTextNumber2.text.clear()
                editTextNumber3.text.clear()
                editTextNumber4.text.clear()
                editTextNumber5.text.clear()
                editTextNumber6.text.clear()
                editTextNumber7.text.clear()
                editTextNumber8.text.clear()
                editTextNumber9.text.clear()
                editTextNumber10.text.clear()
                textView13.text = ""
                textView14.text = ""
            }
    }
}