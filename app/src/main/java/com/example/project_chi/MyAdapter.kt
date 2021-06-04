package com.example.project_chi

import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView

class MyAdapter(private val context : Activity, private val arrayList : ArrayList<Professional>) :  ArrayAdapter<Professional>(context,
                R.layout.list_item, arrayList) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        val inflater : LayoutInflater = LayoutInflater.from(context)
        val view : View = inflater.inflate(R.layout.list_item, null)

        val imageView : ImageView = view.findViewById(R.id.profile_pic)
        val profName : TextView = view.findViewById(R.id.profName)
        val profJob : TextView = view.findViewById(R.id.profJob)
        val profFee : TextView = view.findViewById(R.id.profFee)

        imageView.setImageResource(arrayList[position].imageId)
        profName.text = arrayList[position].name
        profJob.text = arrayList[position].job
        profFee.text = arrayList[position].fee

        return view

    }

}