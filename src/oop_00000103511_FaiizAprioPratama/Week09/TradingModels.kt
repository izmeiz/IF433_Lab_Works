package oop_00000103511_FaiizAprioPratama.Week09

data class TradeLog(
    val pair: String,
    val position: String,
    val leverage: Int,
    val roe: Double,
    val status : String
)