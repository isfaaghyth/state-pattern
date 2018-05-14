package state.matrix

import util.MessageUtil
import util.matrix.MatrixContext
import util.matrix.MatrixState

class FiveState: MatrixState {
    override fun toString(): String = "5"

    override fun turnDown(context: MatrixContext) {
        context.setState(EightState())
        println(MessageUtil.printMatrixState(EightState().toString()))
    }

    override fun turnUp(context: MatrixContext) {
        context.setState(TwoState())
        println(MessageUtil.printMatrixState(TwoState().toString()))
    }

    override fun turnLeft(context: MatrixContext) {
        context.setState(FourState())
        println(MessageUtil.printMatrixState(FourState().toString()))
    }

    override fun turnRight(context: MatrixContext) {
        context.setState(SixState())
        println(MessageUtil.printMatrixState(SixState().toString()))
    }
}