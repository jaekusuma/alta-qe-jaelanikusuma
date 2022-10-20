import java.util.Scanner;
public class Problem3FaktorBilangan {
    public static void main (String[]args){
        Scanner n = new Scanner(System.in);
        int bilangan;

        System.out.print("input bilangan : ");
        bilangan = n.nextInt();

        System.out.println("faktor bilangan dari "+bilangan+" adalah : ");
        for (int i=1; i<=bilangan;i++){
            if (bilangan%i == 0){
                System.out.print(i+" ");
            }
        }
    }
}
