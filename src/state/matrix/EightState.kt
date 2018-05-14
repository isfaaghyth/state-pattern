package state.matrix

import util.MessageUtil
import util.matrix.MatrixContext
import util.matrix.MatrixState

class EightState: MatrixState {
    override fun toString(): String = "8"

    override fun turnDown(context: MatrixContext) {
        MessageUtil.denied()
    }

    override fun turnUp(context: MatrixContext) {
        context.setState(FiveState())
        println(MessageUtil.printState(FiveState().toString()))
    }

    override fun turnLeft(context: MatrixContext) {
        context.setState(SevenState())
        println(MessageUtil.printState(SevenState().toString()))
    }

    override fun turnRight(context: MatrixContext) {
        context.setState(NineState())
        println(MessageUtil.printState(NineState().toString()))
    }
}