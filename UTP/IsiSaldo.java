import java.util.Scanner;

/**
 * IsiSaldo
 */
public class IsiSaldo {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int IsiSaldo ;

        System.out.println("Top Up");
        System.out.println("Massukan saldo yang ingin di topup  :");
        IsiSaldo= in.nextInt();
        System.out.println("Top  berhasil");
        System.out.println("Rp. "+IsiSaldo+".00");
        

    }
}