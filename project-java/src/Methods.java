public class Methods {
    public static void main(String[] args) {
        Person onePerson = new Person();
        onePerson.name = "oleg";
        onePerson.age = 28;
        onePerson.speakParameters(); // вызов метода
        onePerson.sayHello();
        int yearOnePerson = onePerson.calculateYearsRetirement();
        System.out.println("number of years to retirement: " + yearOnePerson);
//        System.out.println("name: " + onePerson.name + "\n" + "years old: "+ onePerson.age);

        Person secondPerson = new Person();
        secondPerson.setNameAndAge("ivan", 29);
        secondPerson.speakParameters();

        Person thirdPerson = new Person();
        String name = "igor";
        int age = 31;
        thirdPerson.setNameAndAge(name, age);
        thirdPerson.speakParameters();

        //getersAndSeters
        OtherPerson fourthPerson = new OtherPerson();
        fourthPerson.setName("");
        fourthPerson.setAge(35);
        System.out.println("name: " + fourthPerson.getName());
        System.out.println("age: " + fourthPerson.getAge());

        //ключевое слово this
        Human humanOne = new Human();
        humanOne.setAge(18);
        humanOne.setName("tom");
        humanOne.getInfo();

        //конструктор
        //конструктор вызывается при каждом создагнии объекта
//        NewHuman humanTwo = new NewHuman();
        NewHuman humanTwo = new NewHuman("Karl");
        // если в конструкторе заданы параметры то они должны быть переданы

    }
}

class Person {
    String name;
    int age;

    void setNameAndAge(String userName, int userAge) {
        name = userName;
        age = userAge;
    }

    int calculateYearsRetirement() {
        int years = 65 - age;
        return years;
    }

    void speakParameters() {
        System.out.println("name: " + name + "\n" + "years old: "+ age); // не нужно связывать поля и методы как onePerson.name
    }

    void sayHello() {
        System.out.println("hi");
    }
}

//getersAndSeters
//внутри класса мы можем изменить имя name на login к примеру не меняя в мейне
class OtherPerson {
    private String name;
    private int age;

    public void setName(String userName) {
        //проверка на ввод пустого имени, в сеттере мы инкасуплировали нужную логику
        if (userName.isEmpty()){
            System.out.println("empty name entered");
        } else {
            name = userName; }
    }

    public String getName() {
        return name;
    }

    public void setAge(int userAge) {
        if(userAge < 0) {
            System.out.println("number isn't positive");
        } else {
            age = userAge;
        }
    }

    public int getAge() {
        return age;
    }
}

class Human {
    private String name;
    private int age;
    //this - ключевое слово вызывает объект внутри классса
    //this.name указывает на переменную класса String name
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void getInfo() {
        System.out.println(name + ", " + age);
    }
}

//конструктор отличается тем что у него нет типа возвращаемого значения, его имя совпадает с именем класса
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

    //здесь мы имеем перегрузку конструкторов
    //в одно классе мы иметь несколько метода с одинаковым названями, но разными параметрами
    //конструктор отличается тем что у него нет типа возвращаемого значения, его имя совпадает с именем класса

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}