package com.example.lightmeup

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
   var state=R.drawable.ic_baseline_report_problem_24
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val imageView:ImageView=findViewById(R.id.imageView)
        imageView.setImageDrawable(getDrawable(R.drawable.ic_baseline_report_problem_24))
        imageView.setOnLongClickListener {
            state =when (state)
            {
                R.drawable.ic_baseline_report_problem_24->R.drawable.ic_baseline_done_24
                R.drawable.ic_baseline_done_24 ->R.drawable.ic_baseline_report_problem_24
                else ->R.drawable.ic_baseline_report_problem_24
            }
            imageView.setImageDrawable(getDrawable(state))
return@setOnLongClickListener true
        }
    }
}