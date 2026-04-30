package oop_00000103511_FaiizAprioPratama.Week09

fun main(){
    val tradeHistory = listOf(
        TradeLog(pair = "BTCUSDT", position = "LONG", leverage = 50, roe = 15.5, status = "CLOSED"),
        TradeLog(pair = "ETHUSDT", position = "SHORT", leverage = 20, roe = -5.2, status = "CLOSED"),
        TradeLog(pair = "BTCUSDT", position = "SHORT", leverage = 100, roe = 45.0, status = "OPEN"),
        TradeLog(pair = "BNBUSDT", position = "LONG", leverage = 10, roe = -2.5, status = "CLOSED"),
        TradeLog(pair = "ETHUSDT", position = "LONG", leverage = 25, roe = 8.4, status = "CLOSED"),
        TradeLog(pair = "BTCUSDT", position = "LONG", leverage = 50, roe = -12.0, status = "OPEN")
    )
//Cetak Data
    println("Berhasil memuat ${tradeHistory.size} log perdagangan.")
}