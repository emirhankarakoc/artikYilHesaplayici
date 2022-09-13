import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        System.out.println("Artik yil hesaplayan programa hosgeldiniz.");
        System.out.println("========================================");
        System.out.println("Baslamak icin yil giriniz.");
        int yil;
Scanner scanner = new Scanner(System.in);
yil=scanner.nextInt();
if(yil%400==0)
{
    System.out.println(yil + " artik bir yildir!.!");
}
else{
    System.out.println(yil  + " artik bir yil degildir.!.");
}





    }
}