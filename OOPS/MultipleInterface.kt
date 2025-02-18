package com.example.multipleinterface

interface  Animal {
    fun makeSound()
}
interface Pet{
    fun play()
}
class Dog:Animal,Pet{
    override fun makeSound(){
        println("Woof!")
    }
    override fun play(){
        println("Playing Fetch")
    }
}
fun main(){
    val dog=Dog()
    dog.makeSound()
    dog.play()
}