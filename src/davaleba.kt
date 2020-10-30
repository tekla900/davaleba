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