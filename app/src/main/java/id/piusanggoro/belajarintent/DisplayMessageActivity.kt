package id.piusanggoro.belajarintent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class DisplayMessageActivity : AppCompatActivity() {

    companion object {
        const val EXTRA_MESSAGE = "extra message"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display_message)

        val message = intent?.extras?.getString(EXTRA_MESSAGE).toString()
        val textView = findViewById<TextView>(R.id.textView)
        textView.text = message
    }
}