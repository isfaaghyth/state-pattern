package util

import state.lamp.OffState

class LampContext {
    private var state: State = OffState()

    fun setState(state: State) {
        this.state = state
    }

    fun turn() {
        state.action(this)
    }

    fun getState(): State = this.state
}