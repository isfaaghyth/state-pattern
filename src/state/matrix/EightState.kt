package state.matrix

import util.matrix.MatrixContext
import util.matrix.MatrixState

class EightState: MatrixState {
    override fun turnDown(context: MatrixContext) {
        println("{{ denied }}")
    }

    override fun turnUp(context: MatrixContext) {
        context.setState(FiveState())
        println("state => 5")
    }

    override fun turnLeft(context: MatrixContext) {
        context.setState(SevenState())
        println("state => 7")
    }

    override fun turnRight(context: MatrixContext) {
        context.setState(NineState())
        println("state => 9")
    }
}