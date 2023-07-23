import java.io.*;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class GameProgress implements Serializable {
    private static final long serialVersionUID = 1L;

    private int health;
    private int weapons;
    private int lvl;
    private double distance;

    public GameProgress(int health, int weapons, int lvl, double distance) {
        this.health = health;
        this.weapons = weapons;
        this.lvl = lvl;
        this.distance = distance;
    }
    public void saveGame(String addres, GameProgress progress) {
        try (FileOutputStream fos = new FileOutputStream(addres);
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            oos.writeObject(progress);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
    public static void zipFiles(String way, List<String> myList) {
        try (FileOutputStream fos = new FileOutputStream(way);
             ZipOutputStream zout = new ZipOutputStream(fos)) {

            for (String fileWay : myList) {
                File fileZip = new File(fileWay);

                try (FileInputStream fis = new FileInputStream(fileZip)) {
                    ZipEntry zipEntry = new ZipEntry(fileZip.getName());
                    zout.putNextEntry(zipEntry);

                    byte[] buffer = new byte[fis.available()];
                    fis.read(buffer);
                    zout.write(buffer);
                    zout.closeEntry();
                } catch (IOException e) {
                    System.out.println(e.getMessage());
                }
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public String toString() {
        return "GameProgress{" +
                "health=" + health +
                ", weapons=" + weapons +
                ", lvl=" + lvl +
                ", distance=" + distance +
                '}';
    }
}