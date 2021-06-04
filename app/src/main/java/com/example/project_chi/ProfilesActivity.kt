package com.example.project_chi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.ListView
import com.example.project_chi.databinding.ActivityMainBinding
import com.example.project_chi.databinding.ActivityProfilesBinding

class ProfilesActivity : AppCompatActivity() {

    private lateinit var binding : ActivityProfilesBinding
    private lateinit var profArrayList : ArrayList<Professional>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityProfilesBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val imageId= intArrayOf(
            R.drawable.prof2,R.drawable.prof2,R.drawable.prof2,R.drawable.prof2,R.drawable.prof2,
            R.drawable.prof2,R.drawable.prof2,R.drawable.prof2,R.drawable.prof2
        )

        val name= arrayOf(
            "Jane Doe",
            "Creg Williams",
            "Kate Johne",
            "Mary Roal",
            "Mike Kolt",
            "Tiana James",
            "John Bryl",
            "Anna Borris",
            "Ellie Lorne"
        )

        val job = arrayOf(
            "Software Engineer at Microsoft",
            "Software Engineer at Accenture",
            "Software Engineer at Linkedin",
            "Software Engineer at Facebook",
            "Software Engineer at Twitter",
            "Software Engineer at Deloitte",
            "Software Engineer at Vodafone",
            "Software Engineer at Google",
            "Software Engineer at Cisco"
        )

        val fee = arrayOf(

            "50$/hour",
            "50$/hour",
            "100$/hour",
            "50$/hour",
            "50$/hour",
            "50$/hour",
            "50$/hour",
            "100$/hour",
            "100$/hour"
        )

        // initialize array list
        profArrayList = ArrayList()
        for(i in name.indices){

            val professional = Professional(name[i], job[i], fee[i], imageId[i])
            profArrayList.add(professional) // contains all data about professional's profiles

        }

        binding.listview.isClickable = true //enabling on click feature
        binding.listview.adapter = MyAdapter(this, profArrayList)
        // click feature
        // position - where the user has clicked
        binding.listview.setOnItemClickListener{ parent, view, position, id->

            val name = name[position]
            val job = job[position]
            val fee = fee[position]
            val imageId = imageId[position]

            // send the data to the next activity with the profile
            val i = Intent(this, ProfessionalActivity::class.java)
            i.putExtra("name", name)
            i.putExtra("job", job)
            i.putExtra("fee", fee)
            i.putExtra("imageId", imageId)
            startActivity(i)

        }

    }
}