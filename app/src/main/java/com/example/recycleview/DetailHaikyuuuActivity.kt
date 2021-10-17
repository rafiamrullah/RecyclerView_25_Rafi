package com.example.recycleview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class DetailHaikyuuuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_haikyuuu)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val haikyuuu = intent.getParcelableExtra<Haikyuuu>(MainActivity.INTENT_PARCELABLE)

        val imgHaikyuuu = findViewById<ImageView>(R.id.img_item_photo)
        val nameHaikyuuu = findViewById<TextView>(R.id.tv_item_name)
        val descHaikyuuu = findViewById<TextView>(R.id.tv_item_description)

        imgHaikyuuu.setImageResource(haikyuuu?.imgHaikyuuu!!)
        nameHaikyuuu.text = haikyuuu.nameHaikyuuu
        descHaikyuuu.text = haikyuuu.descHaikyuuu


    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}