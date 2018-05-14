package util

interface State {
    fun action(lampContext: LampContext)
}