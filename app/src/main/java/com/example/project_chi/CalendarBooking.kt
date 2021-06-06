package com.example.project_chi
import android.content.Intent
import android.os.Bundle
import android.widget.CalendarView
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton
import com.example.project_chi.R
import de.hdodenhof.circleimageview.CircleImageView


//import kotlinx.android.synthetic.main.activity_calendar_booking.*

class CalendarBooking : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calendar_booking)

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

//        val calendarView = findViewById<CalendarView>(R.id.calendar_view)
        val i = Intent(this, TimeSlots::class.java)
        val buttonContinue = findViewById<AppCompatButton>(R.id.button2)

        // button click listener
        buttonContinue.setOnClickListener {
            // get calendar view selected date
//            val selectedDate:Long = calendarView.date
//            intent.putExtra("date", selectedDate)
            i.putExtra("name", name)
            i.putExtra("job", job)
            i.putExtra("fee", fee)
            i.putExtra("imageId", imageId)
            startActivity(i)

        }

    }

}
