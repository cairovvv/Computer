public class User {
    private String username;

    public String getRole(){
        return "I am the User Class. I represent the person operating the system.\n";
    }

    public String getSessionInfo(){
        return "Active Session: " + username;
    }

    public User (String username){
        this.username = username;
    }
}