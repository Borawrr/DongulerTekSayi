import java.util.Scanner;

public class dongulerteksayi {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int sayi;
        int toplam = 0;

        while(true){

            System.out.print("Bir sayi giriniz (tek sayi girerseniz program sonlanir) : ");
            sayi = scanner.nextInt();

            if(sayi % 2 == 1){
                break;
            }

            if(sayi % 2 == 0){
                toplam += sayi;
            }
        
        
        }

        System.out.println("Tek sayi girilene kadar girilen cift sayilarin toplami : " + toplam);

        scanner.close();
        
    }
}
