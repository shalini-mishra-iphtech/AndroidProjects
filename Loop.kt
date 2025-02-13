package com.example.lib9

fun main() {
    var i=1
    while(i<=10)
    {
    print("$i ")
        i++
    }
  println()
    println("print value using do-while loop.")

    //Do while loop
    var j=10
    do{
        print("$j ");
        j--
    }
    while(j>=1)

    //Break and continue statement
    println()
    i=2
    while(i<10){
        print("$i ")
        i++
        if(i==4){
            break
        }
    }
    println()
    //Continue statement
    var k=1
    while(k<10){
        print("$k ")
        k++
        if(k==4)
            continue
    }

    //For loop
    println()
    val marks=arrayOf(80,85,60,90,70)
    for(item in marks.indices){    //indices is just like index
        println("marks[$item]:"+marks[item])
    }

    //Labeled break expression

        loop@ for(i in 1..3){
            println("i=$i and j=$j")
            if(i==2){
                break@loop
            }
        }
    println("Continue statement with labeled")
    //Labeled continue expression
     labelname@ for(i in 1..5){
         println("i=$i and j=$j")
         if(i==2){
             continue@labelname
         }
         println("This is below if")
     }
}
