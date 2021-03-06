package state.lamp

import util.MessageUtil
import util.lamp.LampContext
import util.lamp.LampState

class OnLampState : LampState {
    override fun action(lampContext: LampContext) {
        lampContext.setState(Brighter())
        println(MessageUtil.printState("brighter"))
    }
}