package com.example.job19_setya

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val edittext = findViewById<EditText>(R.id.edittext)
        val btn = findViewById<Button>(R.id.button)

        btn.setOnClickListener {
            konversiNilai(edittext.text.toString().toInt())
        }
    }
    fun konversiNilai(edittext: Int) {

        if(edittext >= 86 && edittext <= 100) {
            Toast.makeText(this,"Nilai Kamu = A",Toast.LENGTH_SHORT).show()
        }
        else if(edittext >= 76 && edittext <= 85) {
            Toast.makeText(this,"Nilai Kamu = B",Toast.LENGTH_SHORT).show()
        }
        else if(edittext >= 66 && edittext <= 75) {
            Toast.makeText(this,"Nilai Kamu = C",Toast.LENGTH_SHORT).show()
        }
        else if(edittext >= 51 && edittext <= 65) {
            Toast.makeText(this,"Nilai Kamu = D",Toast.LENGTH_SHORT).show()
        }
        else if(edittext >= 0 && edittext <= 50) {
            Toast.makeText(this,"Nilai Kamu = E",Toast.LENGTH_SHORT).show()
        }
        else {
            Toast.makeText(this,"Nilai Kamu = Lebih Dari Yang Ditentukan",Toast.LENGTH_SHORT).show()
        }
    }
}