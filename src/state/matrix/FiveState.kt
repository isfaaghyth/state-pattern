package state.matrix

import util.matrix.MatrixContext
import util.matrix.MatrixState

class FiveState: MatrixState {
    override fun turnDown(context: MatrixContext) {
        context.setState(EightState())
        println("state => 8")
    }

    override fun turnUp(context: MatrixContext) {
        context.setState(TwoState())
        println("state => 2")
    }

    override fun turnLeft(context: MatrixContext) {
        context.setState(FourState())
        println("state => 4")
    }

    override fun turnRight(context: MatrixContext) {
        context.setState(SixState())
        println("state => 6")
    }
}