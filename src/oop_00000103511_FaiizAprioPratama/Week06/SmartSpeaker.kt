package oop_00000103511_FaiizAprioPratama.Week06

class SmartSpeaker(
    override val id: String,
    override val name: String
) : SmartDevice, Switchable {
    override fun turnOn() {
        println("Speaker turned on")
    }

    override fun turnOff() {
        println("Speaker turned off")
    }

    fun PlayMusic(song: String){println("memutar lagu $song dari Spotify. ")}
}