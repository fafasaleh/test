import java.util.Scanner;

public class HelloWorld {

    static  Scanner input = new Scanner(System.in);
    static int f []= new int[5];


    public static void main(String[] args) {


        EnterNumbers();
        PrintNumbers();

    }

    public static void EnterNumbers() {

        System.out.println("Enter 5 Number :");
        for (int i = 0; i <f.length; i++) {
            f[i]=input.nextInt();
        }
    }


    public static void PrintNumbers(){
        System.out.println(" Numbers Are : ");
        System.out.print("[");

        for (int i = 0; i < f.length; i++) {

            if(i==f.length-1)
                System.out.print(f[i]);
            else
                System.out.print(f[i]+",");
        }
        System.out.print("]");
    }
}
