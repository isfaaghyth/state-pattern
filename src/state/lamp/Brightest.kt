package state.lamp

import util.MessageUtil
import util.lamp.LampContext
import util.lamp.LampState

class Brightest: LampState {
    override fun action(lampContext: LampContext) {
        lampContext.setState(OffLampState())
        println(MessageUtil.printState("off"))
    }
}