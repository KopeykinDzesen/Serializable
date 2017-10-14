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

        User newUser;

        FileInputStream fileInputStream = new FileInputStream("tempFile");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        newUser = (User) objectInputStream.readObject();
        objectInputStream.close();

        System.out.println("user: " + user.toString());
        System.out.println(newUser.staticField);
        System.out.println("------------------");
        System.out.println("newUser: " + newUser.toString());
        System.out.println(newUser.staticField);
        System.out.println("------------------");

//-----------------------------------------------------------------------------------

        User1Child user1Child = new User1Child();
        user1Child.hp = 22;
        Sword sword1 = new Sword();
        sword1.level = 10;
        user1Child.sword = sword1;
        user1Child.level = 25;

        FileOutputStream fileOutputStream1 = new FileOutputStream("tempFile1");
        ObjectOutputStream objectOutputStream1 = new ObjectOutputStream(fileOutputStream1);
        objectOutputStream1.writeObject(user1Child);
        objectOutputStream1.close();

        User1Child newUser1Child;

        FileInputStream fileInputStream1 = new FileInputStream("tempFile1");
        ObjectInputStream objectInputStream1 = new ObjectInputStream(fileInputStream1);
        newUser1Child = (User1Child) objectInputStream1.readObject();
        objectInputStream1.close();

        System.out.println("user1Child: " + user1Child.toString());
        System.out.println("------------------");
        System.out.println("newUser1Child: " + newUser1Child.toString());
        System.out.println("------------------");

    }

}
