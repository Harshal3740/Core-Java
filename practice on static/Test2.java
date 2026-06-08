class Test2 {
    int x = 0;
    Test2() { x++; }

    public static void main(String[] args) {
        Test2 a = new Test2();
        Test2 b = new Test2();
        System.out.println(a.x + " " + b.x);
    }
}
