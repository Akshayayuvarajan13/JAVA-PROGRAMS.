import java.util.Scanner;
class BusSeatAssignment{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[][] seats = new int[5][4];
        for (int i=0;i<5;i++){
            for (int j=0;j<4;j++){
                seats[i][j] = 0;
            }
        }
        System.out.println("BUS SEAT ASSIGNMENT");
        System.out.println("\n Available Seats:");
        for(int i=0;i<5;i++){
            for(int j=0;j<4;j++){
                System.out.print("["+(i+1)+","+(j+1)+"]");
            }
            System.out.println();
        }
        System.out.print("\n Enter row number(1-5):");
        int row=sc.nextInt();
        System.out.print("Enter seat number(1-4):");
        int seat = sc.nextInt();
        if(row<1 || row>5 || seat<1 || seat>4){
            System.out.println("Invalid seat selection!");
        }
        else if(seats[row-1][seat-1]==1){
            System.out.println("Seat is already booked!");
        }
        else{
            seats[row-1][seat-1]=1;
            System.out.println("Seat booked successfully");
        }
        System.out.println("\n Final Seat Arrangement:");
        for(int i=0;i<5;i++){
            for(int j=0;j<4;j++){
                if(seats[i][j] == 0){
                    System.out.print("[Available]");
                }
                else{
                    System.out.print("[Booked]");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}