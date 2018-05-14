package state.matrix

import util.MessageUtil
import util.matrix.MatrixContext
import util.matrix.MatrixState

class SixState: MatrixState {
    override fun toString(): String = "6"

    override fun turnDown(context: MatrixContext) {
        context.setState(NineState())
        println(MessageUtil.printMatrixState(NineState().toString()))
    }

    override fun turnUp(context: MatrixContext) {
        context.setState(ThreeState())
        println(MessageUtil.printMatrixState(ThreeState().toString()))
    }

    override fun turnLeft(context: MatrixContext) {
        context.setState(FiveState())
        println(MessageUtil.printMatrixState(FiveState().toString()))
    }

    override fun turnRight(context: MatrixContext) {
        MessageUtil.denied()
    }
}