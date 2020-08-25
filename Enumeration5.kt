fun main() {
    val color: Color5 = Color5.BLUE
    when(color){
        Color5.RED -> print("Color is Red")
        Color5.BLUE -> print("Color is Blue")
        Color5.GREEN -> print("Color is Green")
    }
}
enum class Color5(val value: Int) {
    RED (0xFF0000 ),
    GREEN (0x00FF00 ),
    BLUE (0x0000FF )
}