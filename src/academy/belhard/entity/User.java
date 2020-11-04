package academy.belhard.entity;

public class User extends Person{
    private String email;
    private String password;


    public User(String firstName, String lastName, String email, String password) {
            super (firstName, lastName);
            this.email = email;
            this.password = password;
        }

    public String getFullInfo(){

        return super.getFullName() + "\n" + "Email: "+ email;

    }

    public void isPasswordCorrect(String password1){
        System.out.println(password.equals(password1));
    }

}
