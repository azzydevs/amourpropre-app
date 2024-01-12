package com.example.amourpropre


import android.app.DatePickerDialog.OnDateSetListener
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.DatePicker
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.DialogFragment
import java.text.DateFormat
import java.util.Calendar


class Journal : AppCompatActivity(), OnDateSetListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_journal)
        val button = findViewById<View>(R.id.button) as Button
        button.setOnClickListener {
            val datePicker: DialogFragment = DatePickerFragment()
            datePicker.show(supportFragmentManager, "date picker")
        }
    }

    override fun onDateSet(view: DatePicker, year: Int, month: Int, dayOfMonth: Int) {
        val c = Calendar.getInstance()
        c[Calendar.YEAR] = year
        c[Calendar.MONTH] = month
        c[Calendar.DAY_OF_MONTH] = dayOfMonth
        val currentDateString = DateFormat.getDateInstance(DateFormat.FULL).format(c.time)
        val textView = findViewById<View>(R.id.textView) as TextView
        textView.text = currentDateString
    }
}