package com.example.inheritance

open class Animal(val name:String){
    fun eat(){
        println("$name is eating.")
    }
    open fun makeSound(){
        println("$name makes a sound.")
    }
}

//Child class
class Dog(name:String,val breed:String):Animal(name){
    override fun makeSound() {
        super.makeSound()
        println("$name barks.")
    }
    fun fetch(){
        println("$name is fetching the ball.")
    }
}
fun main(){
    val dog=Dog("Buddy","Golder Retriever")
    dog.eat()
    dog.makeSound()
    dog.fetch()
}