package com.example.koinapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import org.koin.android.ext.android.get
import org.koin.android.ext.android.inject
import org.koin.androidx.viewmodel.ext.android.getViewModel

class MainActivity : AppCompatActivity() {

    // now anytime you need a dependency you call it using inject() or get() and provide the type <> of the dependency


    // get an instance of Student() class injected in MainActivity via inject()
    private val student: Student by inject()

    // get an instance of the MainViewModel() class injected in MainActivity via inject()
    private val viewModel by inject<MainViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // get an instance of Student() class injected in MainActivity via get()
//        val student = get<Student>()

        student.beSmart()

        // get an instance of the MainViewModel() class injected in MainActivity via getViewModel()
//        val viewModel = getViewModel<MainViewModel>()
        viewModel.performAction()
    }
}