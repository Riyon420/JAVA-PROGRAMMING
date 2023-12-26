class testMethod {

    int x, y, z, p; // Instance Variable

    testMethod() { // constuctors
        System.out.println("Hi, I am in constructors Block");

    }

    testMethod(int a) {
        x = a;
        System.out.println("The value of a=" + x);

    }

    testMethod(int a, int b) {
        x = a;
        y = b;
        z = x + y;
        System.out.println("a+b=" + z);
    }

    public static void main(String[] args) {
        testMethod t = new testMethod(5, 6);

    }

}