fun main( {
     val rav4: CarFactory = CarFactory()
    rav4.name = "Toyota Rav 4"
    rav4.color = "Yellow"
    rav4.withTurbo = false
    rav4.year = 2017
    rav4.maxSpeed = 180

    rav4.printCarInfo()
    rav4.coloring("Yellow")
    rav4.printCarInfo()
})

class CarFactory{
    var name: String = ""
    var maxSpeed: Int = 0
    var year: Int = 0
    var withTurbo: Boolean = false
    var color: String = ""

    fun printCarInfo() {
        println(""$name - $year - $color")
    }

    fun coloring(color: String) {
        if (color == this.color) {
            println("Same color")
        } else {
            print("Coloring...")
            this.color = color
        }
    }

    var tucson = CarFactory()
            tucson.name = "Hyundai Tucson"

tucson.year = 2012
tucson.color = "Blue"
tuscos.maxSpeed = 200
tucson.withTurbo = true
tucson.printCarInfo()
}