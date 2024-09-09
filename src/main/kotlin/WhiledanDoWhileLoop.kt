fun main(args: Array<String>) {
    //while Loop

    var x: Int = 0
    println("Example of WHile Loop--")
    while (x <= 10){
        print(" $x ")
        x++
    }
    print('\n')

    //Do-While Loop
    var y:Int = 0
    do{
      y = y + 10
      println("I am inside Do block---" +y)
    } while (y <= 50)
}