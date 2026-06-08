class Test9 {
    static int x = 5;

    public static void main(String[] args) {
        Test9 a = new Test9();
        Test9 b = new Test9();
        
        a.x = 10;
        System.out.println(x);
        System.out.println(a.x);
    }
}

