package com.example.property

interface Shape{
    val area:Double
}
class Circle(val radius:Double):Shape{
    override val area:Double
        get()=Math.PI*radius*radius
}
class Address{
    var name:String="Holmes,Sherlock"
    var street:String="Baker"
    var city:String= "London"
    var state:String?= null
    var zip:String="123456"
}
fun copyAddress(address:Address):Address{
    var result=Address()
    result.name=address.name
    result.street=address.street
    result.street=address.street
    result.city=address.city
    result.zip=address.zip
    return result
}
fun main(){
    val circle=Circle(5.0)
    println("Area of the circle: ${circle.area}")
    var address1=Address()
    var copyAddress1= copyAddress(address1)
    println("Name is : ${copyAddress1.name}")
    println("Street name is : ${copyAddress1.street}")
    println("City : ${copyAddress1.city}")
    println("State : ${copyAddress1.state}")
    println("Zip code : ${copyAddress1.zip}")
}