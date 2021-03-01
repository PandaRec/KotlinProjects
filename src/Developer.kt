class Developer(name:String, age:Int,val language:String): Employee(name, age) {
    //val language: String = ""
    override fun work() = println("Пишу код на $language")


}