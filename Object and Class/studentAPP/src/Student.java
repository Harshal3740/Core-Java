class Student {

    int rollno;
    String name;
    double marks;

    // Display method
    void displaystudentInfo() {

        System.out.println("ID : " + rollno);
        System.out.println("Name : " + name);
        System.out.println("Marks : " + marks);
    }

    // Getter methods
    int getrollno() {
        return rollno;
    }

    String getname() {
        return name;
    }

    double getmarks() {
        return marks;
    }

    // Setter methods
    void setrollno(int no) {
        rollno = no;
    }

    void setname(String n) {
        name = n;
    }

    void setmarks(double m) {
        marks = m;
    }

    // Grade method
    String grade() {

        if (marks >= 75) {
            return "A";
        } else if (marks >= 60) {
            return "B";
        } else if (marks >= 35) {
            return "C";
        } else {
            return "Fail";
        }
    }
}