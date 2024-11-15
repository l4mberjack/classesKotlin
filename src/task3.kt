fun main(){
    println("Задайте количество точек на плоскости:")
    val count = readln().toInt()
    var counter = 0
    while(counter != count){
        println("Введите точку ${counter+1}")
        val p = Point(readln().toDouble(), readln().toDouble())
        println(p)
        counter++
    }




}