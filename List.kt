package com.example.list

//List
fun main(){
    println("Hello")

    //immutable list
    val numbers=listOf(8,3,4,5,6,2)
    println(numbers)
    println(numbers[0])
    println("access the element:"+numbers.get(3))
    println("List is empty or not:"+numbers.isEmpty())
    println("size of the list:"+numbers.size)
    println("index of element:"+numbers.indexOf(2))
    println(numbers.contains(4))

  println("------------Mutable list---------------")
    //mutable list
    var mutableNumbers= mutableListOf(2,3,4,5,8)
    println(mutableNumbers)
    //add an element
    mutableNumbers.add(9)
    println(mutableNumbers)
    //remove an element
    mutableNumbers.remove(2)
    println(mutableNumbers)
    //modify an element
    mutableNumbers[0]=12
    println(mutableNumbers)
    mutableNumbers.clear()
    println(mutableNumbers)
    //use of filter function
    val number=listOf(4,5,6,2,1,3)
    val evenNumbers=number.filter {it%2==0}
    println(evenNumbers)
    //use of map function
    val number1=listOf(2,4,6,7,9,10)
    val squareNumbers=number1.map { it*it }
    println(squareNumbers)
    //reduce function
    val number2=listOf(2,3,1,4,5)
    val sum=number2.reduce{acc, number->acc+number}
    println(sum)
    //filtermap function
    val listOfLists=listOf(
        listOf(1,2,3),
        listOf(4,5),
        listOf(8,9,10)
    )
    val flattenendList=listOfLists.flatMap { it }
    println(flattenendList)


}
