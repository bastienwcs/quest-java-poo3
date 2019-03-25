public class Eagle extends Bird implements Fly {

    private boolean flying;
    private int altitude;

    public Eagle(String name) {
        super(name);
        this.flying = false;
        this.altitude = 0;
    }

    public int getAltitude() {
        return altitude;
    }

    public boolean isFlying() {
        return flying;
    }

    @Override
    public String sing() {
        return "Screech!";
    }

    public void takeOff() {

    }

    public int ascend(int value) {
        return value;
    }

    public int descend(int value) {
        return value;
    }
    
    public void land() {
        
    }
}
