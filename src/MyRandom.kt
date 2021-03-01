import kotlin.random.Random

class MyRandom {
    companion object{
        private const val MONDAY = "Monday"
        private const val TUESDAY = "Tuesday"
        private const val WEDNESDAY = "Wednesday"
        private const val THURSDAY = "Thursday"
        private const val FRIDAY = "Friday"
        private const val SATURDAY = "Saturday"
        private const val SUNDAY = "Sunday"
        fun random(startNum:Int, endNum:Int)=
            Random.nextInt(startNum,endNum)


        fun random() = Random.nextBoolean()

        fun randomDay():String {
            val listOfDays = mutableListOf<String>()
            listOfDays.add(MONDAY)
            listOfDays.add(TUESDAY)
            listOfDays.add(WEDNESDAY)
            listOfDays.add(THURSDAY)
            listOfDays.add(FRIDAY)
            listOfDays.add(SATURDAY)
            listOfDays.add(SUNDAY)

            return listOfDays.shuffled().first()




        }
    }
}