package oop_00000103511_FaiizAprioPratama.week04

class ElectricCar (brand: String, numberOfDoors: Int, val batteryCapacity: Int) : Car(brand, numberOfDoors) {

    final override fun accelerate() {
        println("$brand berakselarasi dalam sunyi. Kapasitas baterai: $batteryCapacity%.")
    }
}