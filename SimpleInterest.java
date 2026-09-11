public class SimpleInterest {
    public static void main(String[] args) {
        double principal = 2500;
        double rate = 5;
        double time = 2;
        double simpleInterest = (principal * rate * time) / 100;
        System.out.println("Principal Amount = Rs. " + principal);
        System.out.println("Rate of Interest = " + rate + "%");
        System.out.println("Time = " + time + " years");
        System.out.println("Simple Interest = Rs. " + simpleInterest);
    }
}