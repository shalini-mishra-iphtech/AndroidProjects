package com.example.lib4

fun main(){
    //Type Conversion
    val x:Int=5
    //int to long
    val y:Long=x.toLong()
    println(y)
    //int to short
    val z=x.toShort()
    println(z)
    //int to byte
    val n1=x.toByte()
    val f1:Float=4.55F
    //float to double
    val d1=f1.toDouble()
    println(d1)
    //int to char
    val i1:Int=34
    val c1=i1.toChar()
    println(c1)
    //char to string
    val c2:Char='M'
    val s1=c2.toString()
    println(s1)

}