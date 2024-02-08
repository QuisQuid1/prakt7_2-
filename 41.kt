fun main(){
    println("Введите a")
    var a= readLine()!!.toDouble()
    println("Введите b")
    var b= readLine()!!.toDouble()
    println("Введите c")
    var c= readLine()!!.toDouble()
    println("Введите u")
    val u= readLine()!!.toDouble()
    println("Введите v")
    var v= readLine()!!.toDouble()
    var min=Int.MAX_VALUE
    var max=Int.MIN_VALUE
    for(x in u.toInt()..v.toInt())
    {
        var y = (x * a * x) + (x * b) + c
        if (y<min)
        {
            min= y.toInt()
        }
        if(y>max)
        {
            max= y.toInt()
        }
    }
    println("Наибольшее на отрезке $max")
    println("Наименьшее на отрезке $min")
}