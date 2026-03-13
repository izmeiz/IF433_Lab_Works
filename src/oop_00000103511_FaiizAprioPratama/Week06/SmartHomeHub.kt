package oop_00000103511_FaiizAprioPratama.Week06

class SmartHomeHub {
    val devices = mutableListOf<SmartDevice>()

    fun addDevice(device: SmartDevice) {
        devices.add(device)
        println("Sistem: ${device.name} (ID: ${device.id}) berhasil ditambahkan ke Hub.")
    }

    fun turnOffAllSwitches() {
        println("\n--- Menjalankan Protokal 'Matikan Semua' ---")
        for (device in devices) {
            if (device is Switchable){
                device.turnOff()
            }else {
                println("Sistem: ${device.name} tidak memiliki saklar daya (Skip).")
            }
        }
        println("--- Protokol Selesai ---")
    }
}