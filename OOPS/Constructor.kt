package com.example.constructor

class Car(var make:String ,var model:String ){
    var year:Int=0
    var color:String="Unkown"
    //Secondary Constructor
    constructor(make:String ,model:String ,year:Int):this(make,model){
        this.year=year
    }
    constructor(make:String ,model:String,year:Int ,color:String):this(make,model,year){
       this .color=color
    }
    fun displayInfo(){
        println("Car make:$make,Model:$model ,Year:$year,color:$color")
    }

}
fun main(){
    var car1=Car("Tesla","Model 3")
    car1.displayInfo()
    var car2=Car("Tesla","Model X",2023)
    car2.displayInfo()
    var Car3=Car("Swift","Model 9")
    Car3.displayInfo()
    var Car4=Car("Safari","Model M",2024,"Black")
    Car4.displayInfo()
}