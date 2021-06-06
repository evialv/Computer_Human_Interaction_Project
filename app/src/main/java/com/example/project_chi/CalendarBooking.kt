package com.example.project_chi
import android.content.Intent
import android.os.Bundle
import android.widget.CalendarView
import android.widget.Toast

import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton
import com.example.project_chi.R
import java.util.*

//import kotlinx.android.synthetic.main.activity_calendar_booking.*

class CalendarBooking : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calendar_booking)

        val calendarView = findViewById<CalendarView>(R.id.calendar_view)
        val intent = Intent(this, TimeSlots::class.java)
        val buttonContinue = findViewById<AppCompatButton>(R.id.button2)

        // button click listener
        buttonContinue.setOnClickListener {
            // get calendar view selected date
            val selectedDate:Long = calendarView.date
            Toast.makeText(this, "You selected $selectedDate", Toast.LENGTH_SHORT).show()

            intent.putExtra("date", selectedDate)
            startActivity(intent)

        }

    }

}
