fun main() {
    val list = mutableListOf<Employee>()


    for(i in 1..10){
        list.add(Developer("Developer $i",i,"Language $i"))
    }

    for(i in 1..10){
        list.add(Seller("Seller $i",i,))
    }


//    for (i in 0 until list.size){
//        println("name: ${list[i].name}")
//        list[i].work()
//
//    }

    for( worker in list){
        worker.work()
        if(worker is Clean)
            worker.clean()
    }


}















