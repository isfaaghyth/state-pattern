package state.lamp

import util.lamp.LampContext
import util.lamp.LampState

class OffLampState : LampState {
    override fun action(lampContext: LampContext) {
        println("state: on")
        lampContext.setState(OnLampState())
    }
}