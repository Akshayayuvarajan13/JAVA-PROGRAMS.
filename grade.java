import java.io.*;

class grade {

    public static void main(String[] t) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter your marks1: ");
        int marks = Integer.parseInt(br.readLine());

        System.out.print("Enter your marks2: ");
        int marks2 = Integer.parseInt(br.readLine());

        System.out.print("Enter your marks3: ");
        int marks3 = Integer.parseInt(br.readLine());

        System.out.print("Enter your marks4: ");
        int marks4 = Integer.parseInt(br.readLine());

        System.out.print("Enter your marks5: ");
        int marks5 = Integer.parseInt(br.readLine());

        int total = marks + marks2 + marks3 + marks4 + marks5;

        System.out.println("Total Marks: " + total);

        int average = total / 5;

        System.out.println("Average: " + average);

        if (average >= 90) {
            System.out.println("Grade A");
        }
        else if (average >= 80) {
            System.out.println("Grade B");
        }
        else if (average >= 70) {
            System.out.println("Grade C");
        }
        else if (average >= 60) {
            System.out.println("Grade D");
        }
        else if (average >= 50) {
            System.out.println("Grade E");
        }
        else {
            System.out.println("Grade F");
        }
    }
}