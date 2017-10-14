import java.io.Serializable;

public class User implements Serializable{

    int hp;
    Sword sword;
    static int staticField;

    @Override
    public String toString() {
        return "User{" +
                "hp=" + hp +
                ", sword=" + sword +
                '}';
    }
}
