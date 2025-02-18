package com.example.aninterface

interface Animal{
    fun makeSound()
    fun sleep(){
        println("The animal is sleeping")
    }
}
class Dog:Animal{
    override fun makeSound(){
        println("Bark")
    }
}
fun main(){
    val dog=Dog()
    dog.makeSound()
    dog.sleep()
}