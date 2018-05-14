import util.LampContext

fun main(args: Array<String>) {
    val context = LampContext()
    for (i: Int in 1..10) {
        context.turn()
    }
}