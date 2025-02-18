package com.example.typeofinheritance

//Single inheritance
open class Animal(val name:String){
    fun eat(){
        println("$name is eating")
    }
}
open class Dog(name:String):Animal(name){
    fun bark(){
        println("$name is barking")
    }
}
//multilevel inheritance
class Puppy(name:String):Dog(name){
    fun play(){
        println("$name is playing")
    }
}
//hierarchical inheritance
class Cat(name:String):Animal(name){
    fun meow(){
        println("$name is meowing")
    }
}





fun main(){
    val dog=Dog("Buddy")
    dog.eat()
    dog.bark()
    println("----------------------------")
    val puppy=Puppy("Max")
    puppy.eat()
    puppy.bark()
    puppy.play()
    println("--------------------------")
    val cat=Cat("Whiskers")
    cat.eat()
    cat.meow()
}
