fun main() {
   val p1 = Point(readln().toDouble(), readln().toDouble())
    val p2 = Point(readln().toDouble(), readln().toDouble())
    val distance = p1.distancePoint(p2)
    println("Расстояние между точками: $distance") // Вывод: Расстояние между точками: 5.0
}