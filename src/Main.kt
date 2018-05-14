import util.lamp.LampContext
import util.matrix.MatrixContext

fun main(args: Array<String>) {
    /**
     * @example for lamp-state
     */
//    val context = LampContext()
//    for (i: Int in 1..10) {
//        context.turn()
//    }

    /**
     * @example for matrix-state
     */

    //initialize of matrix 2 dimension
    //use $matrix variable for do something
    var num = 1
    val matrix = Array(4, {IntArray(4)})
    for(i in 0 until matrix.size) {
        var rows = matrix[i]
        for(j in 0 until rows.size) {
            rows[j] = num++
        }
        matrix[i] = rows
    }

    val context = MatrixContext(matrix)
    context.turnDown()
    context.turnDown()
}