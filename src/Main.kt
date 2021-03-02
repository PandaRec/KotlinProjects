fun main() {
 val list = CustomList<String>()

    for(i in 0..100){
        list.add("$i")
    }

   list.removeAt(1)
//
  list.remove("10")
    for(i in 0 until list.size()){
        println(list.get(i))
    }


}















