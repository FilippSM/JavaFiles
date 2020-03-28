public class Student extends Worker{
    //наследование

//    //extends Person - название основного класса
////у класса Student есть доступ к переменным с модификатором public и protected
//    int course;
//
//    public Student (int height, float weight, int course) {
//        super (height, weight);
//        this.course = course;
//    }
    //....................................................................
    //обращение бе создания переменной
    int course;

        public Student (int height, float weight, int course) {
            super (height, weight);
            this.course = course;
        }
}
