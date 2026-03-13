package oop_00000103511_FaiizAprioPratama.Week06

class SmartSpeaker(
    override val id: String,
    override val name: String
) : SmartDevice, Switchable {
    override fun turnOn() {
    }

    override fun turnOff() {
    }

    fun PlayMusic(song: String){println("memutar lagu $song dari Spotify. ")}
}