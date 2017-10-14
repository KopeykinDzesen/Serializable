import java.io.Serializable;

public class User1Child extends User1 implements Serializable{

    int level;

    @Override
    public String toString() {
        return "User1Child{" +
                "hp=" + hp +
                ", sword=" + sword +
                "level=" + level +
                '}';
    }

}
