public class Prob8 {

    public static void main(String[] args) {
        double totalPopulation = 80000;
        double percentageMen = 52.0;
        double percentageTotalLiteracy = 48.0;
        double percentageLiterateMen = 35.0;
        // Calculate the number of men and women in the town
        double numberOfMen = totalPopulation * (percentageMen / 100);
        double numberOfWomen = totalPopulation - numberOfMen;
        // Calculate the number of literate men and total literate people
        double literateMen = totalPopulation * (percentageLiterateMen / 100);
        double totalLiteratePeople = totalPopulation * (percentageTotalLiteracy / 100);
        // Calculate the number of literate women
        double literateWomen = totalLiteratePeople - literateMen;
        // Calculate the number of illiterate men and women
        double illiterateMen = numberOfMen - literateMen;
        double illiterateWomen = numberOfWomen - literateWomen;
        // results
        System.out.println("Total number of illiterate men: " + illiterateMen);
        System.out.println("Total number of illiterate women: " + illiterateWomen);
    }
}
