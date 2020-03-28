public class Lesson21Static {
    public static void main(String[] args) {
//при статике чтобы инициализмровать переменную необязательно ооздовать объекта класса, можно обратиться по имени переменной
//        NewHumann.getDescription();
        NewHumann h1 = new NewHumann("Bob", 30);
        NewHumann h2 = new NewHumann("Tom", 40);
        h1.printNumberOfPeople();
        h2.printNumberOfPeople();
//        h1.description = "Bad"; замена через объхект не корректна
//        NewHumann.description = "Nice";
//        h1.getAllFields();
//        h2.getAllFields();
//        NewHumann.description = "Bad";
//        h1.getAllFields();
//        h2.getAllFields();
    }
}

class NewHumann {
    private String name;
    private int age;
//    public static String description;
    private static int countPeople;

    public NewHumann(String name, int age) {
        this.name = name;
        this.age = age;
        countPeople++;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

//    public static void getDescription() {
//        System.out.println(description);
//    }

//    public void getAllFields() {
//        System.out.println(name + ", " + age + ", " + description);
//    }

//        public static void printAllFields() {
////            нельзя обращаться к нечтаитческой переменной
//            System.out.println(name);
//    }

    public void printNumberOfPeople() {
        System.out.println("Number of people is" + countPeople);
    }
}