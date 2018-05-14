package util.matrix

interface MatrixState {
    fun turnDown(context: MatrixContext)
    fun turnUp(context: MatrixContext)
    fun turnLeft(context: MatrixContext)
    fun turnRight(context: MatrixContext)
}