package flyweight;

class CounterTerrorist implements Player {
    private final String TASK;

    private String weapon;

    public CounterTerrorist() {
        this.TASK = "DIFFUSE BOMB";
    }

    public void assignWeapon(String weapon) {
        this.weapon = weapon;
    }

    public void mission() {
        System.out.println("Counter Terrorist with weapon " + weapon + "|" + " Task is " + TASK);
    }
}