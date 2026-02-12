package oop_00000103511_FaiizAprioPratama.Week1

fun main() {
    //Menggunakan Val
    val name: String = "John Thor"
    val score: Int = 80

    //Concatenation
    println("Nama: $name, Nilai: $score")
    //control flow when expression
    val grade = when (score) {
        in 90..100 -> "A"
        in 80..89 -> "B"
        in 70..79 -> "C"
        else -> "D"
    }

    println ("Grade kamu: $grade")
    println("Staus: ${calculateStatus(score)}")

    //null safety
    val studentId: String? = null

    //Jika null, nilai default 0
    val idLength = studentId?.length ?: 0
    println("Panjang ID: $idLength")
}
fun calculateStatus(score: Int) = if (score > 75) "Lulus" else "Tidak Lulus"