package oop_00000103511_FaiizAprioPratama.Week06

class SmartLamp(
    override val id: String,
    override val name: String
) : SmartDevice, Switchable {
    override fun turnOn() {
        println("[$id] $name: Lampu menyala dengan kecerahan standar.")
    }
    override fun turnOff() {
        println("[$id] $name: Lampu dimatikan. Menghemat energi...")
    }
}