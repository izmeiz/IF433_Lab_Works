package oop_00000103511_FaiizAprioPratama.Week12

class InsufficientCapacityException (
    val amount: Double,
    val balance : Double,
) : Exception("Attempted $amount, balance: $balance")