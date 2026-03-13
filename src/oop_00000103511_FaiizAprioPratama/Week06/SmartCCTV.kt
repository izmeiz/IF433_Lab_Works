package oop_00000103511_FaiizAprioPratama.Week06

class SmartCCTV(
    override val id: String,
    override val name: String
) : SmartDevice, Switchable, Recordable {
    override fun turnOn() {
        println("[$id] $name: Mengaktifkan sensor kamera....")
       startRecord()
    }

    override fun turnOff() {
        stopRecord()
        println("[$id] $name: Kamera dinonaktifkan.")
    }

    override fun startRecord() {
        println("[$id] $name: Perekaman dimulai (resolusi 1080)...")
    }

}