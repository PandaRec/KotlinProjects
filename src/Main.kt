fun main() {
    val db = Database
    db.insertData("1")
    db.insertData("2")
    val db2 = Test()
    db2.insert("3")

    for (str in db.data)
        println(str)



}















