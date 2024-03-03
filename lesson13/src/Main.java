import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 30; i++) {
            numbers.add(random.nextInt(30));
        }
        System.out.println(numbers);
        List<Integer> numbers2 = numbers
                .stream().distinct().sorted()
                .filter(n -> n % 2 == 0 && n > 6 && n < 18)
                .map(n -> n * 2)
                .sorted().limit(4).toList();
        long numOfElements=numbers.stream().count();
        System.out.println(numOfElements);
        double average =numbers.stream()
                .mapToDouble(Integer::doubleValue)
                .average()
                .orElse(0.0);
        System.out.println(average);



    }


}