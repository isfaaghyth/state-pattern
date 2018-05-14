package state.matrix

import util.matrix.MatrixContext
import util.matrix.MatrixState

class ThreeState: MatrixState {
    override fun turnDown(context: MatrixContext) {
        context.setState(SixState())
        println("state => 6")
    }

    override fun turnUp(context: MatrixContext) {
        println("{{ denied }}")
    }

    override fun turnLeft(context: MatrixContext) {
        context.setState(TwoState())
        println("state => 2")
    }

    override fun turnRight(context: MatrixContext) {
        println("{{ denied }}")
    }
}