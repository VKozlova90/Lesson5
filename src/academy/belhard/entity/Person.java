package academy.belhard.entity;

public class Person {

    protected String firstName;
    protected String lastName;

    public Person(String firstName, String lastName) {
        this.firstName = this.firstName;
        this.lastName = this.lastName;
    }

    public void printInfo(){
        System.out.println("firstName");
        System.out.println("lastName");
    }

    public String getFullName() {
        return "Имя:" + "firstName" + " lastName";
    }



}
