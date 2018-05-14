package state.matrix

import util.matrix.MatrixContext
import util.matrix.MatrixState

class SevenState: MatrixState {
    override fun turnDown(context: MatrixContext) {
        println("{{ denied }}")
    }

    override fun turnUp(context: MatrixContext) {
        context.setState(FourState())
        println("state => 4")
    }

    override fun turnLeft(context: MatrixContext) {
        println("{{ denied }}")
    }

    override fun turnRight(context: MatrixContext) {
        context.setState(EightState())
        println("state => 8")
    }
}