package state.lamp

import util.MessageUtil
import util.lamp.LampContext
import util.lamp.LampState

class Brighter: LampState {
    override fun action(lampContext: LampContext) {
        lampContext.setState(Brightest())
        println(MessageUtil.printState("brightest"))
    }
}