/**
 * Kotlin中的参数空值处理
 * 若要允许传入null值，在参数类型后加上“?”。表示允许传入null
 */
fun main(args: Array<String>) {
    setArgsAllowsNull(null)
//    setArgsNotNull(null)
}

fun setArgsAllowsNull(str: String?) {
    println("允许传入：$str")
}

@SuppressWarnings
fun setArgsNotNull(str: String) {
}
