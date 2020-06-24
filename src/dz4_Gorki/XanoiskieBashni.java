package dz4_Gorki;

public class XanoiskieBashni {
    public static void main(String[] args) {
        int n_Diskov = 3;
        programma(n_Diskov, " A ", " B ", " C ");
    }
    public static void programma (int n_Diskov, String start_disk, String temp, String end_disk){
        if (n_Diskov == 1){
            System.out.println("Disk 1 from" + start_disk + "to" +end_disk);
        }
        else {
            programma(n_Diskov-1, start_disk, end_disk, temp);
            System.out.println("Disk " + n_Diskov + start_disk + "to" + end_disk);
            programma(n_Diskov-1, temp, start_disk, end_disk);
        }
    }
}
