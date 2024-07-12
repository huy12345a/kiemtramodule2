import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PhoneManage {
    static int id = 1;
    public static void addPhone(PhoneManage phoneManage, Scanner scanner) {
        try {
            System.out.println("Chọn loại dien thoai");
            System.out.println("1 :dien thoai chinh hang : ");
            System.out.println("2 :dien thaoi xach tay : ");

            int choosePhone = Integer.parseInt(scanner.nextLine());

            if (choosePhone != 1 && choosePhone != 2) {
                System.out.println("Nhap sai");
                return;
            }
            System.out.println("Nhập ten dien thaoi :");
            String name = scanner.nextLine();
            System.out.println("Nhap gia ban : ");
            String primephone = scanner.nextLine();
            System.out.println("Nhập so luong : ");
            String quantityphone = scanner.nextLine();
            System.out.println("Nhập nha san xuat : ");
            String manufacture = scanner.nextLine();
            if (choosePhone == 1) {
                System.out.println("Nhap thoi gian bao hanh : ");
                String warrantyperiod = scanner.nextLine();
                System.out.println("nhap pham vi bao hanh : ");
                String warrantyscope = scanner.nextLine();
                Mainphone mainphone = new Mainphone(id, name, primephone, quantityphone, manufacture, warrantyperiod, warrantyscope);
                phoneManage.addPhone(mainphone);
                id++;
                System.out.println("nhap dien thoai chinh hang thanh cong ");
            } else {
                System.out.println("Nhap quoc gia : ");
                String country = scanner.nextLine();
                System.out.println("nhap trang thai : ");
                String status = scanner.nextLine();
                CellPhone cellPhone = new CellPhone(id, name, primephone, quantityphone, manufacture, country, status);
                phoneManage.addPhone(cellPhone);
                id++;
                System.out.println("Nhap dien thoai xach tay tahnh cong");

            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void deletePhone(Scanner scanner, PhoneManage phoneManage) {
        try {
            System.out.println("nhap dien thoai muon xoa: ");

        String name = scanner.nextLine();
        Phone phone = phoneManage.searchByCode(name);
        if (phone == null) {
            System.out.println("Loi xay ra");
        } else {
            phoneManage.deletePhone(phone);
        }
    }catch (Exception e){
            System.out.println(e.getMessage());}
    }

    private final Map<String, Phone> phoneManageMap;

    public PhoneManage() {
        this.phoneManageMap = new HashMap<>();
    }

    public Map<String, Phone> getPhoneManageMap() {
        return phoneManageMap;
    }



    public void addPhone(Phone phone) {
        phoneManageMap.put(phone.getName(), phone);
    }

    public void deletePhone(Phone phone) {

        phoneManageMap.remove(phone.getName());
    }

    public Phone searchByCode(String code) {
        return phoneManageMap.get(code);
    }

    public void showPhone() {
        if (phoneManageMap.isEmpty()) {
            System.out.println("ko co dien thaoi");
            return;
        }
        for (Phone phone : phoneManageMap.values()) {
            System.out.println(phone);
        }
    }
    public Phone searchByName(Scanner scanner) {
        System.out.println("nhap vao ten dien thoai : ");
        String name = scanner.nextLine();
        for (Phone phone : phoneManageMap.values()) {
            if (phone.getName().equalsIgnoreCase(name)) {
                return phone;
            }
        }
        return null;
    }

    }

