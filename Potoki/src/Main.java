import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();

        File file1 = new File("C://Games/src");
        file1.mkdir();
        sb.append("C://Games/src\n");


        File file2 = new File("C://Games/res");
        file2.mkdir();
        sb.append("C://Games/res\n");

        File file3 = new File("C://Games/savegames");
        file3.mkdir();
        sb.append("C://Games/savegames\n");

        File file4 = new File("C://Games/temp");
        file4.mkdir();
        sb.append("C://Games/temp\n");

        File file5 = new File("C://Games/src/main");
        file5.mkdir();
        sb.append("C://Games/src/main\n");

        File file6 = new File("C://Games/src/test");
        file6.mkdir();
        sb.append("C://Games/src/test\n");

        try {
            File file7 = new File("C://Games/src/main/Main.java");
            file7.createNewFile();
            sb.append("C://Games/main/Main.java\n");
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            File file8 = new File("C://Games/src/main/Utils.java");
            file8.createNewFile();
            sb.append("C://Games/main/Utils.java\n");
        } catch (IOException e) {
            e.printStackTrace();
        }

        File file9 = new File("C://Games/res/drawables");
        file9.mkdir();
        sb.append("C://Games/res/drawables\n");

        File file10 = new File("C://Games/res/vectors");
        file10.mkdir();
        sb.append("C://Games/res/vectors\n");

        File file11 = new File("C://Games/res/icons");
        file11.mkdir();
        sb.append("C://Games/res/icons\n");

        try {
            File file8 = new File("C://Games/temp/temp.txt");
            file8.createNewFile();
            sb.append("C://Games/temp/temp.txt\n");
        } catch (IOException e) {
            e.printStackTrace();
        }

        String text = sb.toString();

        try {
            FileWriter writer = new FileWriter("C://Games/temp/temp.txt", true);
            writer.write(text);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(text);
    }
}