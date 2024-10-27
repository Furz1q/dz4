import java.util.Objects;

public class hogwarts {
    protected final String firstName;
    protected final String lastName;
    protected int powerOfMagic;
    protected int distanceOfTransgression;

    public hogwarts(String firstName, String lastName, int powerOfMagic, int distanceOfTransgression) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.powerOfMagic = powerOfMagic;
        this.distanceOfTransgression = distanceOfTransgression;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getPowerOfMagic() {
        return powerOfMagic;
    }

    public void setPowerOfMagic(int powerOfMagic) {
        this.powerOfMagic = powerOfMagic;
    }

    public int getDistanceOfTransgression() {
        return distanceOfTransgression;
    }

    public void setDistanceOfTransgression(int distanceOfTransgression) {
        this.distanceOfTransgression = distanceOfTransgression;
    }

    @Override
    public String toString() {
        return "hogwarts{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", powerOfMagic=" + powerOfMagic +
                ", distanceOfTransgression=" + distanceOfTransgression +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof hogwarts hogwarts)) return false;
        return powerOfMagic == hogwarts.powerOfMagic && distanceOfTransgression == hogwarts.distanceOfTransgression && Objects.equals(firstName, hogwarts.firstName) && Objects.equals(lastName, hogwarts.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, powerOfMagic, distanceOfTransgression);
    }

    private int getTotalPoints() { return powerOfMagic + distanceOfTransgression;}

    public static void studentComparison (hogwarts studentOne, hogwarts studentTwo) {
        if (studentOne.getTotalPoints() > studentTwo.getTotalPoints()) {
            System.out.println(studentOne.getLastName() + " обладает большей мощностью магии, чем " + studentTwo.getLastName());
        } else if (studentOne.getTotalPoints() < studentTwo.getTotalPoints()) {
            System.out.println(studentTwo.getLastName() + " обладает большей мощностью магии, чем " + studentOne.getLastName());
        } else {
            System.out.println("Студенты по силе равны");
        }
    }
}
