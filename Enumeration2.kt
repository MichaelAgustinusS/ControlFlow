fun main() {
    val color: Color2 = Color2.valueOf("BLUE")
    print("Color is $color")
    }
enum class Color2(val value: Int) {
    RED (0xFF0000 ),
    GREEN (0x00FF00 ),
    BLUE (0x0000FF )
}