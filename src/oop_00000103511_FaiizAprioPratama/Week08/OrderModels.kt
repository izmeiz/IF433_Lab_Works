package oop_00000103511_FaiizAprioPratama.Week08

class City (val name: String)
class Address(val city: City?)
class DeliveryDetails(val address: Address?)
class Order(val deliveryDetails: DeliveryDetails?, val totalPrice: Int?)