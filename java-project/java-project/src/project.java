import java.util.Arrays;
import java.util.Scanner;

public class project {
//    метод не возвращает значение

//    public static void main(String[] args) {
//        summaryNumbers (23, 74); // вызов функции и передача параметров
//    }
//    public static void summaryNumbers (int a, int b) {
//        int summaryResult;
//        summaryResult = a + b;
//        System.out.println("Result is: " + summaryResult);
//    }
//.....................................................................
//    метод возвращает значение

//    public static void main(String[] args) {
//        int result = summaryNumbers (23, 74); //возарвщаемое значение метода(функции) присвоится переменной temp
//        System.out.println("Result is: " + result);
//    }
//    //        прописываем какой тип будет возвращать - int
//    public static int summaryNumbers (int a, int b) {
//        int summaryResult;
//        summaryResult = a + b;
//        return summaryResult;
//    }
    //....................................................................
    //создание объекта
//    public static void main(String[] args) {
//        Worker maks = new Worker(); //объет maks - объекта класса Worker
//        maks.height = 230;
//        maks.weight = 78.4f;
//        maks.say("Hi, I'm Maks"); //используются метод(функция) для конкретного обьета maks
//        System.out.println(maks.height);
//
//        Worker oleg = new Worker();
//        oleg.height = 211;
//        oleg.weight = 75.4f;
//        System.out.println(oleg.height);
//    }
    //....................................................................
    //создание объекта конструктор

//    public static void main(String[] args) {
//        Worker maks = new Worker(180, 78.4f);
//
//        maks.say("Hi, I'm Maks");
//        System.out.println(maks.height);
//
//        Worker oleg = new Worker();
//    //        Worker oleg = new Worker(); теперь наш класс обязывает передавать дап параметра при создании объекта, чтобы это исправить надо создать еще один конструктор
//        oleg.height = 211;
//        oleg.weight = 75.4f;
//        System.out.println(oleg.height);
//    }
    //....................................................................
    //наследование
//    public static void main(String[] args) {
//        Worker maks = new Worker(180, 78.4f);
//
//        maks.say("Hi, I'm Maks");
//        System.out.println(maks.height);
//
//        Worker oleg = new Worker();
//        oleg.height = 211;
//        oleg.weight = 75.4f;
//        System.out.println(oleg.height);
//
//        Student vova = new Student(178, 98f, 3);
//        System.out.println(vova.course);
//        System.out.println(vova.height);
//    }
//....................................................................
    //обращение бе создания переменной

    public static void main(String[] args) {
        Worker.write("Your number is: ");
        System.out.println(Worker.summ); //имеется доступ к переменной summ без создания объекта при помощи обращения к классу
        Worker maks = new Worker(180, 78.4f);

        maks.say("Hi, I'm Maks");
        System.out.println(maks.height);

        Worker oleg = new Worker();
        oleg.height = 211;
        oleg.weight = 75.4f;
        System.out.println(oleg.height);

        Student vova = new Student(178, 98f, 3);
        System.out.println(vova.course);
        System.out.println(vova.height);
    }
    //....................................................................
}
