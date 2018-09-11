import java.util.*

/**
 * main函数，程序的入口
 */
fun main(args: Array<String>): Unit {
    println("Hello Kotlin")

    printArray()
    useList()
    map()
}


// array的声明 与 for循环的编写
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
//    println("数组的长度为" + nums2.count())

    // 声明倒序数字数组
    val array = 10 downTo 2
    for (a in array) {

    }
}

// List集合 的声明与遍历
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



