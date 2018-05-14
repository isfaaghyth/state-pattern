package state.lamp

import util.LampContext
import util.State

class Brighter: State {
    override fun action(lampContext: LampContext) {
        lampContext.setState(Brightest())
        println("state: brightest")
    }
}