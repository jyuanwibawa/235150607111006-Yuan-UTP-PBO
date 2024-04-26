import java.util.Scanner;
   
public class DaftarMenu {
  public static void main(String args[]){
            
    Scanner input = new Scanner(System.in);
       
    int pilihan;
    char ulang;
     
    do {
      System.out.println("UTP A Cinema"); 
      System.out.println("1. login");
      System.out.println("2. Register ");
      System.out.println("3. EXIT");
      System.out.println();
       
      System.out.print("Pick Your choice: ");
      pilihan = input.nextInt();
    
      switch(pilihan){
        case 1:
          System.out.println("Login");
          break;
        case 2:
          System.out.println("Register");
          break;
        case 3:
          System.out.println("Exit");
          break;
        default:
          System.out.println("Menu tidak tersedia");
      }
    
      System.out.println();
    
      System.out.print("Ingin memilih menu lain (y/t)? ");
      ulang = input.next().charAt(0);
       
      System.out.println();
    }
    while (ulang!= 't');
  
  }
}