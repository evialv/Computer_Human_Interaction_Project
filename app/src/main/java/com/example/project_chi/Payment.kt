package com.example.project_chi

import android.app.Activity.RESULT_OK
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.widget.AppCompatButton
import de.hdodenhof.circleimageview.CircleImageView

class Payment : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_payment)

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

        var txtSure = findViewById<TextView>(R.id.payment_sure)
        txtSure.setText("By clicking confirm session we will book your session with ${name.toString()} and your card will be charged with ${fee.toString()} for the sesson.")
        var txtSure2 = findViewById<TextView>(R.id.payment_sure_conf)
        txtSure2.setText("Do want us to confirm your session with ${name.toString()}? ")
        var profile_pic2 = findViewById<CircleImageView>(R.id.profile_pic2)
        profile_pic2.setImageResource(imageId)

        val btnConfirm = findViewById<AppCompatButton>(R.id.button5)
        val intent = Intent(this, ConfirmBooking::class.java)
        btnConfirm.setOnClickListener {

            intent.putExtra("name", name)
            intent.putExtra("job", job)
            intent.putExtra("fee", fee)
            intent.putExtra("imageId", imageId)
            startActivity(intent)

        }

    }


}