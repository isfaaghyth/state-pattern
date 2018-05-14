package state.matrix

import util.MessageUtil
import util.matrix.MatrixContext
import util.matrix.MatrixState

class SevenState: MatrixState {
    override fun toString(): String = "7"

    override fun turnDown(context: MatrixContext) {
        MessageUtil.denied()
    }

    override fun turnUp(context: MatrixContext) {
        context.setState(FourState())
        println(MessageUtil.printState(FourState().toString()))
    }

    override fun turnLeft(context: MatrixContext) {
        MessageUtil.denied()
    }

    override fun turnRight(context: MatrixContext) {
        context.setState(EightState())
        println(MessageUtil.printState(EightState().toString()))
    }
}