import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Methods methods = new Methods();
        Menu menu = new Menu();
        System.out.println("----Chương trình quản lý danh bạ----");
        System.out.println("Chọn chức năng theo số (để tiếp tục) : ");
        do {
            System.out.println("1. Xem danh sách ");
            System.out.println("2. Thêm mới ");
            System.out.println("3. Cập nhật ");
            System.out.println("4. Xóa ");
            System.out.println("5. Tìm kiếm ");
            System.out.println("6. Đọc từ file ");
            System.out.println("7. Ghi vào File");
            System.out.println("8. Thoát");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    methods.readUser();
                    break;
                case 2:
                    User user = menu.addMenu();
                    methods.addUser(user);
                    break;
                case 3:
                    System.out.println("Nhap so dien thoai de sua thong tin ca nhan : ");
                    int phoneNumber = Integer.parseInt(sc.nextLine());
                    methods.repairAddress(phoneNumber);
                    break;
                case 4:
                    System.out.println("Nhap ten nguoi dung ban muon xoa : ");
                    String name = sc.nextLine();
                    methods.deleteUser(name);
                    break;
                case 5:
                    System.out.println("Nhap ten nguoi dung : ");
                    String name1 = sc.nextLine();
                    methods.searchName(name1);
                    break;
                case 6:
                    String csvFile = "/Users/macbook/Desktop/data/contacts.csv";
                    File file = new File(csvFile);
                    String line = "";
                    try(BufferedReader br = new BufferedReader(new FileReader(csvFile))){
                        while((line = br.readLine()) != null && !line.isEmpty()){
                            String fields[]= line.split(" , ");
                            System.out.println("so dien thoai: "+fields[0] + " nhom : "+fields[1]+" ho va ten : "+fields[2] +" gioi tinh : "+fields[3]+" dia chi : "+fields[4]+" ngay sinh: "+fields[5]+" email : "+fields[6]);
                        }
                    } catch (FileNotFoundException e) {
                        e.printStackTrace();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    break;
                case 7:
                    break;
                case 8:
                    System.exit(0);
                default:
                    System.out.println("Khong co lua chon nao : ");
                    break;
            }
        } while (true);
    }
}
