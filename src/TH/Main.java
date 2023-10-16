package TH;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static TH.Management.*;

public class Main {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        books.add(new Book("Dạy nấu ăn", "Minh Huy", 100, 100000, 250000));
        books.add(new Book("Dạy làm giàu", "Đào Thịnh", 200, 800000, 260000));
        books.add(new Book("Dạy tán gái", "Việt Anh", 300, 900000, 270000));
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        while (choice != 7) {
            System.out.println("****************JAVA-HACKATHON-05-BASIC-MENU***************\n" +
                    "1. Nhập số lượng sách thêm mới và nhập thông tin cho từng cuốn sách \n" +
                    "2. Hiển thị thông tin tất cả sách trong thư viện\n" +
                    "3. Sắp xếp sách theo lợi nhuận tăng dần \n" +
                    "4. Xóa sách theo mã sách \n" +
                    "5. Tìm kiếm tương đối sách theo tên sách hoặc mô tả \n" +
                    "6. Thay đổi thông tin sách theo mã sách \n" +
                    "7. Thoát \n" +
                    "Nhập lựa chọn của bạn :");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    addNewBook(scanner, books);
                    break;
                case 2:
                    displayAllBooks(books);
                    break;
                case 3:
                    sortListBook(scanner, books);
                    break;
                case 4:
                    deleteBook(books);
                    break;
                case 5:
                    searchBook(books);
                    break;
                case 6:
                    updateBook(books);
                    break;
                case 7:
                    System.out.println("Đang thoát chương trình...");
                    break;
                default:
                    System.out.println("Không hợp lệ. Vui lòng chọn lại.");
                    break;
            }
        }

    }
}
