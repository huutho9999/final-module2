public class User {
    private String name;
    private String phoneNumber;
    private String address;
    private String email;
    private String facebook;
    private String gender;
    private String dateOfBirth;
    private String kindGroup;

    public User(String name, String phoneNumber, String address, String email, String facebook, String gender, String dateOfBirth, String kindGroup) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.email = email;
        this.facebook = facebook;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.kindGroup = kindGroup;
    }

    public User(String name, String phoneNumber, String address, String email, String facebook, String gender, String dateOfBirth) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.email = email;
        this.facebook = facebook;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
    }

    public User() {
    }

    public User(String name, String phoneNumber, String address, String email, String facebook) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.email = email;
        this.facebook = facebook;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFacebook() {
        return facebook;
    }

    public void setFacebook(String facebook) {
        this.facebook = facebook;
    }

    public String getKindGroup() {
        return kindGroup;
    }

    public void setKindGroup(String kindGroup) {
        this.kindGroup = kindGroup;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", address='" + address + '\'' +
                ", email='" + email + '\'' +
                ", facebook='" + facebook + '\'' +
                ", gender='" + gender + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", kindGroup='" + kindGroup + '\'' +
                '}';
    }
}
