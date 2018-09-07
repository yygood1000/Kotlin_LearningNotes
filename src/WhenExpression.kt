import android.text.TextUtils

fun main(args: Array<String>) {
    println(whenExpression(1))
    println(whenExpression(""))
    println(whenExpression("杨洋"))
}

/**
 * when表达式
 * 类似与 switch ，但比 switch 强大
 */

private fun whenExpression(num: Int): String {
    val result = when (num) {
        0 -> "传入数字的中文是 ： 零"
        1 -> "传入数字的中文是 ： 一"
        2 -> "传入数字的中文是 ： 二"
        3 -> "传入数字的中文是 ： 三"
        4 -> "传入数字的中文是 ： 四"
        5 -> "传入数字的中文是 ： 五"
        else -> "找不到传入参数"
    }
    return result
}

/**
 * when 表达式进行if判断
 */
private fun whenExpression(str: String): String {
    val result = when {
        str.isEmpty() -> "空字符串"
        else -> str
    }
    return result
}