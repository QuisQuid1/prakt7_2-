fun main() {
    try{
        println("Введите N")
        var n= readLine()!!.toInt()
        when {
            n%3==0 -> println("$n кратно трем")
            else-> println("$n не кратно трем")
        }
    }catch (e:Exception) {println("Что то не то")}
}