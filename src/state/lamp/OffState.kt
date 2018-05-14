package state.lamp

import util.LampContext
import util.State

class OffState: State {
    override fun action(lampContext: LampContext) {
        println("state: on")
        lampContext.setState(OnState())
    }
}