package com.example.lib2

var count=0
fun rec(){
    count++
    if(count<=5){
        println("Hello "+count)
        rec()
    }
}
//Factorial number
var Result=1
fun fact(num1:Int){
    var num=num1

    do{
        Result=Result*num
        num--
    }while(num>=1)

     println("Factorial of the given number is: $Result")
}


fun main(){
    rec()
    fact(5)
    run()
    run1(33)
    run2(latter='c')
}

//Default argument function
fun run(num:Int=5 ,latter:Char= 'x'){
    println("Parameter in function definition $num and $latter")
}


//Default argument with passing some argument in calling time
fun run1(num:Int=77 ,latter:Char='u'){
    println("parameter in function with passing value: $num and $latter")
}

//Named argument
fun run2(num:Int=5,latter:Char='q'){
    println("Parameter in function definition with named argument:$num and $latter")
}



