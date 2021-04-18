package com.example.covidhelper

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var remd : ImageView = findViewById(R.id.imageView)
        var remd_text :TextView = findViewById(R.id.textView2)
        var remd_desc : TextView = findViewById(R.id.textView3)

        var bed : ImageView = findViewById(R.id.imageView2)
        var bed_text :TextView = findViewById(R.id.textView4)
        var bed_desc : TextView = findViewById(R.id.textView5)

        var plasma_ : ImageView = findViewById(R.id.imageView3)
        var plasma_text :TextView = findViewById(R.id.textView6)
        var plasma_desc : TextView = findViewById(R.id.textView7)

        var call:ImageView = findViewById(R.id.imageView6)
        var call_text :TextView = findViewById(R.id.textView10)



        remd.setOnClickListener {
            val intent = Intent(this@MainActivity, remdesivir::class.java)
            startActivity(intent)
        }
        remd_text.setOnClickListener{
            val intent = Intent(this@MainActivity, remdesivir::class.java)
            startActivity(intent)
        }
        remd_desc.setOnClickListener{
            val intent = Intent(this@MainActivity, remdesivir::class.java)
            startActivity(intent)
        }
        bed.setOnClickListener {
            val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://coronabeds.jantasamvad.org/"))
            startActivity(browserIntent)
        }
        bed_text.setOnClickListener{
            val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://coronabeds.jantasamvad.org/"))
            startActivity(browserIntent)
        }
        bed_desc.setOnClickListener{
            val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://coronabeds.jantasamvad.org/"))
            startActivity(browserIntent)
        }
        plasma_.setOnClickListener {
            val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse("http://dhoondh.com/"))
            startActivity(browserIntent)
        }
        plasma_text.setOnClickListener{
            val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse("http://dhoondh.com/"))
            startActivity(browserIntent)
        }
        plasma_desc.setOnClickListener{
            val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse("http://dhoondh.com/"))
            startActivity(browserIntent)

        }

        call.setOnClickListener {
            val intent = Intent(Intent.ACTION_DIAL)
            intent.data = Uri.parse("tel:" + "+911123978046")
            startActivity(intent)
        }
        call_text.setOnClickListener {
            val intent = Intent(Intent.ACTION_DIAL)
            intent.data = Uri.parse("tel:" + "+911123978046")
            startActivity(intent)
        }

    }
}