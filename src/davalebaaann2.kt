fun main() {
    var point_1 = Point(-2F,9F)
    var point_2 = Point(3F,6F)

    println(point_1 == point_2)
    println(point_1.toString())
    println(point_1.symmetrical_wrap())

}

class Point(val X: Float, val Y:Float) {
    override fun equals(other: Any?): Boolean {
        if (other is Point) {
            if (X == other.X){
                if (Y == other.Y){
                    return true
                }
            }
        }
        return false
    }

    override fun toString(): String {
        return "$X, $Y"
    }

    fun symmetrical_wrap(): String {
        val X = (X * -1)
        return "$X, $Y"
    }

}