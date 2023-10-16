package TH;

import java.util.Scanner;

public class Book implements IBook {
    int bookId;
    String bookName;
    String title;
    int numberOfPages;
    float importPrice;
    float exportPrice;
    float interest;
    boolean bookStatus;

    static int count = 1;

    public Book() {
        this.bookId = count++;
        this.bookStatus = true;
    }

    public Book(String bookName, String title, int numberOfPages, float importPrice, float exportPrice) {
        this.bookId = count++;
        this.bookName = bookName;
        this.title = title;
        this.numberOfPages = numberOfPages;
        this.importPrice = importPrice;
        this.exportPrice = exportPrice;
        this.interest = exportPrice - importPrice;
        this.bookStatus = true;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public float getImportPrice() {
        return importPrice;
    }

    public void setImportPrice(float importPrice) {
        this.importPrice = importPrice;
    }

    public float getExportPrice() {
        return exportPrice;
    }

    public void setExportPrice(float exportPrice) {
        this.exportPrice = exportPrice;
    }

    public float getInterest() {
        return interest;
    }

    public void setInterest(float interest) {
        this.interest = interest;
    }

    public boolean isBookStatus() {
        return bookStatus;
    }

    public void setBookStatus(boolean bookStatus) {
        this.bookStatus = bookStatus;
    }

    @Override
    public void inputData() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mã sách :" + bookId);
        System.out.println("Nhập tên sách :");
        String strName = scanner.nextLine().trim();
        while (strName.isEmpty()) {
            System.out.println("Tên sách không được để trống, vui lòng nhập lại :");
            strName = scanner.nextLine().trim();
        }
        this.bookName = strName;

        System.out.println("Nhập tiêu đề sách :");
        String strTitle = scanner.nextLine().trim();
        while (strTitle.isEmpty()) {
            System.out.println("Tiêu đề sách không được để trống, vui lòng nhập lại :");
            strTitle = scanner.nextLine().trim();
        }
        this.title = strTitle;

        System.out.println("Nhập số trang sách :");
        int pageNum = scanner.nextInt();
        while (pageNum <= 0) {
            System.out.println("Số trang sách phải > 0, vui lòng nhập lại :");
            pageNum = scanner.nextInt();
        }
        this.numberOfPages = pageNum;

        System.out.println("Nhập giá thu vào :");
        float importP = scanner.nextFloat();
        while (importP <= 0) {
            System.out.println("Giá bán ra phải > 0, vui lòng nhập lại :");
            importP = scanner.nextFloat();
        }
        this.importPrice = importP;

        System.out.println("Nhập giá bán ra :");
        float exportP = scanner.nextFloat();
        while (exportP <= 1.2 * importPrice) {
            System.out.println("Giá bán ra phải > 1.2 lần giá nhập vào, vui lòng nhập lại :");
            exportP = scanner.nextFloat();
        }
        this.exportPrice = exportP;
    }

    @Override
    public void displayData() {
        System.out.println("{ Mã sách : " + bookId + " , " +
                "Tên sách : " + bookName + " , " +
                "Tiêu đề : " + title + " , " +
                "Số trang : " + numberOfPages + " , " +
                "Giá nhập : " + importPrice + " , " +
                "Giá bán : " + exportPrice + " , " +
                "Trạng thái : " + bookStatus);
    }

}
