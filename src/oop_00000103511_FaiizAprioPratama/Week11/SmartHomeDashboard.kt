package oop_00000103511_FaiizAprioPratama.Week11

fun main() {
    val homeDevices = mutableListOf<SmartDevice>()

    SmartDevice("Philips WiZ Living Room", "Lighting").apply {
        isOnline = true
        powerLoad = 12
    }.also {
        homeDevices.add(it)
    }

    SmartDevice("Ezviz Outdoor", "Camera").apply {
        isOnline = true
        powerLoad = 5
    }.also {
        println("(LOG) Kamera terhubung")
        homeDevices.add(it)
    }

    val acDevice = run {
        SmartDevice("Daikin Inverter (Kabel 3x2.5)", "HVAC", false, 800)
    }
    homeDevices.add(acDevice)
    homeDevices.add(SmartDevice("Picolo's Auto Feeder", "Pet Care", true, 10))

    val searchResult = homeDevices.find { it.category == "Camera" }
    searchResult?.let {
        println("\n-- Hasil Pencarian Kategori Camera --")
        println(it.diagnose())
        println("-------------------------------------")
    }

    println("\n================ SUMMARY SMART HOME ================")
    with(homeDevices) {
        println("Jumlah Perangkat Terdaftar : ${this.size} unit")
    }

    val totalPower = homeDevices.run { sumOf { it.powerLoad } }
    println("Total Beban Daya Sistem    : $totalPower Watt")
    println("====================================================")

    println("\nRINCIAN DIAGNOSTIK SISTEM:")
    homeDevices.forEach {
        println(it.diagnose())
    }
}