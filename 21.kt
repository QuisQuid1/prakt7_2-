import kotlin.math.pow
fun main() {
    try {
        println("Введите значение x")
        var x= readLine()!!.toDouble()
        if (x<0){
            val f=4.0
            println(f)
        }
        if (0<=x&&x<1) {
             val a = x.pow(2.0) + 3 * x + 4
            println(a)
        }
        if (x>1) {
            val b =x + 7
            println(b)
        }
    }catch (e:Exception){
        println("Что то не то")}
}