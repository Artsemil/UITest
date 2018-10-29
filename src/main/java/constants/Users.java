package constants;

public enum Users {

    FIRST_USER("JavaTestSelenium1@gmail.com", "1234QWer"),
    SECOND_USER("JavaTestSelenium2@gmail.com", "1234QWer");

    String email;
    String password;

    Users(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
}
