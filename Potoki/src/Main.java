import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    private static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {

        createFolder("C://Games/src");

        createFolder("C://Games/res");

        createFolder("C://Games/savegames");

        createFolder("C://Games/temp");

        createFolder("C://Games/src/main");

        createFolder("C://Games/src/test");

        createFile("C://Games/src/main/Main.java");

        createFile("C://Games/src/main/Utils.java");

        createFolder("C://Games/res/drawables");

        createFolder("C://Games/res/vectors");

        createFolder("C://Games/res/icons");

        createFile("C://Games/temp/temp.txt");

        fileWriter("C://Games/temp/temp.txt");


    }
    public static void createFolder(String way){
        File file = new File(way);
        if (file.mkdirs()) {
            sb.append(way + "\n");
        }
        else {
            sb.append("Ошибка создания папки " + way + "\n");
        }
    }
    public static void createFile(String way) throws IOException {
        File file = new File(way);
        if (file.createNewFile()) {
            sb.append(way + "\n");
        }
        else {
            sb.append("Ошибка создания файла " +  way + "\n");
        }
    }
    public static void fileWriter(String way){
        String text = sb.toString();

        try {
            FileWriter writer = new FileWriter(way, true);
            writer.write(text);
            writer.close();
        } catch (IOException e){
            e.printStackTrace();
        }

        System.out.println(text);
    }
}