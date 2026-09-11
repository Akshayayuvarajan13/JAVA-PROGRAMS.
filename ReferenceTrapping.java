class TCSBox {
    int value = 10;
}

public class ReferenceTrapping {
    public static void main(String[] args) {

        TCSBox b1 = new TCSBox();

        TCSBox b2 = b1;  // b2 references the same object as b1

        b2.value = 50;   // modifying the value through b2

        System.out.println("b1 value: " + b1.value);
        System.out.println("b2 value: " + b2.value);
    }
}