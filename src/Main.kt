import util.lamp.LampContext

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
    val matrix = Array(3, {IntArray(3)})
    for(i in 0 until matrix.size) {
        var rows = IntArray(3)
        for(j in 0 until rows.size) {
            rows[j] = num++
        }
        matrix[i] = rows
    }

    
}