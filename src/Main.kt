import java.util.Scanner

fun main() {
    val input = Scanner(System.`in`)
    val servise = Servise()
    while (true){
        println("1->User, 2->Driver")
        when(input.nextInt()){
            1->servise.user()
            2->servise.driver()
        }
    }
}