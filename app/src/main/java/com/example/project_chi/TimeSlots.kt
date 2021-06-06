package com.example.project_chi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.cardview.widget.CardView

class TimeSlots : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_time_slots)

        val date = intent.getStringExtra("date")

        val card1 = findViewById<CardView>(R.id.card1)
        val card2 = findViewById<CardView>(R.id.card2)
        val card3 = findViewById<CardView>(R.id.card3)
        val card4 = findViewById<CardView>(R.id.card4)
        val card5 = findViewById<CardView>(R.id.card5)
        val card6 = findViewById<CardView>(R.id.card6)





    }

//    fun click(view: View){
//        val card = view as CardView
//
//        val time = card.get
//        println("NumberClickes : $numberClicked")
//
//        if (numberClicked == correctAns){ //Αν ο χρήστης έχει επιλέξει τη σωστή απάντηση
//            totalCorrect = totalCorrect + 1
//            Toast.makeText(this, "Total Correct : $totalCorrect", Toast.LENGTH_SHORT).show()
//        } else {
//            totalWrong = totalWrong + 1
//            Toast.makeText(this, "Total Wrong : $totalWrong", Toast.LENGTH_SHORT).show()
//        }
//        quiz()
//    }

}