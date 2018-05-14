import util.lamp.LampContext
import util.matrix.MatrixContext

fun main(args: Array<String>) {
    /**
     * @example for lamp-state
     */
    val contextLamp = LampContext()
    for (i: Int in 1..10) {
        contextLamp.turn()
    }

    /**
     * @example for matrix-state
     */

    val contextMatrix = MatrixContext()
    contextMatrix.turnDown()
    contextMatrix.turnLeft()
    contextMatrix.turnRight()
    contextMatrix.turnUp()
}