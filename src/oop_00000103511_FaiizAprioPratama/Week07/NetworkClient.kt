package oop_00000103511_FaiizAprioPratama.Week07

class NetworkClient private constructor(val url: String) {
    fun connect() {
        println("Connecting to $url")
    }
}