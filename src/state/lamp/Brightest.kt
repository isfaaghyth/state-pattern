package state.lamp

import util.lamp.LampContext
import util.lamp.LampState

class Brightest: LampState {
    override fun action(lampContext: LampContext) {
        lampContext.setState(OffLampState())
        println("state: off")
    }
}