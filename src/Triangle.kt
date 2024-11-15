import kotlin.math.sqrt

class Triangle (val point1: Point,val point2: Point,val point3: Point) {

    val a: Double = point2.distancePoint(point3)
    val b: Double = point1.distancePoint(point3)
    val c: Double = point1.distancePoint(point2)

    fun area(): Double {
        val p = (a + b + c) / 2
        return sqrt(p * (p - a) * (p - b) * (p - c))
    }
}