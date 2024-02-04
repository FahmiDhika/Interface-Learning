package Interface;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        
        // membuat objek HP
        Phone galaxyA55 = new Samsung();

        // membuat objek user
        PhoneUser Fahmi = new PhoneUser(galaxyA55);

        // kita coba nyalakan HP-nya
        Fahmi.turnOnThePhone();
        
        // biar enak, kita buat dalam program
        Scanner input = new Scanner(System.in);
        String aksi; 

        while (true) {
            System.out.println("=== APLIKASI INTERFACE ===");
            System.out.println("[1] Nyalakan HP");
            System.out.println("[2] Matikan HP");
            System.out.println("[3] Perbesar Volume");
            System.out.println("[4] Mengecilkan Volume");
            System.out.println("[0] Keluar");
            System.out.println("--------------------------");
            System.out.print("Pilih -> ");
            aksi = input.nextLine();
            
            if(aksi.equalsIgnoreCase("1")){
                Fahmi.turnOnThePhone();
            } else if (aksi.equalsIgnoreCase("2")){
                Fahmi.turnOffThePhone();
            } else if (aksi.equalsIgnoreCase("3")){
                Fahmi.makePhoneLouder();
            } else if (aksi.equalsIgnoreCase("4")){
                Fahmi.makePhoneSilent();
            } else if (aksi.equalsIgnoreCase("0")){
                System.exit(0);
            } else {
                System.out.println("You Choose Wrong Interface!!!");
            }
        }

    }
}