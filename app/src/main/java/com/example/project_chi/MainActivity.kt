package com.example.project_chi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonLogin = findViewById<Button>(R.id.login)
        val txtEmail: EditText = findViewById<EditText>(R.id.username)
        val txtPassword: EditText = findViewById<EditText>(R.id.password)

        buttonLogin.setOnClickListener {

            if(txtEmail.text.trim().isNotEmpty() || txtPassword.text.trim().isNotEmpty()){
                if(txtEmail.text.toString() == "prof@example.com" && txtPassword.text.toString() == "123"){
                    val intent = Intent(this, ProfilesActivity::class.java)
                    startActivity(intent)
                } else {
                    Toast.makeText(this, "Invalid email or password", Toast.LENGTH_SHORT).show()
                }
            }else{
                Toast.makeText(this, "Input required", Toast.LENGTH_SHORT).show()
            }
        }

    }

}