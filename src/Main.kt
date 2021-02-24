

fun main() {
    val data = mapOf(
            "Январь" to listOf(100,100,100,100), // 400
            "Февраль" to listOf(200,200,-190,200),
            "Март" to listOf(300,180,300,100), // 880
            "Апрель" to listOf(250,-250,100,300),
            "Май" to listOf(200,100,400,300), //1000
            "Июнь" to listOf(200,100,300,300), // 900
            )

    printInfo(data)


}
fun printInfo(data: Map<String,List<Int>>):Unit{
    // средняя в неделю
    // средняя в месяц
    // макс в месяц + название
    // мин в месяц + название
    // месяцы в которых ошибка

    val mapWithErrors = data.filter { it.value.any { it<0 } }
    val mapWithoutErrors = data.filter { it.value.all { it>=0 } }

    val averageInWeek = mapWithoutErrors.flatMap { it.value }.average()
    val averageInMonth = mapWithoutErrors.flatMap { it.value }.sum().toDouble()/mapWithoutErrors.size

    val maxInMonthValues = mapWithoutErrors.map { it.value.sum() }.max()
    val minInMonthValues = mapWithoutErrors.map { it.value.sum() }.min()


    val maxInMonthsNames = mapWithoutErrors.filter { it.value.sum()==maxInMonthValues }
    val minInMonthsNames = mapWithoutErrors.filter { it.value.sum()==minInMonthValues }

    println(averageInWeek)
    println(averageInMonth)
    println(maxInMonthValues)
    for(month in maxInMonthsNames){
        println(month.key)
    }
    println(minInMonthValues)
    for(month in minInMonthsNames){
        println(month.key)
    }

    for(month in mapWithErrors){
        println(month.key)
    }







}











