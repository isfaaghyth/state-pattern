package state.lamp

import util.LampContext
import util.State

class Brightest: State {
    override fun action(lampContext: LampContext) {
        lampContext.setState(OffState())
        println("state: off")
    }
}