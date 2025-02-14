package com.example.lib

//standard library function
fun main(){
    var number=25
    var result=Math.sqrt(number.toDouble())
    print("square root of $number is $result,")
    sum()
    var r1=sum(4,5)
    println("Result of the after adding the value: $r1")

    val myLambda:(Int)->Unit={s:Int->println("Addition of the given value using lambda function: $s")}
    addNumber(5,10,myLambda)

    //Inline function call
    inlineFunction({println("Calling inline functions:")})
     println()
    //default parameter function
    greet("Sonu")
    greet()
}

//user defines function
fun sum(){
    var num1=3
    var num2=5
    println("sum ="+(num1+num2))
}

//Parameterized function
fun sum(num1:Int,num2:Int):Int{
    val add=num1+num2
    return add
}

// Lambda Function this is also called higher order function
fun addNumber(a:Int,b:Int,myLambda1:(Int)->Unit){
    val add=a+b
    myLambda1(add)
}

//Inline function
inline fun inlineFunction(myFun:()-> Unit){
    myFun()
        print("code inside inline function:")

}
//Default parameter
fun greet(name:String="Seeta"){
    println(name)
}


