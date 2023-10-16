package BT;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class MaxElementInList {
    public static void main(String[] args) {
        // Khởi tạo một danh sách số nguyên
        List<Integer> list = new ArrayList<>();

        // Số phần tử tối đa trong danh sách
        int maxSize = 10;

        // Sử dụng đối tượng Random để tạo số ngẫu nhiên
        Random random = new Random();

        // Tạo các số nguyên ngẫu nhiên và thêm vào danh sách
        for (int i = 0; i < maxSize; i++) {
            int randomNumber = random.nextInt(100); // Giới hạn số ngẫu nhiên từ 0 đến 99
            list.add(randomNumber);
        }

        // In danh sách số nguyên
        System.out.println("Danh sách số nguyên: " + list);

        // Tìm và in ra phần tử lớn nhất sử dụng phương thức Collections.max()
        int maxElement = Collections.max(list);
        System.out.println("Phần tử lớn nhất: " + maxElement);
    }
}