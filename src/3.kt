//2
// import kotlin.math.max
//
//fun main(){
//
//    var f1 = Fraction(3F, 4F)
//
//    var f2 = Fraction(6F, 8F)
//
//    println(f1 == f2)
//    println(f1.toString())
//}
//
//class Fraction(n: Float, d: Float) {
//
//    private var numerator: Float = n
//    private var denominator: Float = d
//
//    override fun equals(other: Any?): Boolean {
//        if (other is Fraction) {
//            if (numerator * other.denominator / denominator == other.numerator) {
//                return true
//            }
//        }
//        return false
//    }
//
//    override fun toString(): String {
//        return "$numerator/$denominator"
//    }
//
//        fun usg(): Float{
//        val x = numerator
//        val y = denominator
//        val maxNum = max(x, y)
//        var usg = 1
//
//        for (i  in maxNum.toInt() downTo 0) {
//            if (x.toInt() % i == 0 && y.toInt() % i == 0)
//                usg = i;
//            break
//        }
//        return usg.toFloat()
//      }
//    val n = numerator / usg()
//    val d = denominator / usg()
//
//    fun add(other: Fraction): Float {
//        if (denominator == other.denominator) {
//            val x = numerator + other.numerator
//            val y = denominator
//        }
//        return numerator
//        return denominator
//
//    }
//
//    fun mul(other: Fraction): Float {
//        val x = numerator * other.numerator
//        val y = denominator * other.denominator
//        return println("$x / $y")
//    }
//
//}

//1
//fun main() {
//    val a = 8
//    val b = 4
//    println("$a, $b")
//    println(a.equals(b))
//
//    val x = 10
//    val y = 12
//    println("$x, $y")
//    println(x.equals(a))
//
//}
//
//class Point {
//    var x: Int = 1
//    var y: Int = 2
//    override fun toString(): String {
//        return "$x, $y"
//    }
//
//    override fun equals(other: Any?): Boolean {
//        if (other is Point) {
//            if (x == other.x && y == other.y) {
//                return true
//            }
//        }
//        return false
//    }
//
//
//    fun symmetrical() {
//        x = -x
//        return print("ამ წერტილის სიმეტრიული წერტილი Y ღერძის მიმართ იქნება: ($x. $y)")
//    }
//
//}