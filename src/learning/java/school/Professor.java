package learning.java.school;



class Professor {
    private String name;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}


class Group {
    private Professor professor;
    private int availability;
    private Student[] students;

    Group(int availability) {
        this.availability = availability;
        students = new Student[availability];
    }

}

public class Application {

    public static void main(String[] args) {

    }
}