fun main() {

    val amount: Int = 10000
    val minComission: Int = 35
    val comission: Double = (amount / 100) * 0.75

    if (comission > minComission)  {
        println(comission)
    }
    else println(minComission)


}