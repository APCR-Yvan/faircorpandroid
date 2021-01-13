package com.faircorp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.faircorp.model.Status
import com.faircorp.model.WindowDto
import com.faircorp.model.WindowService


class WindowActivity : BasicActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_window)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

//        val param = intent.getStringExtra(WINDOW_NAME_PARAM)
//        val windowName = findViewById<TextView>(R.id.txt_window_name)
//        windowName.text = param
        val id = intent.getLongExtra(WINDOW_NAME_PARAM, 0)
        var window = WindowDto(1, "Entry Window", Status.CLOSED, "Room EF 6.10", 1)

        if (window != null) {
            findViewById<TextView>(R.id.txt_window_name).text = window.name
            findViewById<TextView>(R.id.txt_room_name).text = window.roomName
            findViewById<TextView>(R.id.txt_window_current_temperature).text = "NOT NOW"//window.room.currentTemperature?.toString()
            findViewById<TextView>(R.id.txt_window_target_temperature).text = "NOT NOW"//window.room.targetTemperature?.toString()
            findViewById<TextView>(R.id.txt_window_status).text = window.windowStatus.toString()
        }

    }
}