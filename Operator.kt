package com.example.lib5

fun main(){
     //1. Arithmatic Operator
     //2. Assignmant Operator
     //3. Comparison Operator
     //4. Logical Operator

    //1. Arithmatic Operator

    var a=45
    var b: Int
    b = 34
    println("Addition of the given value: "+(a+b))
    println("Substraction of the given value: "+(a-b))
    println("Multiplication of the given value: " +(a*b))
    println("Divison of the given value: "+(a/b))
    println("Modulas of the value: "+(a%b))
    println("Increment of the value: "+ (++a))
    println("Decrement of the given value: "+(--a))

    //2. Assignmant Operator
    var x=3
    var y=5
    x+=y
    println("First addition then assignment: "+x)
    x-=y
    println("First substraction then assignment: "+x)
    x*=y
    println("First multiplication then assignment: "+x)
    x/=y
    println("First Divison then assignment: $x")
    x%=y
    println("First Modulas then assignment: "+x)

    //3.Comparison
    var m=3
    var n=5
    println("m is equal to m or not :"+(m==n))
    println("m is equal to m or not :"+(m>=n))
    println("m is equal to m or not :"+(m<=n))
    println("m is equal to m or not :"+(m>n))
    println("m is equal to m or not :"+(m<n))
    println("m is equal to m or not :"+(m!=n))

    //4.Logical Operator
    println("And operator : "+(m<=n && m!=n))
    println("Or operator : "+(m<=n ||m!=n))
    println("Not operator :"+(m!=n))

}