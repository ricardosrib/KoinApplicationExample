package com.example.koinapplication

// class Student has 2 dependencies (SchoolCourse and Friend)

class Student(
    private val course: SchoolCourse,
    private val friend: Friend
) {

//    private val course: SchoolCourse = SchoolCourse()
//    private val friend: Friend = Friend()

    fun beSmart() {
        course.study()
        friend.hangout()
    }
}

class SchoolCourse() {
    fun study() {
        println("I'm studying")
    }
}

class Friend() {
    fun hangout() {
        println("we're hanging out")
    }
}