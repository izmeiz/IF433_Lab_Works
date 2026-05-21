package oop_00000103511_FaiizAprioPratama.Week12

fun main() {
    println("=== TEST RUNCATCHING ===")
    val result: Result<Int> = runCatching{
        "42X".toInt()
    }
}