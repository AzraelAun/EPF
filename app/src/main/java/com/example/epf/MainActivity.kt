package com.example.epf

import android.app.DatePickerDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    val c: Calendar = Calendar.getInstance();
    val mYear = c.get(Calendar.YEAR);
    val mMonth = c.get(Calendar.MONTH);
    val mDay = c.get(Calendar.DAY_OF_MONTH);


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textView6.setOnClickListener(){

            val datePickerDialog = DatePickerDialog(this,
                DatePickerDialog.OnDateSetListener{
                    view, year, monthOfYear, dayOfMonth ->
                    textView.setText(dayOfMonth.toString() + "-" + (monthOfYear + 1) + "-" + year)

                },mYear,mMonth,mDay
                )
                datePickerDialog.show()

        }

        button.setOnClickListener(){

        }
    }
}
