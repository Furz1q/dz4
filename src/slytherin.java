public class slytherin extends hogwarts{
    private final int tricks;
    private final int resolute;
    private final int ambitious;
    private final int resourceful;
    private final int lustForPower;

    public slytherin(String firstName, String lastName, int powerOfMagic, int distanceOfTransgression, int tricks, int resolute, int ambitious, int resourceful, int lustForPower) {
        super(firstName, lastName, powerOfMagic, distanceOfTransgression);
        this.tricks = tricks;
        this.resolute = resolute;
        this.ambitious = ambitious;
        this.resourceful = resourceful;
        this.lustForPower = lustForPower;
    }

    public int getTricks() {
        return tricks;
    }

    public int getResolute() {
        return resolute;
    }

    public int getAmbitious() {
        return ambitious;
    }

    public int getResourceful() {
        return resourceful;
    }

    public int getLustForPower() {
        return lustForPower;
    }

    @Override
    public String toString() {
        return "slytherin{" +
                "tricks=" + tricks +
                ", resolute=" + resolute +
                ", ambitious=" + ambitious +
                ", resourceful=" + resourceful +
                ", lustForPower=" + lustForPower +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", powerOfMagic=" + powerOfMagic +
                ", distanceOfTransgression=" + distanceOfTransgression +
                '}';
    }

    private int getTotalPoints() { return tricks + resolute + ambitious + resourceful + lustForPower;}

    public static void studentComparisonSlytherin (slytherin studentOne, slytherin studentTwo) {
        if (studentOne.getTotalPoints() > studentTwo.getTotalPoints()) {
            System.out.println(studentOne.getLastName() + "  лучше, чем  " + studentTwo);
        } else if (studentOne.getTotalPoints() < studentTwo.getTotalPoints()) {
            System.out.println(studentTwo.getLastName() + "  лучше, чем  " + studentOne.getLastName());
        } else {
            System.out.println("Студенты по силе равны");
        }
    }
}
