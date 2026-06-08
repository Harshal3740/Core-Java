class Test7 {
    static void sMethod() {
        System.out.println("Static");
    }

    void nsMethod() {
        System.out.println("Non-static");
    }

    public static void main(String[] args) {
        Test7 t7 = new Test7();
        t7.sMethod();
        t7.nsMethod(); 
    }
}
