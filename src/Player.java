public class Player {
    String userName;
    char token;

    public Player(String userName) {
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public char getToken() {
        return token;
    }

    public void setToken(char token) {
        this.token = token;
    }
}
