fun main() {
    val list = mutableListOf<Employee>()
    for(i in 1..10){
        list.add(Employee("Employee $i",i))
    }

    for(i in 1..10){
        list.add(Developer("Employee $i",i,"Language $i"))
    }

    for (i in 0 until list.size){
        println("name: ${list[i].name}")
        list[i].work()
    }


}















