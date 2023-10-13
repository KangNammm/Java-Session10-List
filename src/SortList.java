import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortList {
    public static void main(String[] args) {
        // Tạo một danh sách (list) và thêm các số nguyên vào danh sách
        List<Integer> list = new ArrayList<>();
        list.add(6);
        list.add(5);
        list.add(9);
        list.add(2);
        list.add(7);

        // Sắp xếp danh sách theo thứ tự giảm dần
        Collections.sort(list, Collections.reverseOrder());

        // In ra danh sách sau khi đã sắp xếp
        System.out.println("Danh sách sau khi sắp xếp theo thứ tự giảm dần:");
        for (Integer number : list) {
            System.out.println(number);
        }
    }
}
