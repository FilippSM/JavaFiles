public class JavaClasses{
    public static void main(String[] args) {
        Abiturient[] data = new Abiturient[9];
        data[0] = new Abiturient (0010, "Petrov", "Ivan", "Stepanovich", 80173752315L, new int[]{8, 4, 7, 8});
        data[1] = new Abiturient (0011, "Valuev", "Mikle", "Nikitovich", 80173331542L, new int[]{8, 3, 3, 9});
        data[2] = new Abiturient (0012, "Nanalny", "Alex", "Dmitrievich", 80174637578L, new int[]{8, 3, 9, 9});
        data[3] = new Abiturient (0013, "Sobol", "Lubov", "Alexandrovna", 80175456789L, new int[]{8, 4, 6, 7});
        data[4] = new Abiturient (0013, "Nemov", "Igor", "Stepanovich", 80175456789L, new int[]{8, 8, 6, 9});
        data[5] = new Abiturient (0013, "Futov", "Egor", "Valerievich", 80175456789L, new int[]{8, 3, 6, 9});
        data[6] = new Abiturient (0013, "Kovak", "Nikita", "Egorovich", 80175456789L, new int[]{8, 7, 7, 7});
        data[7] = new Abiturient (0013, "Filatov", "Zahar", "Alexandrovich", 80175456789L, new int[]{7, 8, 6, 7});
        data[8] = new Abiturient (0013, "Dokovuduev", "Alex", "Dmitrievich", 80175456789L, new int[]{8, 4, 7, 7});



        for (int i = 0; i < data.length; i++) {
            data[i].getListAbiturientUnsatisfactoryGrades();
        }
        System.out.println();

        for (int i = 0; i < data.length; i++) {
            data[i].getListAbiturientSatisfactorySummaryGrades();
        }
        System.out.println();

        for (int i = 0; i < data.length; i++) {
            data[i].getListAbiturientHighSummaryGrades();
//            System.out.println(data[i].getListAbiturientHighSummaryGrades());
        }
        System.out.println();

        data[0].asd();
        System.out.println();

        for (int i = 0; i < data.length; i++) {
            data[i].getArrays();
        }
        System.out.println();

        for (int i = 0; i < data.length; i++) {
            data[i].outArrays();
        }
    }
}

class Abiturient {
    private int id;
    private String surName;
    private String name;
    private String middleName;
    private long phone;
    private int[] grades ;

    public Abiturient(int id, String surName, String name, String middleName, long phone, int[] grades) {
        this.id = id;
        this.surName = surName;
        this.name = name;
        this.middleName = middleName;
        this.phone = phone;
        this.grades = grades;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public void setGrades(int[] grades) {
        this.grades = grades;
    }

    public String getSurName() {
        return surName;
    }

    public String getName() {
        return name;
    }

    public int [] getGrades() {
        return grades;
    }

    public void show() {
        System.out.print("Surname: " + getSurName());
        System.out.println(", Name: " + getName());
    }

    public void getListAbiturientUnsatisfactoryGrades() {
        for (int i = 0; i < grades.length; i++) {
            if (grades[i] < 4){
                System.out.print("Abiturient: " + getSurName());
                System.out.println(" " + getName());
                break;
            }
        }
    }

//    public void getListAbiturientSatisfactorySummaryGrades() {
//        int summaryGrades = 0;
//        for (int i = 0; i < grades.length; i++) {
//            summaryGrades += grades[i];
//        }
////            System.out.println(summaryGrades);
//
//        if (summaryGrades > 25) {
//            System.out.print("Abiturient: " + getSurName());
//            System.out.println(" " + getName());
//        }
//    }


    static int summaryAbiturient = 0;
    public int getListAbiturientHighSummaryGrades() {
        int summaryGrades = 0;
//        static int summaryAbiturient = 0;
        for (int i = 0; i < grades.length; i++) {
            summaryGrades += grades[i];
        }

        if (summaryGrades > 27) {
            summaryAbiturient ++;
//            System.out.println(summaryAbiturient);
        }
        return summaryAbiturient;

    }

    public void asd() {
        System.out.println(getListAbiturientHighSummaryGrades());
    }

    public int getListAbiturientSatisfactorySummaryGrades() {
        int summaryGrades = 0;
        for (int i = 0; i < grades.length; i++) {
            summaryGrades += grades[i];
        }
//            System.out.println(summaryGrades);
        return summaryGrades;
    }


    public int[] getArrays() {
        System.out.println(getListAbiturientSatisfactorySummaryGrades());
        int numbers = getListAbiturientSatisfactorySummaryGrades();

        int[] numbersArray = new int[9];
        for (int i = 0; i < numbersArray.length; i++) {
            numbersArray[i] = numbers;
        }
        return numbersArray;

    }

    public void outArrays() {
        int[] numbersArray = getArrays();
        for (int i = 0; i < numbersArray.length; i++) {
            System.out.println(numbersArray[i]);
//            System.out.print(a[i]);
        }
    }

//добавить геттер и сеттер


}


//    4. Abiturient: id, Фамилия, Имя, Отчетсво, Адрес, Телефон, Оценки.
//
//    Создать массив объектов. Вывести:
//
//    a) список абитуриентов, имеющих неудовлетворительные оценки;
//
//    b) список абитуриентов, у которых сумма баллов выше заданной;
//
//    c) выбрать заданное число n абитуриентов, имеющих самую высокую сумму баллов (вывести также полный список абитуриентов, имеющих полупроходную сумму).
//
