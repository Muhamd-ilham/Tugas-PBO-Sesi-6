public class Toshiba implements Laptop {
    private int volume;
    boolean is_power_on;

    public Toshiba() {
        this.volume = 50;
    }

    @Override
    public void powerOn() {
        is_power_on = true;
        System.out.println("Laptop is On");
        System.out.println("Toshiba Portege");
    }

    @Override
    public void powerOff() {
        is_power_on = false;
        System.out.println("Toshiba is shutting down...");
    }

    @Override
    public void volumeUp() {
        if (is_power_on) {
            if (this.volume == MAX_VOL) {
                System.out.println("Volume is Full");
            } else {
                this.volume += 10;
                System.out.println("Volume is: " + this.getVolume());
            }
        } else {
            System.out.println("Nyalakan laptop Toshiba terlebih dahulu.");
        }
    }

    @Override
    public void volumeDown() {
        if (is_power_on) {
            if (this.volume == MIN_VOL) {
                System.out.println("Volume is Mute");
            } else {
                this.volume -= 10;
                System.out.println("Volume is: " + this.getVolume());
            }
        } else {
            System.out.println("Nyalakan laptop Toshiba terlebih dahulu.");
        }
    }

    public int getVolume() {
        return this.volume;
    }
}