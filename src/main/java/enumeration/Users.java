package enumeration;

public enum Users {
    SIGN_UP_USER("","", ""),
    SIGN_IN_USER("","", "");


    private final String userName;
    private final String password;
    private final String description;

    Users(String userName, String password, String description) {
        this.userName = userName;
        this.password = password;
        this.description = description;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public String getDescription() {
        return description;
    }
}
