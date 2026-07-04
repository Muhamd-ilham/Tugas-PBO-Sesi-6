public class MacBook implements Laptop {
    private int volume;
    boolean is_power_on;

    public MacBook() {
        this.volume = 50;
    }

    @Override
    public void powerOn() {
        is_power_on = true;
        System.out.println("MacBook is On. Jreng...");
    }

    @Override
    public void powerOff() {
        is_power_on = false;
        System.out.println("MacBook shutting down...");
    }

    @Override
    public void volumeUp() {
        if (is_power_on) {
            if (this.volume == MAX_VOL) {
                System.out.println("Volume is Max");
            } else {
                this.volume += 10;
                System.out.println("Volume is: " + this.getVolume());
            }
        } else {
            System.out.println("Nyalakan MacBook terlebih dahulu.");
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
            System.out.println("Nyalakan MacBook terlebih dahulu.");
        }
    }

    public int getVolume() {
        return this.volume;
    }
}