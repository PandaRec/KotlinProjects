import java.lang.Exception
import java.lang.IndexOutOfBoundsException

class CustomList<T>: MyList<T> {
    private var array = arrayOfNulls<Any>(10)
    private var size = 0
    override fun get(index: Int): T {

        if(index in 0 until size){
            array[index]?.let { return it as T }
        }
        throw IndexOutOfBoundsException()

    }

    override fun add(obj: T) {
        if(size>=array.size){
            array = array.copyOf(array.size*2)
        }
        array[size] = obj
        size++
    }

    override fun remove(obj: T) {
        for((index,item) in array.withIndex()){
            if(item==obj){
                removeAt(index)
            }
        }
    }

    override fun removeAt(index: Int) {
        if(index in 0..size){
            for(i in index until size-1){
                array[i]=array[i+1]
            }
            size--
        }
        else{
            throw IndexOutOfBoundsException()
        }
    }

    override fun size()  = size

}