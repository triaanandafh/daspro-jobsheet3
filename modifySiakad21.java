import java.util.Scanner;
public class modifySiakad21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nama, nim, kelas;
        // char kelas;
        byte absen;
        double quizScores, assignmentScores, utsScores, uasScores, finalScore, percentQuiz, percentAssignment, percentUts, percentUas;

        System.out.print("Enter name: ");
        nama = sc.nextLine();
        System.out.print("Enter NIM: ");
        nim = sc.nextLine();
        System.out.print("Enter class: ");
        kelas = sc.nextLine();
        System.out.print("Enter attendance number: ");
        absen = sc.nextByte();

        System.out.print("Enter quiz score: ");
        quizScores = sc.nextDouble();
        System.out.print("Enter your assignment score: ");
        assignmentScores = sc.nextDouble();
        System.out.print("Enter UTS score: ");
        utsScores = sc.nextDouble();
        System.out.println("Enter UAS score: ");
        uasScores = sc.nextDouble();

        percentQuiz = quizScores * 0.2;
        percentAssignment = assignmentScores * 0.15;
        percentUts = utsScores * 0.3;
        percentUas = uasScores * 0.35;

        finalScore = percentQuiz + percentAssignment + percentUts + percentUas;

        System.out.println("Students with name " + nama + " (NIM " + nim + ")" + " class of " + kelas + " attendance number " + absen);
        System.out.println("Final score: " + finalScore);
}
}