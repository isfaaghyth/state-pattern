package state.matrix

import util.MessageUtil
import util.matrix.MatrixContext
import util.matrix.MatrixState

class OneState: MatrixState {
    override fun toString(): String = "1"

    override fun turnDown(context: MatrixContext) {
        context.setState(FourState())
        println(MessageUtil.printState(FourState().toString()))
    }

    override fun turnUp(context: MatrixContext) {
        MessageUtil.denied()
    }

    override fun turnLeft(context: MatrixContext) {
        MessageUtil.denied()
    }

    override fun turnRight(context: MatrixContext) {
        context.setState(TwoState())
        println(MessageUtil.printState(TwoState().toString()))
    }
}