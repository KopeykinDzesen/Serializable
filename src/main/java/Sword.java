import java.io.Serializable;

public class Sword implements Serializable{

    int level;

    @Override
    public String toString() {
        return "Sword{" +
                "level=" + level +
                '}';
    }

}
