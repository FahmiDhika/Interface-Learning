package Interface;

public class iPhone implements Phone {
    
    private int volume;
    private boolean isPowerOn;
    
    public void iPhone(){
        this.volume = 0;
    }
    
    public int getVolume(){
        return this.volume;
    }
    
    @Override
    public void powerOn(){
        isPowerOn = true;
        System.out.println("iPhone, The New Phone Era");
        System.out.println("Welcome To Apple Ecosystem");
        System.out.println("iOS Version 17");
    }
    
    @Override
    public void powerOff(){
        isPowerOn = false;
        System.out.println("The Phone is Off");
    }
    
    @Override
    public void volumeUp(){
        if (isPowerOn) {
            if (this.volume == MAX_VOLUME) {
                System.out.println("The Volume is Max");
                System.out.println(this.getVolume() + "%");
            } else {
                this.volume += 10;
                System.out.println("Volume : " + this.getVolume());
            }
        } else {
            System.out.println("The Phone Still Off");
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
            System.out.println("Turn On The Phone First");
        }
    }
}
