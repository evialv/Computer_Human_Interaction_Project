package com.example.project_chi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.widget.AppCompatButton
import androidx.cardview.widget.CardView
import com.google.android.material.bottomnavigation.BottomNavigationView
import de.hdodenhof.circleimageview.CircleImageView

class TimeSlots : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_time_slots)

        val name = intent.getStringExtra("name")
        val job = intent.getStringExtra("job")
        val fee = intent.getStringExtra("fee")
        val imageId = intent.getIntExtra("imageId", R.drawable.prof3)

        var photo = findViewById<CircleImageView>(R.id.profile_pic)
        var proname = findViewById<TextView>(R.id.profName)
        var projob = findViewById<TextView>(R.id.profDesc)

        photo.setImageResource(imageId)
        proname.setText(name.toString())
        projob.setText(job.toString())

        val slot1 = findViewById<AppCompatButton>(R.id.slot1)
        val slot2 = findViewById<AppCompatButton>(R.id.slot2)
        val slot3 = findViewById<AppCompatButton>(R.id.slot3)
        val slot4 = findViewById<AppCompatButton>(R.id.slot4)
        val slot5 = findViewById<AppCompatButton>(R.id.slot5)
        val slot6 = findViewById<AppCompatButton>(R.id.slot6)

        val confirmbtn = findViewById<AppCompatButton>(R.id.button3)

        click(slot1, name.toString(), job.toString(), fee.toString(), imageId, confirmbtn)
        click(slot2, name.toString(), job.toString(), fee.toString(), imageId, confirmbtn)
        click(slot3, name.toString(), job.toString(), fee.toString(), imageId, confirmbtn)
        click(slot4, name.toString(), job.toString(), fee.toString(), imageId, confirmbtn)
        click(slot5, name.toString(), job.toString(), fee.toString(), imageId, confirmbtn)
        click(slot6, name.toString(), job.toString(), fee.toString(), imageId, confirmbtn)

    }

    fun click(view: View, name: String, job: String, fee: String, imageId: Int, confirmbtn: AppCompatButton ){
        val slot = view as AppCompatButton
        val hours = slot.text.toString()
        val intent = Intent(this, Payment::class.java)
        slot.setOnClickListener {

            Toast.makeText(this, "You picked $hours session", Toast.LENGTH_SHORT).show()

            confirmbtn.setOnClickListener {
                intent.putExtra("name", name)
                intent.putExtra("job", job)
                intent.putExtra("fee", fee)
                intent.putExtra("imageId", imageId)
                startActivity(intent)
            }

        }
    }

}