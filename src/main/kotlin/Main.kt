import java.util.*
fun main() {
    val input = Scanner(System.`in`)
    var b: Int = (1..100).random()
    println("Угадай мое число от 1 до 100")
    var jkf = input.nextInt()
    if (jkf >= 101) {
        println("Слишком большое число!!!")
    } else {
//      println(b)
        if (jkf == b) {
            println("You win! Мое число $b")
        } else {
            println("You lose! Мое число $b")
        }
    }
}