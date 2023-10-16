package BT;

import java.util.ArrayList;
import java.util.List;

public class ShortestWord {
    public static void main(String[] args) {
        String sentence = "Đây là phương thức cho sẵn";

        // Tách câu thành các từ
        String[] words = sentence.split(" ");

        // Tạo một List để lưu trữ các từ
        List<String> wordList = new ArrayList<>();
        for (String word : words) {
            wordList.add(word);
        }

        // Tìm từ ngắn nhất trong List
        String shortestWord = findShortestWord(wordList);
        System.out.println("Câu cho sẵn là : " + sentence);
        System.out.println("Chữ ngắn nhất trong câu là: " + shortestWord);
    }

    public static String findShortestWord(List<String> wordList) {
        // Giả sử từ đầu tiên là từ ngắn nhất
        String shortestWord = wordList.get(0);

        for (String word : wordList) {
            // Nếu tìm thấy từ ngắn hơn
            if (word.length() < shortestWord.length()) {
                shortestWord = word;
            }
        }

        return shortestWord;
    }
}

