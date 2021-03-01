class Sportsmen {
    fun getVodonos(vodonos: Vodonos){
        vodonos.bringWater()
    }
    inline fun getVodonos(bringWater: ()-> Unit){
        bringWater()
    }
}