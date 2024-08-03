public class Prob3 {

    public static void main(String[] args) {
        // Marks obtained by the student in five subjects
        int marksSubject1 = 80;
        int marksSubject2 = 90;
        int marksSubject3 = 75;
        int marksSubject4 = 60;
        int marksSubject5 = 100;
        
        int aggregateMarks = marksSubject1 + marksSubject2 + marksSubject3 + marksSubject4 + marksSubject5;

        double percentageMarks = (aggregateMarks / 500) * 100;

        // result
        System.out.println("Aggregate Marks: " + aggregateMarks);
        System.out.println("Percentage Marks: " + percentageMarks + "%");
    }
}
