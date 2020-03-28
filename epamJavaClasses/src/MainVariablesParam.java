public class MainVariablesParam {
    public static void main(String[] args) {
        VariablesParam param = new VariablesParam();
        param.method(4, 3, 44);
        param.method();
        int[] arr = {4, 4};
        param.method(arr);
    }
}
