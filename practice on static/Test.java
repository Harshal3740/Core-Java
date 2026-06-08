class Test {
    static int x = 0;
    Test() { x++; }

    public static void main(String[] args) {
        Test t1 = new Test();
        Test t2 = new Test();
        System.out.println(x);
    }
}
