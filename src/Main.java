public class Main {
    public static void main(String[] args) {
        gryffindor[] studentsGryffindor = {
                new gryffindor("Гарри "," Поттер",14,14,15,19,17),
                new gryffindor("Гермиона "," Грейнджер", 15,10,16,14,18),
                new gryffindor("Рон", "Уизли",11,17,15,23,13),
        };
        hufflepuff[] studentsHufflepuff ={
                new hufflepuff("Захария","Смит",11,10,18,15,13),
                new hufflepuff("Седрик","Диггори",12,11,16,17,14),
                new hufflepuff("Джастин","Финч-Флетчли",15,16,12,15,11),
        };
        ravenclaw[] studentsRavenclaw ={
                new ravenclaw("Чжоу","Чанг",18,12,10,11,16,19),
                new ravenclaw("Падма","Патил",18,13,16,17,18,11),
                new ravenclaw("Маркус","Белби",14,16,18,15,12,18),
        };
        slytherin[] studentsSlytherin ={
                new slytherin("Драко","Малфой",12,15,18,19,14,16,18),
                new slytherin("Грэхэм","Монтегю",16,14,18,19,12,15,17),
                new slytherin("Грегори","Гойл",15,16,20,14,13,16,18),
        };
        System.out.println(studentsGryffindor[2].toString());
        System.out.println(studentsHufflepuff[1].toString());
        System.out.println(studentsRavenclaw[0].toString());
        System.out.println(studentsSlytherin[2].toString());

        gryffindor.studentComparisonGryffindor(studentsGryffindor[2], studentsGryffindor[0]);
        hufflepuff.studentComparisonHufflepuff(studentsHufflepuff[1], studentsHufflepuff[2]);
        ravenclaw.studentComparisonRavenclaw(studentsRavenclaw[0], studentsRavenclaw[1]);
        slytherin.studentComparisonSlytherin(studentsSlytherin[1],studentsSlytherin[2]);

        hogwarts.studentComparison(studentsGryffindor[0], studentsRavenclaw[2]);
    }
}