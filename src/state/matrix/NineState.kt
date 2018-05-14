package state.matrix

import util.matrix.MatrixContext
import util.matrix.MatrixState

class NineState: MatrixState {
    override fun turnDown(context: MatrixContext) {
        println("{{ denied }}")
    }

    override fun turnUp(context: MatrixContext) {
        context.setState(SixState())
        println("state => 6")
    }

    override fun turnLeft(context: MatrixContext) {
        context.setState(EightState())
        println("state => 8")
    }

    override fun turnRight(context: MatrixContext) {
        println("{{ denied }}")
    }
}