package state.matrix

import util.MessageUtil
import util.matrix.MatrixContext
import util.matrix.MatrixState

class FourState: MatrixState {
    override fun toString(): String = "4"

    override fun turnDown(context: MatrixContext) {
        context.setState(SevenState())
        println(MessageUtil.printMatrixState(SevenState().toString()))
    }

    override fun turnUp(context: MatrixContext) {
        context.setState(OneState())
        println(MessageUtil.printMatrixState(OneState().toString()))
    }

    override fun turnLeft(context: MatrixContext) {
        MessageUtil.denied()
    }

    override fun turnRight(context: MatrixContext) {
        context.setState(FiveState())
        println(MessageUtil.printMatrixState(FiveState().toString()))
    }
}