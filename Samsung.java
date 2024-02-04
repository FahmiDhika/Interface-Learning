package Interface;

public class Samsung implements Phone {
    
    private int volume;
    private boolean isPowerOn;

    public void Samsung(){
        this.volume = 50;
    }

    @Override
    public void powerOn() {
        isPowerOn = true;
        System.out.println("Phone is On");
        System.out.println("Welcome To Samsung Galaxy A55");
        System.out.println("Android version 14");
    }

    @Override
    public void powerOff() {
        isPowerOn = false;
        System.out.println("Phone is Off");
    }

    @Override
    public void volumeUp() {
        if (isPowerOn) {
            if (this.volume == MAX_VOLUME) {
                System.out.println("Volume FULL!!");
                System.out.println("Done " + this.getVolume() + "%");
            } else {
                this.volume += 10;
                System.out.println("Volume : " + this.getVolume());
            }
        } else {
            System.out.println("Turn On The Phone First!!");
        }
    }

    @Override
    public void volumeDown() {
        if (isPowerOn) {
            if (this.volume == MIN_VOLUME) {
                System.out.println("Volume = 0%");
            } else {
                this.volume -= 10;
                System.out.println("Volume : " + this.getVolume());
            }
        } else {
            System.out.println("Turn On The Phone First!!");
        }
    }

    public int getVolume() {
        return this.volume;
    }
}