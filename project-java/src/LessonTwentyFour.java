public class LessonTwentyFour {
    public static void main(String[] args) {
        String Str = new String("You're welcome");

        System.out.println("Return Value: ");
        System.out.println(Str.toString());
        System.out.println(Str);

        HumanHuman humanone = new HumanHuman("Bob", 40);
        System.out.println(humanone.toString());
        //всегда когда мы печатаем объект мы скрыто вызываем метод toString
        //humanone, humanone.toString() - одно и тоже


    }
}

class HumanHuman {
    private String name;
    private int age;

    public HumanHuman(String name, int age){
        this.name = name;
        this.age = age;
    }

    //чтобы вывести вместо хеш-кода строку нужно переопределить метод
    public String toString() {
        return name + ", " + age;
    }
}
