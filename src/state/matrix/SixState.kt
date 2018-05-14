package state.matrix

import util.matrix.MatrixContext
import util.matrix.MatrixState

class SixState: MatrixState {
    override fun turnDown(context: MatrixContext) {
        context.setState(NineState())
        println("state => 9")
    }

    override fun turnUp(context: MatrixContext) {
        context.setState(ThreeState())
        println("state => 3")
    }

    override fun turnLeft(context: MatrixContext) {
        context.setState(FiveState())
        println("state => 5")
    }

    override fun turnRight(context: MatrixContext) {
        println("{{ denied }}")
    }
}