package com.ehehe.flowera

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class DetailFlower: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_flower)

        var tvSetName: TextView = findViewById(R.id.set_name)
        val tvSetDetail: TextView = findViewById(R.id.set_detail)
        val setPhoto: ImageView = findViewById(R.id.img_flower)

        val lName = intent.getStringExtra(EXTRA_NAME)
        val lDetail = intent.getStringExtra(EXTRA_DETAIL)
        val lPhoto = intent.getIntExtra(EXTRA_PHOTO, 0)

        tvSetName.text = lName

        Glide.with(this)
            .load(lPhoto)
            .apply(RequestOptions())
            .into(setPhoto)
        tvSetDetail.text = lDetail
    }

    companion object{
        const val EXTRA_NAME = "extra_name"
        const val EXTRA_DETAIL = "extra_detail"
        const val EXTRA_PHOTO = "extra_photo"
    }
}