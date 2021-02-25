
fun main() {

val emp = Employee("name","root",2000)
    println(emp.experience)
    emp.year = 1999
    println(emp.experience)

    emp.printInfo()


}

fun Employee.printInfo(){
    println(this.name)
    println(this.experience)
    println(this.post)
    println(this.year)


}















