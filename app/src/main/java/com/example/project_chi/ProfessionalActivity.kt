package com.example.project_chi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.project_chi.databinding.ActivityProfessionalBinding

class ProfessionalActivity : AppCompatActivity() {

    private lateinit var binding : ActivityProfessionalBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityProfessionalBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val name = intent.getStringExtra("name")
        val job = intent.getStringExtra("job")
        val fee = intent.getStringExtra("fee")
        val imageId = intent.getIntExtra("imageId", R.drawable.prof3)

        // set data to activity's elements
        binding.profName.text = name
        binding.profJob.text = job
        binding.profFee.text = fee
        binding.profilePic.setImageResource(imageId)

        val buttonactiviy :Button= findViewById(R.id.btnBook)
        buttonactiviy.setOnClickListener{
            val intent = Intent(this, CalendarBooking::class.java)
            intent.putExtra("name", name)
            intent.putExtra("job", job)
            intent.putExtra("fee", fee)
            intent.putExtra("imageId", imageId)

            startActivity(intent)
        }
    }
}