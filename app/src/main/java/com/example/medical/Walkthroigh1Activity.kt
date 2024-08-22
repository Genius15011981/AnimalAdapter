package com.example.medical

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class Walkthroigh1Activity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.walcthrough1)

    }

    fun next(view: View) {
        val intent = Intent(this, Walkthroigh2Activity::class.java)
        startActivity(intent)
    }
}