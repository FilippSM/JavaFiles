import java.util.Arrays;

public class VariablesParam {
    public void method(int...values) {
        if(values.length !=0) {
            System.out.println(Arrays.toString(values));
        } else {
            System.out.println("without values");
        }
    }
}
