import java.util.Scanner;
   
class Dashboard {
  public static void main(String args[]){
            
    Scanner input = new Scanner(System.in);
       
    int pilihan;
    char ulang;
     
    do {
      System.out.println("Wellcome Aleksius Aurelia to UTP A Cinema!"); 
      System.out.println("1. Pesan Tiket");
      System.out.println("2. Tampilkan Tiket Milik Saya ");
      System.out.println("3. Lihat Studio yang Ada");
      System.out.println("4. Lihat Detail Studio ");
      System.out.println("5. Top UP Saldo ");
      System.out.println("6. Exit Program ");

      System.out.println();
       
      System.out.print("Pick Your choice: ");
      pilihan = input.nextInt();
    
      switch(pilihan){
        case 1:
          System.out.println("1");
          break;
        case 2:
          System.out.println("R2");
          break;
        case 3:
          System.out.println("3");
          break;
        case 4:
          System.out.println("4");
          break;
        case 5:
          System.out.println("5");
          break;
        case 6:
          System.out.println("6");
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