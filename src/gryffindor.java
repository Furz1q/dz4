public class gryffindor extends hogwarts {
    private final int nobility;
    private final int honor;
    private final int bravery;

    public gryffindor(String firstName, String lastName, int powerOfMagic, int distanceOfTransgression, int nobility, int honor, int bravery) {
        super(firstName, lastName, powerOfMagic, distanceOfTransgression);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public int getNobility() {
        return nobility;
    }

    public int getHonor() {
        return honor;
    }

    public int getBravery() {
        return bravery;
    }

    @Override
    public String toString() {
        return "gryffindor{" +
                "nobility=" + nobility +
                ", honor=" + honor +
                ", bravery=" + bravery +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", powerOfMagic=" + powerOfMagic +
                ", distanceOfTransgression=" + distanceOfTransgression +
                '}';
    }

    private int getTotalPoints() { return nobility + honor + bravery;}

    public static void studentComparisonGryffindor (gryffindor studentOne, gryffindor studentTwo) {
        if (studentOne.getTotalPoints() > studentTwo.getTotalPoints()) {
            System.out.println(studentOne.getLastName() + " лучше, чем " + studentTwo.getLastName());
        } else if (studentOne.getTotalPoints() < studentTwo.getTotalPoints()) {
            System.out.println(studentTwo.getLastName() + " лучше, чем " + studentOne.getLastName());
        } else {
            System.out.println("Студенты по силе равны");
        }
    }
}
