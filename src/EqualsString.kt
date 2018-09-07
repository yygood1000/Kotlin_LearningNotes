/**
 * Kotlin 中的字符串比较 与 java中的字符串比较 的异同
 * Kotlin中“==” 相当于java中的 equals()方法
 * 同时也可以在Kotlin中使用equals方法。重载方法的第二个参数意思是是否忽略大小写。
 */
fun main(args: Array<String>) {
    val name1 = "Yangy"
    val name2 = "Yangy"
    val name3 = "yangy"

    println("Yangy == Yangy =    ${name1 == name2}\n")
    println("Yangy == name3 =    ${name1 == name3}\n")
    println("Yangy.equals(yangy) =    ${name1.equals(name3)}\n")
    println("Yangy.equals(yangy, true) =    ${name1.equals(name3, true)}\n")
    println("Yangy.equals(yangy, false) =    ${name1.equals(name3, false)}\n")
}