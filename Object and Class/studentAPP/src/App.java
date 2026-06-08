class App {

    public static void main(String[] args) {

        Student student = new Student();

        student.setrollno(11);
        student.setname("Harshal");
        student.setmarks(66.66);

        student.displaystudentInfo();

        System.out.println("---------------------------");

        System.out.println("Marks : " + student.getmarks());
        System.out.println("Grade : " + student.grade());
    }
}