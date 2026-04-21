package Package1;

import Package2.ClassB;

public class ClassA {

    public void methodA() {
        System.out.println("Inside ClassA - methodA()");

        ClassB b = new ClassB();
        b.methodB();
    }
}
