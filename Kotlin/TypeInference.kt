package demo

fun main() {
    // Khai báo có chỉ rõ kiểu
    val list1: ArrayList<String> = ArrayList<String>()
    
    // Type inference: Kotlin tự suy ra kiểu
    val list2 = ArrayList<String>()

    list1.add("Java")
    list2.add("Kotlin")

    println(list1)
    println(list2)
}
