import java.util.Scanner;

public class Menu {
    Scanner sc = new Scanner(System.in);
    Regax regax = new Regax();
    public User addMenu(){
        User user = new User();
        System.out.println("Nhap ten nguoi dung : ");
        user.setName(sc.nextLine());
        System.out.println("Nhap gioi tinh nguoi dung : ");
        user.setGender(sc.nextLine());
        System.out.println("Nhap ngay thang nam sinh nguoi dung : ");
        user.setDateOfBirth(sc.nextLine());
        System.out.println("Nhap so dien thoai nguoi dung : ");
        user.setPhoneNumber(regax.inputPhoneNumber());
        System.out.println("Nhap dia chi nguoi dung : ");
        user.setAddress(sc.nextLine());
        System.out.println("Nhap email nguoi dung : ");
        user.setEmail(sc.nextLine());
        System.out.println("Nhap facebook nguoi dung : ");
        user.setFacebook(sc.nextLine());
        System.out.println("Nhap nhom nguoi dung : ");
        user.setKindGroup(sc.nextLine());
        return user;
    }

}
