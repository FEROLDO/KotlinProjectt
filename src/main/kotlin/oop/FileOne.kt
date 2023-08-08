package oop

fun main(args: Array<String>) {
    println("Welcome to oop")
    var firstCar = Car("Lamborghini", "V12", "KDQ947S")
    var secondCar = Car("Mercedes", "C63", "KDS102S")
    println(firstCar.model)
    println(secondCar.reg_no)

    var firstFruit = Fruit("Mango", "Yellow", 35.00)
    var secondFruit = Fruit("Apple", "Pink", 40.00)
    println(firstFruit.name)


    var firstPhone = Phone("iPhone 14", "IOS", "TypeC")
    var secondPhone = Phone("Samsung", "S23", "TypeC")

    secondPhone.call("07133686565")
}