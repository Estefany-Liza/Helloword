package model

class Camera {

    private var isOn: Boolean = false
    private var resolution: Int = 640
    private var zoom : Boolean = false
    private var flash : Boolean = false

    fun setFlash(flash : Boolean){
        this.flash = flash
    }
    fun getFlash() : Boolean{
        return this.flash
    }

    fun setZomm(zoom : Boolean){
        this.zoom = zoom
    }
    fun getZoom() : Boolean{
        return this.zoom
    }

    fun setResolution(resolution: Int){
        this.resolution = resolution
    }

    fun getResolution(): Int{
        return this.resolution
    }


    fun turnOn() {
        isOn = true
    }

    fun turnOff(){
        isOn = false
    }

    fun getCameraStatus(): String {
        return if (isOn) "Camera is Turned" else "Camera is not Turned"
    }

    /*fun setCameraStatus(onoff: Boolean){
        isOn = onoff
    }*/

}