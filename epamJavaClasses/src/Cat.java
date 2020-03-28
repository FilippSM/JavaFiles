public class Cat {
    String name;
    int age;

    protected Cat(int age, String name) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {

        Cat barsik = new Cat(10, "Барсик"); //ошибка!
    }

//    private; final; native; abstract; protected.
}
