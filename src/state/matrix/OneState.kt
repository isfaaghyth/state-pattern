package state.matrix

import util.matrix.MatrixContext
import util.matrix.MatrixState

class OneState: MatrixState {
    override fun turnDown(context: MatrixContext) {
        context.setState(FourState())
        println("state => 4")
    }

    override fun turnUp(context: MatrixContext) {
        println("{{ denied }}")
    }

    override fun turnLeft(context: MatrixContext) {
        println("{{ denied }}")
    }

    override fun turnRight(context: MatrixContext) {
        context.setState(TwoState())
        println("state => 2")
    }
}