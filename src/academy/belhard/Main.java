package academy.belhard;

import academy.belhard.entity.Person;
import academy.belhard.entity.User;

public class Main {

    public static void main(String[] args) {
        User user1 = new User("Tom", "Korn", "1234534@mail.ru", "94hy5411");
        System.out.println(user1.getFullInfo());
        user1.isPasswordCorrect("94hy54fjhkl11");
    }

}
