package oop_00000103511_FaiizAprioPratama.Week05

abstract class PaymentMethod (val accountName: String) {
    abstract fun processPayment(amount: Double)
}