package menu;

import manager.ManageProduct;

import java.util.Scanner;

public class MenuProduct {
    public static void menu() {
        Scanner scanner = new Scanner(System.in);
        ManageProduct manageProduct = new ManageProduct();
        while (true) {
            System.out.println("Menu Quản Lý Sản Phẩm");
            System.out.println("1. Hiển thị");
            System.out.println("2. Thêm sản phẩm");
            System.out.println("3. Sửa sản phẩm");
            System.out.println("4. Xóa sản phẩm");
            System.out.println("5. Sắp xếp sản phẩm");
            System.out.println("6. Tìm sản phẩm đắt nhât");
            System.out.println("7. Đọc file");
            System.out.println("8. Ghi file");
            System.out.println("9. Thoát");
            int choice;
            while (true) {
                try {
                    System.out.println("Nhập lựa chọn của bạn");
                    choice = Integer.parseInt(scanner.nextLine());
                    break;
                } catch (Exception ignored) {

                }
            }

            switch (choice){
                case 1:
                    manageProduct.display();
                    break;
                case 2:
                    manageProduct.add(manageProduct.create());
                    break;
                case 3:
                    manageProduct.edit();
                    break;
                case 4:
                    manageProduct.delete();
                    break;
                case 5:
                    manageProduct.sortProduct();
                    break;
                case 6:
                    System.out.println(manageProduct.findProductMax());
                    break;
                case 7:
                   manageProduct.read();
                    break;
                case 8:
                    manageProduct.write();
                    break;
                case 9:
                    return;
            }

        }

    }
}
