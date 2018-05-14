package util.matrix

import state.matrix.OneState

class MatrixContext {
    private var state: MatrixState = OneState()

    fun setState(state: MatrixState) {
        this.state = state
    }

    fun turnDown() {
        this.state.turnDown()
    }

    fun turnUp() {
        this.state.turnUp()
    }

    fun turnLeft() {
        this.state.turnLeft()
    }

    fun turnRight() {
        this.state.turnRight()
    }
}