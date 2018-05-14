package util.lamp

import state.lamp.OffLampState

class LampContext {
    private var lampState: LampState = OffLampState()

    fun setState(lampState: LampState) {
        this.lampState = lampState
    }

    fun turn() {
        lampState.action(this)
    }

    /**
     * @optional func
     */
    fun getState(): LampState = this.lampState
}