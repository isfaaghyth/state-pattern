package state.lamp

import util.LampContext
import util.State

class OnState: State {
    override fun action(lampContext: LampContext) {
        lampContext.setState(Brighter())
        println("state: brighter")
    }
}