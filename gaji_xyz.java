import java.util.Scanner;

public class gaji_xyz {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int user = in.nextInt();
        if (user<=5000000){
            System.out.println(user);
        } else if (user>5000000 && user<=15000000){
            user = user-(user/10);
            if (user<=5000000){
                System.out.println(5000000);
            } else{
                System.out.println(user);
            }
        } else if (user>15000000 && user<=50000000){
            user = user-(user/5);
            if (user<=15000000){
                System.out.println("15000000");
            }else {
                System.out.println(user);
            }
        }else if (user>50000000){
            user = user-(user*3/10);
            if (user<50000000){
                System.out.println("50000000");
            }else {
                System.out.println(user);
            }
        }
    }
}