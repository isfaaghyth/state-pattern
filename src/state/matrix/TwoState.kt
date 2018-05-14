package state.matrix

import util.matrix.MatrixContext
import util.matrix.MatrixState

class TwoState: MatrixState {
    override fun turnDown(context: MatrixContext) {
        context.setState(FiveState())
        println("state => 5")
    }

    override fun turnUp(context: MatrixContext) {
        println("{{ denied }}")
    }

    override fun turnLeft(context: MatrixContext) {
        context.setState(OneState())
        println("state => 1")
    }

    override fun turnRight(context: MatrixContext) {
        context.setState(ThreeState())
        println("state => 3")
    }
}