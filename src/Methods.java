import java.util.ArrayList;
import java.util.Scanner;

public class Methods {
    Scanner sc = new Scanner(System.in);
    ArrayList<User> users = new ArrayList<>();
    public void addUser(User user){
        users.add(user);
    }
    public void readUser(){
        for (User x :users
             ) {
            System.out.println(x.toString())    ;
        }
    }
    public void deleteUser(String name){
        for (User x :users
             ) {
            if(x.getName().equals(name)){
                users.remove(x);
                break;
            }
        }
    }
    public void searchName(String name){
        for (User x:users
             ) {
            if(x.getName().equals(name)){
                System.out.println(x.toString());
            }
        }
    }
    public void repairAddress(int phoneNumber){
        for (User x:users
             ) {
            if(x.getPhoneNumber().equals(phoneNumber)){
                System.out.println("Nhập nhóm bạn : ");
                x.setKindGroup(sc.nextLine());
                System.out.println("Họ tên mới : ");
                x.setName(sc.nextLine());
                System.out.println("Giới tính : ");
                x.setGender(sc.nextLine());
                System.out.println("Dia chi : ");
                x.setAddress(sc.nextLine());
                System.out.println("Ngay sinh : ");
                x.setDateOfBirth(sc.nextLine());
                System.out.println("Nhap Email : ");
                x.setEmail(sc.nextLine());
            }else {
                System.out.println("Khong tim thay so dien thoai tren ");
                System.out.println("Moi ban nhap lai ");
                x.setPhoneNumber(sc.nextLine());
            }
        }
    }
}
