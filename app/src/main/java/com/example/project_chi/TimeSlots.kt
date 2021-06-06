package com.example.project_chi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.widget.AppCompatButton
import androidx.cardview.widget.CardView
import de.hdodenhof.circleimageview.CircleImageView

class TimeSlots : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_time_slots)

        val name = intent.getStringExtra("name")
        val job = intent.getStringExtra("job")
        val fee = intent.getStringExtra("fee")
        val imageId = intent.getIntExtra("imageId", R.drawable.prof3)

        val photo = findViewById<CircleImageView>(R.id.profile_pic)
        val proname = findViewById<TextView>(R.id.profName)
        val projob = findViewById<TextView>(R.id.profJob)

        photo.setImageResource(imageId)
        proname.setText(name.toString())
        projob.setText(job.toString())

        val slot1 = findViewById<CardView>(R.id.slot1)
        val slot2 = findViewById<CardView>(R.id.slot2)
        val slot3 = findViewById<CardView>(R.id.slot3)
        val slot4 = findViewById<CardView>(R.id.slot4)
        val slot5 = findViewById<CardView>(R.id.slot5)
        val slot6 = findViewById<CardView>(R.id.slot6)

        click(slot1, name.toString(), job.toString(), fee.toString(), imageId)
        click(slot2, name.toString(), job.toString(), fee.toString(), imageId)
        click(slot3, name.toString(), job.toString(), fee.toString(), imageId)
        click(slot4, name.toString(), job.toString(), fee.toString(), imageId)
        click(slot5, name.toString(), job.toString(), fee.toString(), imageId)
        click(slot6, name.toString(), job.toString(), fee.toString(), imageId)

    }

    fun click(view: View, name: String, job: String, fee: String, imageId: Int){
        val slot = view as AppCompatButton
        val intent = Intent(this, Payment::class.java)
        slot.setOnClickListener {
            intent.putExtra("name", name)
            intent.putExtra("job", job)
            intent.putExtra("fee", fee)
            intent.putExtra("imageId", imageId)
            startActivity(intent)

        }
    }

}