package com.example.lambda

//Lambda Function

//Lambda with single parameter
val greet= { name:String -> println("name is:$name")}


//Lambda function with multiple parameter
val sum= {a:Int, b:Int -> println("Addition of the given number: "+ (a+b))}


//lambda with no parameter
val sayHello= {println("Hello How are you?")}

//lambda as function parameter
fun operateOnNumbers (a:Int,b:Int ,operation: (Int ,Int)->Int):Int
{
   return operation(a,b)
}


//Key Features of lambda function
//1.Type Inference
var multiply={a:Int , b:Int->a*b} //explictily types
var multiplyInferred={a:Int, b :Int-> a*b} //type inferred


//2. Implicit it parameterSingle
//var square :(Int)->Int =(it*it)  //not supported


//trailing lambda
fun performOperation(x:Int ,y:Int,add:(Int ,Int)->Int ){
  println("Addition of the given value using trailing lambda function:"+ add(5,6))
}



fun main(){
   greet("Siyu")
   sum(4,5)
   sayHello()
   var result= operateOnNumbers(4,3,{x,y->x+y})
   println("Addition of the value passing lambda function as parameter:"+result)
   multiply(4,5)
   multiplyInferred(7,8)
  // println(square(5))
   performOperation(3,4) {a,b ->a+b}
}
