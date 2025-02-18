package com.example.abtractinheritance

abstract class Animal(val name:String){
    abstract fun makeSound()
}
class Dog(name:String):Animal(name){
    override fun makeSound(){
        println("$name barks!")
    }
}
class Cat(name:String):Animal(name){
    override fun makeSound(){
        println("$name barks")
    }
}
fun main(){
    val dog=Dog("Buddy")
    dog.makeSound()
    val cat=Cat("Whiskers")
    cat.makeSound()

}