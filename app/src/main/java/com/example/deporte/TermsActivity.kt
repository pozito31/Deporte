package com.example.deporte

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class TermsActivity : AppCompatActivity() {
    @SuppressLint("WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_terms)

        val toolbar: androidx.appcompat.widget.Toolbar = findViewById(R.id.toolbar_terms)
        setSupportActionBar(toolbar)
        toolbar.title=getString(R.string.bar_title_terms)
    }
}