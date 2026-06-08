import java.util.*;
import java.util.stream.Collectors;

public class DemoStream {
    public static void main(String[] args){
        List<Double> bmis = Arrays.asList(
            21.5,18.6,31.7,29.6,15.8,23.4
        );

        List<Double> underWeight = bmis.stream().
        filter(each -> each <= 18.5).
        collect(Collectors.toList());
        System.out.println(underWeight);
    }
}
