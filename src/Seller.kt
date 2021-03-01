class Seller(name: String, age:Int) : Employee(name, age),Clean {
    override fun work() {
        println("seller works")
    }

    override fun clean() {
        println("seller cleaning")
    }

}