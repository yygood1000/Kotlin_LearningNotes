import java.util.*

fun main(args: Array<String>) {
    diaryGenerater("字符串模版测试内容")

    equalsString()

    setArgsAllowsNull(null)

    // 这么写会报错
//    setArgsNotNull(null)

    println(whenExpression(4))
    printArray()

    useList()
    map()
}

// 字符串模版
fun diaryGenerater(str: String) {
    val temp = "我是模版，传入的String为 ：$str "
    println(temp)
}

// 字符串比较
fun equalsString() {
    val name1 = "Yangy"
    val name2 = "Yangy"
    val name3 = "yangy"

    println("name1 == name2 :    ${name1 == name2}\n")
    println("name1 == name3 :    ${name1 == name3}\n")
    println("name1.equals(name3) :    ${name1.equals(name3)}\n")
    println("name1.equals(name3, true) :    ${name1.equals(name3, true)}\n")
    println("name1.equals(name3, false) :    ${name1.equals(name3, false)}\n")
}

fun setArgsAllowsNull(str: String?) {
    println("允许传入：$str")
}

@SuppressWarnings
fun setArgsNotNull(str: String) {
}

/**
 * when表达式
 * 类似与 switch ，但比 switch 强大
 */
fun whenExpression(num: Int): String {
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


// 数组的声明 与 循环的编写
fun printArray() {
    // val nums1 = 1..10 相当于 java 的 int nums1[] = {1,2,3,4,5,6,7,8,9,10};
    val nums1: IntRange = 1..10
    for (num in nums1) {
        print("$num ,")
    }

    println()

    // 相当于[1,10)，包前不包后
    val nums2: IntRange = 1 until 10
    for (num in nums2) {
        print("$num ,")
    }
    println()

    // 步长的表达，step表示步长， 后面跟的是步长的具体值
    for (num in nums2 step 2) {
        print("$num ,")
    }
    println("数组的长度为${nums2.count()}")
}

// list 的声明与遍历
fun useList() {
    val list = listOf("一", "二", "三", "四")

    // 带下标的list遍历，同时可以获取下标与值
    for ((index, value) in list.withIndex()) {
        println("$index  $value")
    }
}

// map 的声明与取值
fun map() {
    val map = TreeMap<String, String>()

    // 插入值
    map["第一"] = "first"
    map["第二"] = "second"
    map["第三"] = "third"
    map["第四"] = "fourth"

    println(map["第一"])
}

fun main(args: TreeMap<String, String>) {
    add(1, 2)
}

fun add(a: Int, b: Int): Int {
    return a + b
}

fun addSimple(a: Int, b: Int) = a + b



