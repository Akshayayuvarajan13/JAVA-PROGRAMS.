class SuperClass {

    int data = 10;

}

class SubClass extends SuperClass {

    int data = 50;

}

public class Shadowing {

    public static void main(String[] args) {

        SuperClass obj = new SubClass();

        System.out.println(obj.data);
    }
}