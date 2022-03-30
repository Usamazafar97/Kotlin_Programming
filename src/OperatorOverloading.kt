/*
* Created by usamazafar at 14/03/2022.
*/

data class Point(var x: Int, var y: Int): Comparable<Point>{

    // overloading plus operator
    operator fun plus(point: Point): Point{

        this.x += point.x
        this.y += point.y

        return this
    }

    // overloading minus operator
    operator fun minus(point: Point): Point{

        this.x -= point.x
        this.y -= point.y

        return this
    }

    //overloading increment
    operator fun inc():Point{
        this.x ++
        this.y ++

        return this
    }

    override fun compareTo(other: Point): Int {
        return compareValuesBy(this, other,Point::x,Point::y)
    }

    override fun equals(other: Any?): Boolean {
        if (other !is Point) return false
        return if (other === this) true
        else{
            this.x == other.x && this.y == other.y
        }
    }

}

fun main() {

    var p1 = Point(2,4)
    println(p1)
    val p2 = Point(5,6)
    val p3 = p1 + p2

    println(p3)

    println(p1)

    println(p1++)

    println(p2.compareTo(p1))

    println(p1 == p2)

}