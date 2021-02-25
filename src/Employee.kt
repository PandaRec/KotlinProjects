import java.time.LocalDate


class Employee(val name: String, val post: String, var year: Int) {

    val experience: Int
        get() :Int = LocalDate.now().year - year


    fun work() = println("Работаю...")

}