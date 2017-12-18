enum class Day(val value: Int){
    MONDAY(1), TUESDAY(2), WEDNESDAY(3),
    THURSDAY(4), FRIDAY(5), SATURDAY(6),
    SUNDAY(7)
}
 
fun main(args: Array<String>) {
 
    val day1: Day = Day.FRIDAY
    println(day1.name)        // FRIDAY
    println(day1.ordinal)     // 4
}