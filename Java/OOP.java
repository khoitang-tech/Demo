package demo;

class Student {
    private String id;
    private String name;
    private String email; // Có thể null nếu sinh viên chưa có email

    public Student(String id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public String getId() { return id; }
    public String getName() { return name; }
    public String getEmail() { return email; }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}


public class OOP {
	public static void main(String[] args) {
		Student student = new Student("SV001", "Nguyen Van A", null);

        String emailToDisplay;
        if (student.getEmail() != null) {
            emailToDisplay = student.getEmail().toUpperCase();
        } 
        else {
            emailToDisplay = "CHƯA CẬP NHẬT";
        }
        System.out.println("Tên SV: " + student.getName() + " | Email: " + emailToDisplay);
        System.out.println("Chi tiết: " + student.toString());
        //System.out.println("Chi tiết: " + student);
	}
}
