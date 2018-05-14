package util.lamp

interface LampState {
    fun action(lampContext: LampContext)
}