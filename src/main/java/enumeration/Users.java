package enumeration;

public enum Users {
    ZORAN("zoran.v.zivanovic@gmail.com","", "Belgrade 11000");

    private final String userName;
    private final String password;
    private final String city;

    Users(String userName, String password, String description) {
        this.userName = userName;
        this.password = password;
        this.city = description;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public String getDescription() {
        return city;
    }
}
