package state.matrix

import util.MessageUtil
import util.matrix.MatrixContext
import util.matrix.MatrixState

class FiveState: MatrixState {
    override fun toString(): String = "5"

    override fun turnDown(context: MatrixContext) {
        context.setState(EightState())
        println(MessageUtil.printState(EightState().toString()))
    }

    override fun turnUp(context: MatrixContext) {
        context.setState(TwoState())
        println(MessageUtil.printState(TwoState().toString()))
    }

    override fun turnLeft(context: MatrixContext) {
        context.setState(FourState())
        println(MessageUtil.printState(FourState().toString()))
    }

    override fun turnRight(context: MatrixContext) {
        context.setState(SixState())
        println(MessageUtil.printState(SixState().toString()))
    }
}