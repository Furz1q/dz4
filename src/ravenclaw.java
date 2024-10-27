public class ravenclaw extends hogwarts{
    private final int smart;
    private final int mudras;
    private final int wit;
    private final int creativity;

    public ravenclaw(String firstName, String lastName, int powerOfMagic, int distanceOfTransgression, int smart, int mudras, int wit, int creativity) {
        super(firstName, lastName, powerOfMagic, distanceOfTransgression);
        this.smart = smart;
        this.mudras = mudras;
        this.wit = wit;
        this.creativity = creativity;
    }

    public int getSmart() {
        return smart;
    }

    public int getMudras() {
        return mudras;
    }

    public int getWit() {
        return wit;
    }

    public int getCreativity() {
        return creativity;
    }

    @Override
    public String toString() {
        return "ravenclaw{" +
                "smart=" + smart +
                ", mudras=" + mudras +
                ", wit=" + wit +
                ", creativity=" + creativity +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", powerOfMagic=" + powerOfMagic +
                ", distanceOfTransgression=" + distanceOfTransgression +
                '}';
    }

    private int getTotalPoints() { return smart + mudras + wit + creativity;}

    public static void studentComparisonRavenclaw (ravenclaw studentOne, ravenclaw studentTwo) {
        if (studentOne.getTotalPoints() > studentTwo.getTotalPoints()) {
            System.out.println(studentOne.getLastName() + "  лучше, чем  " + studentTwo);
        } else if (studentOne.getTotalPoints() < studentTwo.getTotalPoints()) {
            System.out.println(studentTwo.getLastName() + "  лучше, чем  " + studentOne.getLastName());
        } else {
            System.out.println("Студенты по силе равны");
        }
    }

}
