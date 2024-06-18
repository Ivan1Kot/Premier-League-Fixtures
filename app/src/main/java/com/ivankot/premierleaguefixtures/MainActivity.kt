package com.ivankot.premierleaguefixtures

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.ComponentActivity
import androidx.activity.result.ActivityResult
import androidx.activity.result.contract.ActivityResultContracts

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.mainactivitylayout);

        val button: Button = findViewById(R.id.button2)
        button.setOnClickListener {
            val intent = Intent(
                this,
                ChildActivity::class.java
            )
            getContent.launch(intent)
        }
    }

    private val getContent =
        registerForActivityResult(ActivityResultContracts.StartActivityForResult())
        {

        }
}