fun main() {

    val r = RectangleBox(3F, 4F, 5F)
    println(r.getVolume())
    println(r)
}

interface IFigure{
    fun getArea(): Float
    fun getPerimeter(): Float
}

open class Rect(protected val width: Float, protected val height: Float): IFigure{

    override fun getArea(): Float {
        return width * height
    }

    override fun getPerimeter(): Float {
        return 2*(width + height)
    }

    override fun toString(): String {
        return "$width; $height"
    }

}

class RectangleBox(width: Float, height: Float, private val lenght: Float) : Rect(width, height) {
    override fun getArea(): Float {
        return super.getPerimeter() * lenght
    }

    override fun getPerimeter(): Float {
        return 2 * (width * height + width * lenght + height * lenght)
    }

    fun getVolume(): Float {
        return super.getArea() * lenght
    }

    override fun toString(): String {
        return super.toString() + ""; "$lenght"
    }
}