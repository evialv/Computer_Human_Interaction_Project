package com.example.project_chi
import android.os.Bundle
import android.widget.CalendarView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.project_chi.R
//import kotlinx.android.synthetic.main.activity_calendar_booking.*

class CalendarBooking : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calendar_booking)

        var calendar_view = findViewById<CalendarView>(R.id.calendar_view)

        calendar_view.setOnDateChangeListener(object : CalendarView.OnDateChangeListener {
            override fun onSelectedDayChange(p0: CalendarView, p1: Int, p2: Int, p3: Int) {
                Toast.makeText(
                    this@CalendarBooking,
                    "The selected date is $p3.${p2 + 1}.$p1",
                    Toast.LENGTH_SHORT
                ).show()
            }
        })

    }

}
