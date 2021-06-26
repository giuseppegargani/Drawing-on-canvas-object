package com.example.android.minipaint

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

//TODO RIASSUNTO DEI TASKS

/*TODO - 1 Crea una nuova stringa "canvasContentDescription"
    <string name="canvasContentDescription">Mini Paint is a simple line drawing app.
   Drag your fingers to draw. Rotate the phone to clear.</string>
 */

/*TODO - 2 Crea una istanza di MyCanvasView
    (prima si deve cancellare setContentView)
    val myCanvasView = MyCanvasView(this)
 */

/*TODO - 3 Richiedi lo schermo completo per il canvas
    myCanvasView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN
 */

/* TODO - 4 Aggiungi una descrizione del contenuto
    myCanvasView.contentDescription = getString(R.string.canvasContentDescription)
 */

/* TODO - 5 Carica myCanvasView come view associata
    setContentView(myCanvasView)
 */

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}