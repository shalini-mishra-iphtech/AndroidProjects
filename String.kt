package com.example.lib6

fun main()
{
     //String
     var txt="Hello World"
     println(txt)
     print(txt[0])
     print(txt[1])
     print(txt[2])
     print(txt[3])
     print(txt[4])
     print(txt[5])
     print(txt[6])
     print(txt[7])
     print(txt[8])
     print(txt[9])
     print(txt[10])

     //String length
     println("Lenght of the string is: "+txt.length)

     //touppercase
     println("Convert into uppercase :"+txt.uppercase())

     //tolowercase
     println("Convert into lower case :"+txt.lowercase())

     //compareTostring
     var txt2="Hello World"
     println(txt.compareTo(txt2))

     //Finding a string
     var txt3="Please locate where 'locate' occurs!"
     println(txt3.indexOf("locate"))

     //using quotes inside a string
     var t1="It's alright"
     var t2="That's great"
     println(t1)
     println(t2)

     //Concatenation
     println(t1+" "+t2)
     println(t1.plus( t2))

     //string templates/Interpolation
     var firstName="John"
     var lastName="Doe"
     println("My name is $firstName $lastName")






}