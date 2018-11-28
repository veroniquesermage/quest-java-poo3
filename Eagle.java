package fr.wildcodeschool.main;

public class Eagle extends Bird implements Fly{

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

    @Override
    public void takeOff() {
        if (!this.flying && this.altitude == 0){
            this.flying=true;
            System.out.printf("%s take off.%n",this.getName());
        }

    }

    @Override
    public int ascend(int meters) {
        if (this.flying){
            this.altitude=Math.min(this.altitude + meters, 3200);
            System.out.printf("%s is gaining altitude : %d. We can hear him singing \"I believe I can fly!\" %n",this.getName(),this.altitude);
        }
        return this.altitude;
    }

    @Override
    public int descend(int meters) {
        if (this.flying){
            this.altitude=Math.max(this.altitude - meters, 0);
            System.out.printf("%s is falling... aaaah! Altitude : %d. Phew... He's safe.%n", this.getName(),this.altitude);

        }
        return this.altitude;
    }

    @Override
    public void land() {
        if (this.flying && this.altitude == 1) {
            System.out.printf("%s is landing.%n", this.getName());
        } else {
            System.out.printf("%s is too high, it will be a beautiful crash.%n", this.getName());
        }

    }

}
