package state.matrix

import util.matrix.MatrixContext
import util.matrix.MatrixState

class FourState: MatrixState {
    override fun turnDown(context: MatrixContext) {
        context.setState(SevenState())
        println("state => 7")
    }

    override fun turnUp(context: MatrixContext) {
        context.setState(OneState())
        println("state => 1")
    }

    override fun turnLeft(context: MatrixContext) {
        println("{{ denied }}")
    }

    override fun turnRight(context: MatrixContext) {
        context.setState(FiveState())
        println("state => 5")
    }
}