package com.example.class1

class InitOrderDemo(name:String){
    //property 1
    val firstProperty="First Property :$name".also(::println)
    //first initializer block
    init {
        println("First initializer block that prints $name")
    }
    //property 2
    val secondaryProperty="Second property :${name.length}".also(::println)
    //second initializer block
    init{
        println("Second initializer ")
    }
}
fun main(){
    var Demo=InitOrderDemo("Suhana")
}