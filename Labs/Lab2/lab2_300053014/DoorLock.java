public class DoorLock {

    // Constant.
    public static final int MAX_NUMBER_OF_ATTEMPTS = 3;

    // Instance variables.
    private Combination combination;
    private boolean open;
    private boolean activated;
    private int numberOfAttempts;

    // Constructor.
    public DoorLock( Combination combination ) {
        this.combination = combination;
        this.open = false;
        this.activated = true;
        this.numberOfAttempts = 0;
    }

    // Access methods.
    public boolean isOpen() {
        return open;
    }

    public boolean isActivated() {
        return activated;
    }

    public boolean open( Combination combination ) {

        if (this.activated && this.combination.equals(combination)) {
            this.open = true;
            this.numberOfAttempts = 0;
            return true;
        }
        else {
            this.numberOfAttempts++;
            if (this.numberOfAttempts >= MAX_NUMBER_OF_ATTEMPTS) {
                this.activated = false;
                this.numberOfAttempts = 0;
            }
            return false;
        }
    }

    public void activate( Combination c ) {
        if (this.combination.equals(c)) {
            this.activated = true;
        }
    }

    public static void main(String[] args) {
        Combination c1 = new Combination(1,2,3);
        Combination c2 = new Combination(1,1,1);
        DoorLock d1 = new DoorLock(c1);

        System.out.println("Door is open: " + d1.isOpen());
        System.out.println("Door is activated: " + d1.isActivated());
        System.out.println("current#attempts: " + d1.numberOfAttempts);

        System.out.println("First try open: " + d1.open(c2));

        System.out.println("Door is open: " + d1.isOpen());
        System.out.println("Door is activated: " + d1.isActivated());
        System.out.println("current#attempts: " + d1.numberOfAttempts);

        System.out.println("second try open: " + d1.open(c2));
        System.out.println("current#attempts: " + d1.numberOfAttempts);
        System.out.println("third try open: " + d1.open(c2));
        System.out.println("current#attempts: " + d1.numberOfAttempts);

        System.out.println("Door is open: " + d1.isOpen());
        System.out.println("Door is activated: " + d1.isActivated());
        System.out.println("current#attempts: " + d1.numberOfAttempts);

        System.out.println("Trying to reactivate (wrong)");
        d1.activate(c2);

        System.out.println("Door is open: " + d1.isOpen());
        System.out.println("Door is activated: " + d1.isActivated());
        System.out.println("current#attempts: " + d1.numberOfAttempts);

        System.out.println("Trying to reactivate (right)");
        d1.activate(c1);

        System.out.println("Door is open: " + d1.isOpen());
        System.out.println("Door is activated: " + d1.isActivated());
        System.out.println("current#attempts: " + d1.numberOfAttempts);

    }
}
