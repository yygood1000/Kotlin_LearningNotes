import android.text.TextUtils
import android.util.Log

/**
 * 字符串模板 主要用来进行字符串的拼接。类似于java的字符串‘+’加号拼接字符串
 */
fun main(args: Array<String>) {
    stringTemplate1("测试1")
    stringTemplate2("测试2", "测试2")
    stringTemplate3("测试3")
    stringTemplate4("测试4")
    stringTemplate5("测试5")
}

/**
 * 简单的字符串模板
 */
fun stringTemplate1(str: String) {
    println("字符串模板：$str");
}

/**
 * 输出中包含$
 */
fun stringTemplate2(str1: String, str2: String) {
    println("字符串模板：$str1 123 \$ $str2 456");
}

/**
 * 输出中有if表达式
 */
fun stringTemplate3(str: String) {
    println("字符串模板：${if (str.isNotEmpty()) str else "空字符串"}")
}

/**
 * 输出中有when表达式
 */
fun stringTemplate4(str: String) {
    println("字符串模板：${when {(str.isNotEmpty()) -> str
        else -> "空字符串"
    }}")
}

/**
 * 双引号中嵌套双引号
 */
fun stringTemplate5(str: String) {
    println("字符串模板：${"$str，双引号嵌套"}")
}