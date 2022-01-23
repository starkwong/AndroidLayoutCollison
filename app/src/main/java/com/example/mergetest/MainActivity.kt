package com.example.mergetest

import android.content.DialogInterface
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun textViewClick(view: View) {
        AlertDialog.Builder(this)
            .setAdapter(ArrayAdapter(this, android.R.layout.simple_list_item_1, arrayOf("library1", "library2"))
            ) { _, index ->
                if (index == 0) {
                    startActivity(
                        Intent(
                            this@MainActivity,
                            com.example.library1.MainActivity::class.java
                        )
                    )
                } else if (index == 1) {
                    startActivity(
                        Intent(
                            this@MainActivity,
                            com.example.library2.MainActivity::class.java
                        )
                    )
                }
            }.show()
    }
}