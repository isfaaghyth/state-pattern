package state.matrix

import util.MessageUtil
import util.matrix.MatrixContext
import util.matrix.MatrixState

class TwoState: MatrixState {
    override fun toString(): String = "2"

    override fun turnDown(context: MatrixContext) {
        context.setState(FiveState())
        println(MessageUtil.printState(FiveState().toString()))
    }

    override fun turnUp(context: MatrixContext) {
        MessageUtil.denied()
    }

    override fun turnLeft(context: MatrixContext) {
        context.setState(OneState())
        println(MessageUtil.printState(OneState().toString()))
    }

    override fun turnRight(context: MatrixContext) {
        context.setState(ThreeState())
        println(MessageUtil.printState(ThreeState().toString()))
    }
}