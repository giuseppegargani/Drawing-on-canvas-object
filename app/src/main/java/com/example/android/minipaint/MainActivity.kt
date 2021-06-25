package com.example.android.minipaint

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

//TODO RIASSUNTO DEI TASKS

/*TODO - 1 Si aggiungono due colori nel file delle risorse dei colori
    <color name="colorBackground">#FFFF5500</color>
    <color name="colorPaint">#FFFFEB3B</color>
 */

/* TODO - 2 Rimuovi l'ActionBar
    Nel genitore del stile AppTheme rimpiazza DarkActionBar con NoActionBar

 */

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}