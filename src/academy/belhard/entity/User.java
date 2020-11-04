package academy.belhard.entity;

public class User extends Person{
    private String email;
    private String password;


    public User(String firstName, String lastName, String email, String password) {
            super(firstName, lastName);
            this.email = email;
            this.password = password;
        }

    public String getFullName(){
        @Override
        public String getFulltName() {
            return super.getFulltName();
        }
        return "email: "+ email;
    }

    public boolean isPasswordCorrect(String password1){
        System.out.println(password.equals(password1));
    }

}
