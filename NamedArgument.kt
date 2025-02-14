package com.example.namedargument

fun main(){
    createProfile("Shambhu ",22,"India")
   var result= multiply(4,5)
    println("print the result for given value: $result")
    sub(3,4)
    greet("Alice")
    greet(null)
    createUserProfile("Alice",25,"USA")
    createUserProfile(age=33)
    createUserProfile()

}

fun createProfile(name:String,age:Int,country:String){
    println("Name: $name,Age: $age ,Country: $country")
}

//return a value from function
fun multiply(a:Int,b:Int):Int{
    val mul=(a*b)
    return mul
}
fun sub(a:Int,b:Int):Unit{
    val sub=a-b
    println("Substraction of the given value: $sub")
}


//optional parameter either have nullable or default value
fun greet(name:String?){
    if(name!=null){
        println("Name is: $name")
    }
    else{
        println("Hello ,Guest")
    }
}

//function define all types of argument
fun createUserProfile(name:String ="Guest",age:Int?=null,country:String?="Unkno" +
        "" +
        "wn"){
    println("Name: $name ,Age: ${age ?:"Not Provided"},country: ${country?:"Not Provided"}")
}


