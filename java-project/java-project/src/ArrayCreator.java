import javax.management.StringValueExp;

public class ArrayCreator {
    public int[] createIntArray () {
        //все элементы массива будут заполнены нулями
//        int [] array; // объявление массива
//        array = new int[10]; // инициализация, указание размерности
//        return array;
        // если необходимо проинициализировать значения массива это делается с помощью цикла
        int [] array;
        array = new int[10];
        for (int i = 0; i < 10; i++) {
            array[i] = 100 + i;
        }
        return array;
    }
    //массив объектных типов
    public String[] createStringArray(final int SIZE) {
        String [] strings = new String[SIZE];
        //значения по умолчнию объектного типа null
        for (int i = 0; i < SIZE; i++) {
            strings[i] = String.valueOf(i);
        }
        return strings;
    }
}
