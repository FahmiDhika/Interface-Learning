package Interface;

public class Oppo implements Phone {
    
    private int volume;
    private boolean isPowerOn; 
    
    public void Oppo(){
        this.volume = 0;
    }
    
    public int getVolume(){
        return this.volume;
    }
    
    @Override
    public void powerOn(){
        isPowerOn = true;
        System.out.println("Oppo Hape Sok Mahal ^^");
        System.out.println("Selamat Datang Di Oppo");
        System.out.println("Andoroid Version 14");
    }
    
    @Override
    public void powerOff(){
        isPowerOn = false;
        System.out.println("Hpnya mati cuy");
    }
    
    @Override
    public void volumeUp(){
        if (isPowerOn) {
            if (this.volume == MAX_VOLUME) {
                System.out.println("Volume mu penuh cuy");
                System.out.println(this.getVolume() + "%");
            } else {
                this.volume += 10;
                System.out.println("Volume : " + this.getVolume());
            }
        } else {
            System.out.println("Hp nya masih mati cuy ^^");
        }
    }
    
    @Override
    public void volumeDown(){
        if (isPowerOn) {
            if (this.volume == MIN_VOLUME) {
                System.out.println("Volume : 0%");
            } else {
                this.volume -= 10;
                System.out.println("Volume : " + this.getVolume());
            }
        } else {
            System.out.println("Nyalakan dulu hp nya cuy ^^");
        }
    }
}
