import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Kamu bisa mengganti new Toshiba() dengan new Lenovo() atau new MacBook()
        Laptop laptopBaru = new Toshiba(); 
        LaptopUser user = new LaptopUser(laptopBaru);
        
        Scanner scanner = new Scanner(System.in);
        String input;

        System.out.println("=== APLIKASI KONTROL LAPTOP ===");
        System.out.println("Ketik 'ON'   untuk menyalakan laptop");
        System.out.println("Ketik 'OFF'  untuk mematikan laptop");
        System.out.println("Ketik 'UP'   untuk menambah volume");
        System.out.println("Ketik 'DOWN' untuk mengurangi volume");
        System.out.println("Ketik 'EXIT' untuk keluar aplikasi");
        System.out.println("===============================");

        boolean jalan = true;
        while (jalan) {
            System.out.print("\nMasukkan perintah: ");
            input = scanner.nextLine().toUpperCase();

            switch (input) {
                case "ON":
                    user.turnOnLaptop();
                    break;
                case "OFF":
                    user.turnOffLaptop();
                    break;
                case "UP":
                    user.makeLaptopLouder();
                    break;
                case "DOWN":
                    user.makeLaptopSilence();
                    break;
                case "EXIT":
                    System.out.println("Aplikasi dihentikan.");
                    jalan = false;
                    break;
                default:
                    System.out.println("Perintah tidak valid.");
            }
        }
        
        scanner.close();
    }
}