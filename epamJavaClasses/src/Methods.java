public class Methods {
    public static void main(String[] args) {
        NewHuman humanTwo = new NewHuman("Karl");





    }
}

class NewHuman {
    private String name;
    private int age;


    public NewHuman() {
        this.name = "default name";
        this.age = 0;
    }
    //конструктор
//    public NewHuman() {
//        System.out.println("hi i'm from the first constructor");
//    }

    public NewHuman(String name) {
        System.out.println("hi i'm from the second constructor");
        this.name = name;
    }

    public NewHuman(String name, int age) {
        System.out.println("hi i'm from the third constructor");
        this.name = name;
        this.age = age;
    }

}