package com.example.lib8

fun main()
{
    val n=3
    if(n%2==0){
        println("Given number is even number:"+n)
    }
    else
        {
            println("Given number is not a even number: "+n)
        }

    //using else if check again condition is true or not!
    val time=22
    if(time<10){
        println("Good Morning!")
    }
    else if(time>15){
        println("Good Afternoon!")
    }
    else{
        println("Good Evening")
    }

    //We can use if else expression in one or more way in kotlin
    //When we use variable assignment else is necessary to be use
    val Time=22
    val greeting= if(Time<18){
    "Good Day"
   }else{
       "Good Evening"
   }
    println(greeting)


    //When using
    val day=4
    val result=when(day){
        1-> "Monday"
        2-> "Tuesday"
        3-> "Wednesday"
        4-> "Thursday"
        5-> "Friday"
        6-> "Saturday"
        7-> "Sunday"
        else-> "Invalid day"
    }
    println(result)
}