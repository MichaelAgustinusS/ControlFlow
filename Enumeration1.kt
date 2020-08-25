fun main() {
    val colors: Array<Color3> = Color3.values()
    colors.forEach { color ->
        print(color)
    }
}
    enum class Color3(val value: Int) {
        RED (0xFF0000 ),
        GREEN (0x00FF00 ),
        BLUE (0x0000FF )
    }

