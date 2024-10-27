public class hufflepuff extends hogwarts{
    private final int hardworking;
    private final int faithful;
    private final int honest;

    public hufflepuff(String firstName, String lastName, int powerOfMagic, int distanceOfTransgression, int hardworking, int faithful, int honest) {
        super(firstName, lastName, powerOfMagic, distanceOfTransgression);
        this.hardworking = hardworking;
        this.faithful = faithful;
        this.honest = honest;
    }

    public int getHardworking() {
        return hardworking;
    }

    public int getFaithful() {
        return faithful;
    }

    public int getHonest() {
        return honest;
    }

    @Override
    public String toString() {
        return "hufflepuff{" +
                "hardworking=" + hardworking +
                ", faithful=" + faithful +
                ", honest=" + honest +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", powerOfMagic=" + powerOfMagic +
                ", distanceOfTransgression=" + distanceOfTransgression +
                '}';
    }

    private int getTotalPoints() { return hardworking + faithful + honest;}

    public static void studentComparisonHufflepuff (hufflepuff studentOne, hufflepuff studentTwo) {
        if (studentOne.getTotalPoints() > studentTwo.getTotalPoints()) {
            System.out.println(studentOne.getLastName() + "  лучше, чем  " + studentTwo.getLastName());
        } else if (studentOne.getTotalPoints() < studentTwo.getTotalPoints()) {
            System.out.println(studentTwo.getLastName() + "  лучше, чем  " + studentOne.getLastName());
        } else {
            System.out.println("Студенты по силе равны");
        }
    }
}
