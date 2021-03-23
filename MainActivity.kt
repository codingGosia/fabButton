package com.gosia.fabbutton

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationUtils
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

private val String.isClickable: Unit
    get() {}
private val isClickable: Unit
    get() {}

class MainActivity : AppCompatActivity() {

    var isOpen = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fabOpen = AnimationUtils.loadAnimation(this, R.anim.fab_open)
        val fabClose = AnimationUtils.loadAnimation(this, R.anim.fab_close)
        val fabRClockwise = AnimationUtils.loadAnimation(this, R.anim.rotate_clockwise)
        val fabRAntiClockwise = AnimationUtils.loadAnimation(this, R.anim.rotate_anticlockwise)

         add_button.setOnClickListener {

            if (isOpen) {

                search_edit_button.startAnimation(fabClose)
                camera_button.startAnimation(fabClose)
                add_button.startAnimation(fabRClockwise)

             isOpen = false
        }
            else {

                search_edit_button.startAnimation(fabOpen)
                camera_button.startAnimation(fabOpen)
                add_button.startAnimation(fabRAntiClockwise)

                search_edit_button.isClickable
                camera_button.isClickable

                isOpen = true
            }
            search_edit_button.setOnClickListener {
                Toast.makeText(this, "You clicked on edit button", Toast.LENGTH_LONG).show()

            }
            camera_button.setOnClickListener {
                Toast.makeText(this, "You clicked on camera button", Toast.LENGTH_LONG).show()
            }

        }
    }

 }





