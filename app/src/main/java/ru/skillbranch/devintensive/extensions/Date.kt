package ru.skillbranch.devintensive.extensions

import java.text.SimpleDateFormat
import java.util.*

const val SECOND = 1000L
const val MINUTE = 60 * SECOND
const val HOUR = 60 * MINUTE
const val DAY = 24 * HOUR



fun Date.format(pattern: String="HH:mm:ss dd.MM.yy"):String {
    val dateFormat = SimpleDateFormat(pattern, Locale("ru"))
    return dateFormat.format(this)
}
fun Date.add(value: Int, units: TimeUnits = TimeUnits.SECOND) : Date{
    var time = this.time

    time += when(units){
        TimeUnits.SECOND -> value * SECOND
        TimeUnits.MINUTE -> value * MINUTE
        TimeUnits.HOUR-> value * HOUR
        TimeUnits.DAY-> value * DAY

    }
    this.time = time
    return this
}

enum class TimeUnits{
    SECOND,
    MINUTE,
    HOUR,
    DAY

}
fun Date.humanizeDiff(): String {

//форматируем дату входа пользователя
//ДНИ
//1, 21-91, или 101,201,301 день, 5,6,7,8, 9, 10, 11 20, или  25-30 дней, 2,3,4, 22,23,24 - 92,93,94, или 102,103,104,122,123-194 до 364 дня, вчера, позавчера, минут, минуту, секунд, секунду, больше года
//ЧАСЫ
//1 час, 21 час, 2 - 4, 22,23 часа, 5-20 часов
//МИНУТЫ
//1 минута, 2-3-4 минуты, 5-20 минут
//СЕКУНДЫ
//1,21,31,41,51 секунду, 2,3,4 - 22 и до 54 секуды, 5,6 -20 и до 59 секунд
/*ЛОГИКА склонять дату пользователя, был более 1 года назад, или 364 дня, 10 часов(23 часа), 59 минут, 59 секунд*/
    var time = this.time
    var diff = this.time.minus(Date().time)
    println(diff)
    println(time)
    return time.toString()
}
