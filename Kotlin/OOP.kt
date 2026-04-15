data class Student(val id: String, val name: String, val email: String?) 

fun main() {
    val student = Student("SV001", "Nguyen Van A", null)
    val emailToDisplay = student.email?.uppercase() ?: "CHƯA CẬP NHẬT"
    println("Tên SV: ${student.name} | Email: $emailToDisplay")
    println("Chi tiết: $student")
}
