package oop_00000103511_FaiizAprioPratama.Week06

fun main () {
    val smartHub = SmartHomeHub ()
    val lampuTamu = SmartLamp("L-01", name = "Ruang Tamu")
    val speakerDapur = SmartSpeaker ("S-01", name = "Google Nest Dapur")
    val cctvGarasi = SmartCCTV ("C-01", name = "Ezviz Garasi")

    println("==== INISIALISASI SISTEM =====")
    smartHub.addDevice(lampuTamu)
    smartHub.addDevice(speakerDapur)
    smartHub.addDevice(cctvGarasi)

    println("\n==== SIMULASI PENGGUNAAN HARIAN ====")
    lampuTamu.turnOn()
    speakerDapur.turnOn()
    cctvGarasi.turnOn()

    smartHub.activateSecurityMode()
    smartHub.turnOffAllSwitches()
}