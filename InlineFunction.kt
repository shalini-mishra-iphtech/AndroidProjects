package com.example.inlinefunction

inline fun addNumbers(a:Int,b:Int,multiply:(Int ,Int)->Int):Int{
    println("Addition of the value:"+(a+b))
   return  multiply(5,6)
}

fun main(){
    val result=addNumbers(3,4,{x,y->x*y})
    println(result)


}

