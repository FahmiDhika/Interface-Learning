package Interface;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        
        // membuat objek HP
        Phone samsung = new Samsung();
        Phone oppo = new Oppo();
        Phone iphone = new iPhone();
        Phone xiaomi = new Xiaomi();

        // membuat objek user
        PhoneUser sumsang = new PhoneUser(samsung);
        PhoneUser poop = new PhoneUser(oppo);
        PhoneUser phonei = new PhoneUser(iphone);
        PhoneUser siomay = new PhoneUser(xiaomi);
        
        Scanner input = new Scanner(System.in);
        int aksi; 
        
        
        System.out.print("Masukkan HP Yang Ingin Dilihat Interfacenya : ");
        String hape = input.nextLine();
        
        switch(hape){
            case "Samsung":
                while(true){
                System.out.println("=== APLIKASI INTERFACE ===");
                System.out.println("[1] Nyalakan HP");
                System.out.println("[2] Matikan HP");
                System.out.println("[3] Perbesar Volume");
                System.out.println("[4] Mengecilkan Volume");
                System.out.println("[0] Keluar");
                System.out.println("--------------------------");
                System.out.print("Pilih -> ");
                aksi = input.nextInt();

                if(aksi == 1){
                    sumsang.turnOnThePhone();
                } else if (aksi == 2){
                    sumsang.turnOffThePhone();
                } else if (aksi == 3){
                    sumsang.makePhoneLouder();
                } else if (aksi == 4){
                    sumsang.makePhoneSilent();
                } else if (aksi == 0){
                    System.exit(0);
                } else {
                    System.out.println("Salah");
                }
            }
        
            case "Oppo":
                while (true) {
                System.out.println("=== APLIKASI INTERFACE ===");
                System.out.println("[1] Ini Untuk Nyalakan HP");
                System.out.println("[2] Ini Untuk Matikan HP");
                System.out.println("[3] Ini Untuk Perbesar Volume");
                System.out.println("[4] Ini Untuk Mengecilkan Volume");
                System.out.println("[0] Ini Untuk Keluar");
                System.out.println("--------------------------");
                System.out.print("Silahkan Pilih Cuy -> ");
                aksi = input.nextInt();

                if(aksi == 1){
                    poop.turnOnThePhone();
                } else if (aksi == 2){
                    poop.turnOffThePhone();
                } else if (aksi == 3){
                    poop.makePhoneLouder();
                } else if (aksi == 4){
                    poop.makePhoneSilent();
                } else if (aksi == 0){
                    System.exit(0);
                } else {
                    System.out.println("Interface Yang Dipilih Salah cuy ^^");
                }
                }
                
            case "iPhone":
                while (true) {
                System.out.println("=== INTERFACE APPLICATION ===");
                System.out.println("[1] Turn On The Phone");
                System.out.println("[2] Turn Off The Phone");
                System.out.println("[3] Increase The Volume");
                System.out.println("[4] Decrease The Volume");
                System.out.println("[0] Go Out");
                System.out.println("--------------------------");
                System.out.print("Choose -> ");
                aksi = input.nextInt();

                if(aksi == 1){
                    phonei.turnOnThePhone();
                } else if (aksi == 2){
                    phonei.turnOffThePhone();
                } else if (aksi == 3){
                    phonei.makePhoneLouder();
                } else if (aksi == 4){
                    phonei.makePhoneSilent();
                } else if (aksi == 0){
                    System.exit(0);
                } else {
                    System.out.println("Wrong Choice");
                }
                }
                
            case "Xiaomi":
                while (true) {
                System.out.println("=== Jiēkǒu yìngyòng ===");
                System.out.println("[1] Dǎkāi shǒujī");
                System.out.println("[2] Guān diào shǒujī");
                System.out.println("[3] Zēngjiā yīnliàng");
                System.out.println("[4] Diào dī yīnliàng");
                System.out.println("[0] Chūqù");
                System.out.println("--------------------------");
                System.out.print("Xuǎnzé -> ");
                aksi = input.nextInt();

                if(aksi == 1){
                    siomay.turnOnThePhone();
                } else if (aksi == 2){
                    siomay.turnOffThePhone();
                } else if (aksi == 3){
                    siomay.makePhoneLouder();
                } else if (aksi == 4){
                    siomay.makePhoneSilent();
                } else if (aksi == 0){
                    System.exit(0);
                } else {
                    System.out.println("Cuòwù de xuǎnzé");
                }
                }
        }
    }
}
