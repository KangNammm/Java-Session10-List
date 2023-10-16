package BT;

import java.util.ArrayList;
import java.util.List;

public class StringLength {
    public static void main(String[] args) {
        String str =  "Rekkei Academy để nông dân biết code";

        // Tạo danh sách chứa các chuỗi
        List<String> danhSachChuoi = new ArrayList<>();

        // Tách chuỗi thành các từ và thêm vào danh sách
        String[] cacTu = str.split(" ");
        for (String tu : cacTu) {
            danhSachChuoi.add(tu);
        }

        // In ra các chuỗi có độ dài lớn hơn 3 ký tự
        for (String chuoi : danhSachChuoi) {
            if (chuoi.length() > 3) {
                System.out.println(chuoi);
            }
        }
    }
}

