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
        fourthPerson.setName("mikle");
        fourthPerson.setAge(35);
        System.out.println("name: " + fourthPerson.getName());
        System.out.println("age: " + fourthPerson.getAge());
        thirdPerson.speakParameters();
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
        name = userName;
    }

    public String getName() {
        return name;
    }

    public void setAge(int userAge) {
        age = userAge;
    }

    public int getAge() {
        return age;
    }

    void speakParameters() {
        System.out.println("name: " + name + "\n" + "years old: "+ age); // не нужно связывать поля и методы как onePerson.name
    }
}