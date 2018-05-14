package state.matrix

import util.MessageUtil
import util.matrix.MatrixContext
import util.matrix.MatrixState

class ThreeState: MatrixState {
    override fun toString(): String = "3"

    override fun turnDown(context: MatrixContext) {
        context.setState(SixState())
        println(MessageUtil.printState(SixState().toString()))
    }

    override fun turnUp(context: MatrixContext) {
        MessageUtil.denied()
    }

    override fun turnLeft(context: MatrixContext) {
        context.setState(TwoState())
        println(MessageUtil.printState(TwoState().toString()))
    }

    override fun turnRight(context: MatrixContext) {
        MessageUtil.denied()
    }
}