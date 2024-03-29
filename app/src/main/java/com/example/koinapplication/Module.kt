package com.example.koinapplication

import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

// tell koin HOW these dependencies are going to be created

val appModule = module {

    // singleton
    single { SchoolCourse() }

    // factory
    factory { Friend() }

    factory { Student(get(), get()) }

    // we just use get() because koin already knows about them as they were declared here in the module {}

}


val viewModelModule = module {

    // koin provides a special keyword for viewModel
    viewModel { MainViewModel(get(), get()) }

}