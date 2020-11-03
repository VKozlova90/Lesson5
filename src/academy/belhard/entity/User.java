package academy.belhard.entity;

public class User extends Person{
    private String email;
    private String password;

    public User(String email, String password) {
        super(firstName, lastName);
        this.email = email;
        this.password = password;
    }

    public String getFullName(){
        System.out.println("firstName");
        System.out.println("lastName");
        System.out.println("email");
    }

    public boolean isPasswordCorrect(){

    }
}
