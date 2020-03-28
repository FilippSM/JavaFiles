public class Worker {
//    int height;
//    float weight;
//    //можно добавить метод(функцию) для всех объектов класса
//    void say (String greeting) {
//        System.out.println(greeting);
//    }
//....................................................................
//создание объекта конструктор

//    int height;
//    float weight;
//    void say (String greeting) {
//        System.out.println(greeting);
//    }
//    //    конструктор
//    Worker (int height, float weight) {
//        this.height = height; //this указывает на переменную в классе
//        this.weight = weight;
//    }
//    //    конструктор с пустыми параметрами
//    Worker () {}
    //....................................................................
//наследование

//    protected int height;
//    float weight;
//
//    void say (String greeting) {
//        System.out.println(greeting);
//    }
//    //    констпуктор
//    Worker (int height, float weight) {
//        this.height = height; //this указывает на переменную в классе
//        this.weight = weight;
//    }
//    //    конструктор с пустыми параметрами
//    Worker () {}
    //....................................................................
    protected int height;
        float weight;

        public static int summ = 478;

        public static void write (String str) {
            System.out.println(str);
        }

        void say (String str) {
            System.out.println(str);
        }

        Worker (int height, float weight) {
            this.height = height;
            this.weight = weight;
        }

        Worker () {}
}
