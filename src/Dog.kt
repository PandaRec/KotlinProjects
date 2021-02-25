class Dog {
    var name: String? = null
        get() = field?.toLowerCase()?.capitalize()


    var age: Int = 0
        set(value) {
            if (value >= 0)
                field = value
        }

    var weight: Int = 0
        set(value) {
            if (value >= 0)
                field = value
        }

}