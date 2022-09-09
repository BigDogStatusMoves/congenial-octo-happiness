fun main() {
    var userResponse: Int
    do {
        println("Pick a geometric shape to find the area of!")
        println("1) Square")
        println("2) Rectangle")
        println("3) Triangle")
        println("4) Circle")
        println("5) Exit")
        userResponse = readln().toInt()
    } while (userResponse==0 || userResponse>5)
    if (userResponse==1)
        square()
    else if (userResponse==2)
        rectangle()
    else if (userResponse==3)
        triangle()
    else if (userResponse==4)
        circle()
    else
        println("What, don't want to do math? Fair enough.")
}

fun square(){
    println("Input a value that will become both x and y: ")
    val xy = readln().toInt()
    println("Area = length * width, therefore $xy * $xy = " + (xy*xy))
}

fun rectangle(){
    println("Input a x-value: ")
    val x = readln().toInt()
    println("Input a y-value: ")
    val y = readln().toInt()
    println("Area = length * width, therefore $x * $y = " + (x*y))
}

fun triangle(){
    println("Input a x-value: ")
    val x = readln().toInt()
    println("Input a y-value: ")
    val y = readln().toInt()
    println("Area = 1/2(length * width), therefore 1/2($x * $y)= " + ((x*y)/2))
}

fun circle(){
    println("Input a radius value: ")
    val radius = readln().toDouble()
    println("Area = π * radius^2, therefore π * $radius^2 = " + ((radius*radius)*3.14))
}