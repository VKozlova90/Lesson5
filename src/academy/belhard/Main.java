package academy.belhard;

import academy.belhard.entity.Person;
import academy.belhard.entity.User;

public class Main {

    public static void main(String[] args) {
        User user1 = new User("Tom", "Korn", "1234534@mail.ru");
        System.out.println(user1.getFulltName());


    }
}
