fun main() {
    val color: Color4 = Color4.RED
    print("Position RED is ${color.ordinal}")
}
enum class Color4(val value: Int) {
    RED (0xFF0000 ),
    GREEN (0x00FF00 ),
    BLUE (0x0000FF )
}