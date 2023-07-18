public class Main {
    public static void main(String[] args) {
        GameProgress gp1 = new GameProgress(100, 2, 55, 15);
        GameProgress gp2 = new GameProgress(80, 3, 50, 19);
        GameProgress gp3 = new GameProgress(95, 4, 3, 11);
        gp1.saveGame("C:/Users/60131716/IdeaProjects//potoki2/save1.dat", gp1);
        gp2.saveGame("C:/Users/60131716/IdeaProjects//potoki2/save2.dat", gp2);
        gp3.saveGame("C:/Users/60131716/IdeaProjects//potoki2/save3.dat", gp3);
    }
}