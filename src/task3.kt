
fun main(){
    val points = arrayListOf<Point>()
    println("Задайте количество точек на плоскости:")
    val count = readln().toInt()
    var counter = 0
    for(i in 0 until count){
        println("Введите точку ${counter+1}")
        val x = Math.random() * 10.0
        val y = Math.random() * 10.0
        points.add(Point(x, y))
        counter++
    }
    var minDistance = Double.MAX_VALUE
    var maxDistance = Double.MIN_VALUE

    for (i in 0 until count) {
        for (j in i + 1 until count) { // Избегаем повторного сравнения и сравнения точки с собой
            val distance = points[i].distancePoint(points[j])
            minDistance = minOf(minDistance, distance)
            maxDistance = maxOf(maxDistance, distance)
        }
    }

    println("Минимальное расстояние между точками: $minDistance")
    println("Максимальное расстояние между точками: $maxDistance")



}