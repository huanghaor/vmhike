import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Float> numbers = new ArrayList<Float>();
        numbers.add(-81.9275f);
        numbers.add(-1.1245f);
        numbers.add(-2.586f);


        Float max = numbers.stream().reduce(Float::max).get();//得到最大值
        System.out.println(max);

    }
}
