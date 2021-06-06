package com.example.project_chi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Button
import com.example.project_chi.databinding.ActivityProfessionalBinding
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.internal.NavigationMenuView

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

        val buttonBook = binding.btnBook
        val intent = Intent(this, CalendarBooking::class.java)
        buttonBook.setOnClickListener{
            
            intent.putExtra("name", name)
            intent.putExtra("job", job)
            intent.putExtra("fee", fee)
            intent.putExtra("imageId", imageId)

            startActivity(intent)
        }

        val buttonBack = binding.back
        buttonBack.setOnClickListener{
            finish()
        }


        val mOnNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.home -> {

                    val i = Intent(applicationContext, ProfilesActivity::class.java)
                    i.flags = Intent.FLAG_ACTIVITY_CLEAR_TOP
                    i.putExtra("EXIT", true)
                    startActivity(i)
                    return@OnNavigationItemSelectedListener true
                }
                R.id.settings -> {
                    // put code here
                    return@OnNavigationItemSelectedListener true
                }
                R.id.search -> {
                    // put code here
                    return@OnNavigationItemSelectedListener true
                }
                R.id.user -> {
                    // put code here
                    return@OnNavigationItemSelectedListener true
                }
            }
            false
        }

        val menuBar = binding.bottomNav
        menuBar.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)

    }

}