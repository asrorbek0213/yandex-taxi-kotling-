import java.util.ArrayList
import java.util.Scanner

class Servise:MyInterface {
    val list = ArrayList<Order>()
    val input = Scanner(System.`in`)
    override fun takeOrder() {
     if (list.isNotEmpty()){
         for (i in 0 until list.size){
             println("$i -> ${list[i]}")
         }
         println("${list.size} -> Exit")
         println("Which do you want to take: ")
         val order = input.nextInt()
         if (order==list.size){
             driver()
         }else{
              list.removeAt(order)
             println("Order took")
         }
     }
        else{
         println("Order is empty")
        }
    }

    override fun giveOrder() {
        println("Phone number ...")
        var number = input.next()
        println("From...")
        val input = Scanner(System.`in`)
        var from = input.nextLine()
        println("To...")
        val input2 = Scanner(System.`in`)
        var to  = input2.nextLine()
        val order = Order(number,from,to)
        list.add(order)
        println("Your order is successful")
    }

    override fun user() {

        while (true){
            println("1-> Give order, 2-Exit")
            when(input.nextInt()){
                1->{
                giveOrder()
                }
                2->{
                    break
                }
            }
        }

    }

    override fun driver() {
        while (true){
            println("1->Take order, 2->Exit")
            when(input.nextInt()){
                1 ->{
                    takeOrder()
                }
                2->{
                    break
                }
            }
        }
    }
}