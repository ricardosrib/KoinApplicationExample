package com.example.koinapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import org.koin.android.ext.android.get
import org.koin.android.ext.android.inject

class MainActivity : AppCompatActivity() {

    // get an instance of Student() class injected in MainActivity via inject()
    private val student: Student by inject()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // get an instance of Student() class injected in MainActivity via get()
//        val student = get<Student>()
        student.beSmart()

        // now anytime you need a dependency you call it using get() and provide the type <> of the dependency
    }
}