package state.matrix

import util.MessageUtil
import util.matrix.MatrixContext
import util.matrix.MatrixState

class NineState: MatrixState {
    override fun toString(): String = "9"

    override fun turnDown(context: MatrixContext) {
        MessageUtil.denied()
    }

    override fun turnUp(context: MatrixContext) {
        context.setState(SixState())
        println(MessageUtil.printMatrixState(SixState().toString()))
    }

    override fun turnLeft(context: MatrixContext) {
        context.setState(EightState())
        println(MessageUtil.printMatrixState(EightState().toString()))
    }

    override fun turnRight(context: MatrixContext) {
        MessageUtil.denied()
    }
}