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

    //implémentation de l'interface

    @Override
    public void takeOff() {
        if (!this.flying && this.altitude == 0);
            this.flying = true;
            System.out.println(this.getName() + " deploys its wings and take off !");
    }

    @Override
    public int ascend(int meters) {
        if (isFlying()) {
            this.altitude+= meters;
            System.out.println(this.getName() + " ascended to the height of " + this.altitude);
        }
        return this.altitude;
    }

    @Override
    public int descend(int meters) {
        if (isFlying()) {
            this.altitude += -meters;
            System.out.println(this.getName() + " descended to the height of " + this.altitude);
        }
        return this.altitude;
    }

    @Override
    public void land() {
        if (isFlying() && this.altitude == 1) {
            System.out.println(this.getName() + " disastrously landed on the ground to pee...");
        } else {
            System.out.println("Control Tower, how high am I ?");
            System.out.println(this.getName() + ", You are still at altitude " + this.altitude + ", keep descending...");
        }

    }


}
