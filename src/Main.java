import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main implements Manu {
    public static void main(String[] args) {
        PhoneManage phoneManage = new PhoneManage();
        try {
            do {
                System.out.println(" QUAN LI DIEN THOAI");
                System.out.println("  chon chuc nang : ");
                System.out.println(" 1 . them moi : ");
                System.out.println(" 2 . xoa :  ");
                System.out.println(" 3 . xem danh sach : ");
                System.out.println(" 4 . tim kiem : ");
                System.out.println(" 5 . ghi du lieu vao file ");
                System.out.println(" 6 . thoat chuong trinh ");
                Scanner scanner = new Scanner(System.in);
                int choix = Integer.parseInt(scanner.nextLine());
                switch (choix) {
                    case ADD_PHONE:
                        phoneManage.addPhone(phoneManage, scanner);
                        break;
                    case DELETE_PHONE:
                        phoneManage.deletePhone(scanner, phoneManage);
                        break;
                    case SHOW_PHONE:
                        phoneManage.showPhone();
                        break;
                    case SEARCH_PHONE:
                        phoneManage.searchByName(scanner);
                        break;
                    case WRITE_FILE:
                        writereadfile.writeFile(phoneManage);
                    case EXIT:
                        System.exit(0);
                }
            } while (true);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}