import org.omg.CORBA.Object

/**
 * 循环表达式的简易实现
 * 区间变量的声明
 */
fun main(args: Array<String>) {
    // 声明指定的数字数组
    var intArray: IntArray = intArrayOf(1, 2, 3)
    var doubleArray: Array<Double> = arrayOf(2.0, 3.0, 4.0)
    var doubleArray2: DoubleArray = doubleArrayOf(2.0, 3.0, 4.0)

//    var str_array:

    // TODO 如何声明一个自定义类型的数组


    // 比区间区间数字数组声明
    val range1: IntRange = 2..10

    // 前闭后开（包前不包后）区间数字数组声明F
    val range2 = 1 until 10

    // 递减数字(步长为2)数组声明
    val range3 = 10 downTo 2 step 2

    printRange("range1", range1)
    printRange("range2", range2)
    printRange("range3", range3)
}

private fun printRange(name: String, range: IntProgression) {
    for (num in range) {
        println("$name：$num")
    }
}
