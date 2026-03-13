package oop_00000103511_FaiizAprioPratama.Week06

interface SmartDevice {
    val id: String
    val name: String
}

interface Switchable{
    fun turnOn()
    fun turnOff()
}

interface Recordable {
    fun startRecord()
    fun stopRecord(){println("Perekaman dihentikan dan akan disimpan ke Cloud")}
}