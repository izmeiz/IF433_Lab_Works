package oop_00000103511_FaiizAprioPratama.week03

class Employee(val name: String){
    var salary: Int = 0
        set(value) {
            if (value < 0){
                println("Error: Gaji tidak boleh negatif! Di-set ke 0.")
                field = 0
            } else {
                field = value
            }
        }

private var performanceRating: Int = 3

    fun increasePerformance(){
        performanceRating++
        println("Kinerja $ meningkat! Rating: $performanceRating")
    }

    fun printStatus(){
        println("Karyawan: $name, Rating: $performanceRating")
    }
}
