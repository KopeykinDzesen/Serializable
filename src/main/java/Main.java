import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception{
        User user = new User();
        user.hp = 22;
        User.staticField = 100;
        Sword sword = new Sword();
        sword.level = 10;
        user.sword = sword;

        FileOutputStream fileOutputStream = new FileOutputStream("tempFile");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(user);
        objectOutputStream.close();

        User.staticField = 200;

        FileInputStream fileInputStream = new FileInputStream("tempFile");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        User newUser = (User) objectInputStream.readObject();
        objectInputStream.close();

        System.out.println(newUser.hp + " " + newUser.sword.level);
        System.out.println(newUser.staticField);

    }

}
