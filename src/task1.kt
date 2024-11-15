fun main(){
    print("Введите координаты точки (x;y) ")
    val point = Point(readln().toDouble(),readln().toDouble())
    println("Введите координаты вершины (x1,y1)(x2,y2)(x3,y3) ")
    val triangle = Triangle(Point(readln().toDouble(),readln().toDouble()),Point(readln().toDouble(),readln().toDouble()),Point(readln().toDouble(),readln().toDouble()))

    val a = (triangle.point1.x - point.x)*(triangle.point2.y - triangle.point1.y)-(triangle.point2.x - triangle.point1.x) *(triangle.point1.y - point.y)
    val b = (triangle.point2.x - point.x)*(triangle.point3.y - triangle.point2.y)-(triangle.point3.x - triangle.point2.x) *(triangle.point2.y - point.y)
    val c = (triangle.point3.x - point.x)*(triangle.point1.y - triangle.point3.y)-(triangle.point1.x - triangle.point3.x) *(triangle.point3.y - point.y)
    if((a >= 0 && b >= 0 && c >= 0) || (a <= 0 && b <= 0 && c <= 0))
    {
        print("Точка входит в треугольник")
    } else
        print("Точка не входит в треугольник")
}
