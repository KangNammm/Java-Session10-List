import java.util.ArrayList;
import java.util.List;

public class ReverseList {
    public static void main(String[] args) {
        // Tạo danh sách chứa các số nguyên
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        System.out.println("Danh sách gốc: " + numbers);

        // Đảo ngược danh sách
        List<Integer> reverseList = new ArrayList<>();
        for (int i = numbers.size() - 1; i >= 0; i--) {
            reverseList.add(numbers.get(i));
        }

        System.out.println("Danh sách sau khi đảo ngược: " + reverseList);
    }
}
