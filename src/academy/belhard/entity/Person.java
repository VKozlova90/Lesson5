package academy.belhard.entity;

public class Person {

    protected String firstName;
    protected String lastName;

    public Person() {
        this.firstName = firstName;
        this.lastName = lastName;
    }

public void printInfo(){
    System.out.println("Имя: " + firstName);
    System.out.println("Фамилия: " + lastName);
}

    public String getFulltName() {
        return "Имя:" + "firstName" + " lastName";
    }



}
