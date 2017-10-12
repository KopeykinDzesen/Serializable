import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception{
        User user = new User();
        user.hp = 22;
        User newUser = new User();
        newUser.hp = 0;

        FileOutputStream fileOutputStream = new FileOutputStream("tempFile");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(user);
        objectOutputStream.close();

        FileInputStream fileInputStream = new FileInputStream("tempFile");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        newUser = (User) objectInputStream.readObject();
        objectInputStream.close();

        System.out.println(newUser.hp);

    }

}
