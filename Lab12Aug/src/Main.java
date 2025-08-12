public class Main {
    public static void main(String[] args) {
        Feedback feedback = new Feedback();
        feedback.scanElements();
        feedback.writeInFile();
        feedback.readFromFile();
    }
}