package util.matrix

import state.matrix.OneState

class MatrixContext {
    private var state: MatrixState = OneState()

    fun setState(state: MatrixState) {
        this.state = state
    }

    fun turnDown() {
        this.state.turnDown(this)
    }

    fun turnUp() {
        this.state.turnUp(this)
    }

    fun turnLeft() {
        this.state.turnLeft(this)
    }

    fun turnRight() {
        this.state.turnRight(this)
    }
}