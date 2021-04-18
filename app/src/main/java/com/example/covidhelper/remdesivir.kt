package com.example.covidhelper

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class remdesivir : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_remdesivir)

        var but : Button = findViewById(R.id.button)

        but.setOnClickListener {
            val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.cipla.com/sites/default/files/Remdesivir-Distributor-List.pdf"))
            startActivity(browserIntent)
        }
    }

}

