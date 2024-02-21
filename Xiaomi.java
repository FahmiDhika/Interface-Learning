package Interface;

public class Xiaomi implements Phone {
    
    private int volume;
    private boolean isPowerOn;
    
    public void Xiaomi(){
        this.volume = 0;
    }
    
    public int getVolume(){
        return this.volume;
    }
    
    @Override
    public void powerOn(){
        isPowerOn = true;
        System.out.println("Xiǎomǐ, zhù chóng xìngnéng");
        System.out.println("Huānyíng lái dào xiǎomǐ");
        System.out.println("Ānzhuō bǎnběn 13");
    }
    
    @Override
    public void powerOff(){
        isPowerOn = false;
        System.out.println("Shǒujī méi diànle");
    }
    
    @Override
    public void volumeUp(){
        if (isPowerOn) {
            if (this.volume == MAX_VOLUME) {
                System.out.println("Dāngqián yīnliàng yǐ mǎn");
                System.out.println(this.getVolume() + "%");
            } else {
                this.volume += 10;
                System.out.println("Tǐjī : " + this.getVolume());
            }
        } else {
            System.out.println("Shǒujī méi diànle");
        }
    }
    
    @Override
    public void volumeDown(){
        if (isPowerOn) {
            if (this.volume == MIN_VOLUME) {
                System.out.println("Tǐjī ：0%");
            } else {
                this.volume -=10;
                System.out.println("Tǐjī : " + this.getVolume());
            }
        } else {
            System.out.println("Xiān dǎkāi shǒujī");
        }
    }
}
