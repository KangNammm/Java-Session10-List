package TH;

import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Management {
    public static void updateBook(List<Book> books) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập ID sách cần cập nhật :");
        int idUpdate = scanner.nextInt();
        boolean check = false;
        for (Book book : books) {
            if (book.getBookId() == idUpdate) {
                book.inputData();
                System.out.println("Thông tin sách đã được cập nhật thành công");
                check = true;
                break;
            }
        }
        if (!check) {
            System.out.println("Không tìm thấy sách cần cập nhật");
        }
    }

    public static void searchBook(List<Book> books) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập từ khóa tìm kiếm: ");
        scanner.nextLine();
        String keyword = scanner.nextLine().trim().toLowerCase();

        boolean searchCheck = false;
        for (Book book : books) {
            if (book.getBookName().toLowerCase().contains(keyword) || book.getTitle().toLowerCase().contains(keyword)) {
                if (!searchCheck) {
                    System.out.println("Kết quả tìm kiếm:");
                    searchCheck = true;
                }
                System.out.println(book);
            }
        }
        if (!searchCheck) {
            System.out.println("Không tìm thấy sách nào phù hợp với từ khóa tìm kiếm.");
        }
    }

    public static void deleteBook(List<Book> books) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập ID sách cần xóa :");
        int idDel = scanner.nextInt();
        boolean check = false;
        for (Book book : books) {
            if (book.getBookId() == idDel) {
                books.remove(book);
                System.out.println("Xóa sách thành công");
                check = true;
                break;
            }
        }
        if (!check) {
            System.out.println("Không tìm thấy sách cần xóa");
        }
    }

    public static void sortListBook(Scanner scanner, List<Book> books) {
        if (books.isEmpty()) {
            System.out.println("Thư viện chưa có sách nào.");
        } else {
            System.out.println("========= Danh sách theo thứ tự lợi nhuận tăng dần ==============");
            books.sort(new Comparator<Book>() {
                @Override
                public int compare(Book o1, Book o2) {
                    return (int) (o1.getInterest() - o2.getInterest());
                }
            });
        }
    }

    public static void displayAllBooks(List<Book> books) {
        if (books.isEmpty()) {
            System.out.println("Không có sách");
            return;
        }
        System.out.println("=========Danh sách==============");
        for (Book book : books) {
            book.displayData();
        }
    }

    public static void addNewBook(Scanner scanner, List<Book> books) {
        System.out.print("Nhập số lượng sách muốn thêm mới : ");
        int numToAdd = scanner.nextInt();
        if (books.size() + numToAdd > 100) {
            System.out.println("Không thể thêm hơn " + 100 + " cuốn sách.");
            return;
        }
        for (int i = 0; i < numToAdd; i++) {
            System.out.println("Nhập thông tin của cuốn sách #" + (i + 1) + ":");
            Book book = new Book();
            book.inputData();
            books.add(book);
            System.out.println("Đã thêm sách thành công !");
        }
    }
}
