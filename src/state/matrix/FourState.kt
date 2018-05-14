package state.matrix

import util.MessageUtil
import util.matrix.MatrixContext
import util.matrix.MatrixState

class FourState: MatrixState {
    override fun toString(): String = "4"

    override fun turnDown(context: MatrixContext) {
        context.setState(SevenState())
        println(MessageUtil.printState(SevenState().toString()))
    }

    override fun turnUp(context: MatrixContext) {
        context.setState(OneState())
        println(MessageUtil.printState(OneState().toString()))
    }

    override fun turnLeft(context: MatrixContext) {
        MessageUtil.denied()
    }

    override fun turnRight(context: MatrixContext) {
        context.setState(FiveState())
        println(MessageUtil.printState(FiveState().toString()))
    }
}