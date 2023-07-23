import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        GameProgress gp1 = new GameProgress(100, 2, 55, 15);
        GameProgress gp2 = new GameProgress(80, 3, 50, 19);
        GameProgress gp3 = new GameProgress(95, 4, 3, 11);
        gp1.saveGame("C:/Users/60131716/IdeaProjects//potoki2/save1.dat",gp1);
        gp2.saveGame("C:/Users/60131716/IdeaProjects//potoki2/save2.dat",gp2);
        gp3.saveGame("C:/Users/60131716/IdeaProjects//potoki2/save3.dat",gp3);

        List < String> myList = new ArrayList<>();
        myList.add("C:/Users/60131716/IdeaProjects//potoki2/save1.dat");
        myList.add("C:/Users/60131716/IdeaProjects//potoki2/save2.dat");
        myList.add("C:/Users/60131716/IdeaProjects//potoki2/save3.dat");

        GameProgress.zipFiles("C:/Users/60131716/IdeaProjects//potoki2/zip.zip", myList);

        for (String fileZipWay : myList) {
            File fileZip = new File(fileZipWay);
            if (fileZip.exists()) {
                fileZip.delete();
            }
        }
    }
}