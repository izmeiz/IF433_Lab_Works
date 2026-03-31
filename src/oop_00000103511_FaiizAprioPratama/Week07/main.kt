package oop_00000103511_FaiizAprioPratama.Week07

fun main(){
    println("=== TEST SINGLETON ===")
    println("Status: ${DatabaseManager.connectionStatus}")
    DatabaseManager.connect()

    println("\n=== TEST COMPANION OBJECT ===")
    val client = NetworkClient.createClient()
    client.connect()

    println("\n=== TEST GAME MANAGER (SINGLETON) ===")
    GameManager.startGame()
    GameManager.startGame()
}