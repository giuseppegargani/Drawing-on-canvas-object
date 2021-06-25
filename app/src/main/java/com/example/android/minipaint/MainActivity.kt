package com.example.android.minipaint

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

//TODO RIASSUNTO DEI TASKS

/*TODO - 1 Crea la classe MyCanvasView
Che prende un parametro di tipo Context e restituisce una View (che ha come argomento lo stesso context)!!!!

 */


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}