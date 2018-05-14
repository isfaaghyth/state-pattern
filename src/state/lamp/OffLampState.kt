package state.lamp

import util.MessageUtil
import util.lamp.LampContext
import util.lamp.LampState

class OffLampState : LampState {
    override fun action(lampContext: LampContext) {
        lampContext.setState(OnLampState())
        println(MessageUtil.printState("on"))
    }
}