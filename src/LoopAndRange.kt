/**
 * 循环表达式的简易实现
 * 区间变量的声明
 */
fun main(args: Array<String>) {
    // 比区间区间数字数组声明
    val range1 = 1..10
    // 前闭后开（包前不包后）区间数字数组声明
    val range2 = 1 until 10
    // 递减数字数组声明
    val range3 = 10 downTo 2 step 2

    // 输出闭区间数组数据
    printRange1ByFor(range1)
    // 输出前闭后开区间数组数据
    printRange2ByFor(range2)
    // 输出前闭后开区间数组数据
    printRange3ByFor(range3)
}

/**
 * 输出闭区间数组数据
 */
private fun printRange1ByFor(range: IntRange) {
    for (num in range) {
        println("range1：$num")
    }
}

/**
 * 输出前闭后开区间数组数据
 */
private fun printRange2ByFor(range: IntRange) {
    for (num in range) {
        println("range2：$num")
    }
}

/**
 * 输出前闭后开区间数组数据
 */
private fun printRange3ByFor(range: IntProgression) {
    for (num in range) {
        println("range3：$num")
    }
}