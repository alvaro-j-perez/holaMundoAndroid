package com.example.holamundo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //Log.i(tag: "MAIN" msg: "onCreate")
        val button = findViewById<Button>(R.id.btnEnviar);
        button.setOnClickListener(){
            val inputNombre = findViewById<TextView>(R.id.txtName)
            val inputMensaje = findViewById<TextView>(R.id.Mensaje)
            inputMensaje.text = "Hola" + inputNombre.text
            val toast = toast.makeText(applicationContext, "hola" + imputNombre.text, Toast.LENGTH_LONG)
            toast.show()
        }
    }
}