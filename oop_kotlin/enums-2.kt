enum class Day(val value: Int){
    MONDAY(1), TUESDAY(2), WEDNESDAY(3),
    THURSDAY(4), FRIDAY(5), SATURDAY(6), SUNDAY(100500)
}
 
fun main(args: Array<String>) {
 
    val day: Day = Day.FRIDAY
    println(day.value)        // 5
    println(Day.MONDAY.value) // 1
}