/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package basiclibrary;



import java.util.*;

public class Library {
    public boolean someLibraryMethod() {
        return true;
    }

    public static int[] roll(int n) {
        int[] arrayOfRolls = new int[n];

        for(int i = 0; i < arrayOfRolls.length; i++) {
           int rollResult = (int) (Math.random() * 6 ) + 1;
            arrayOfRolls[i] = rollResult;
        }
        return arrayOfRolls;
    }

    public static boolean containsDuplicates(int[] array){
        for(int index = 0; index < array.length; index++){
            for(int secIndex = index + 1; secIndex < array.length; secIndex++){
                if(array[index] == array[secIndex]){
                    return true;
                }
            }
        }
        return false;
    }

    public static double calculatingAverages(int[] array){
       double sumTotal = 0;
        for( int number : array){
            sumTotal += number;
        }
        return sumTotal / array.length;
    }

    public static int[] arrayWithTheLowestAverage(int[][] arraysOfArrays){
        int[] arrayofLowestAverage = arraysOfArrays[0];

        for(int index = 1; index < arraysOfArrays.length; index++ ) {
            if (calculatingAverages(arraysOfArrays[index]) < calculatingAverages(arrayofLowestAverage)) {
                arrayofLowestAverage = arraysOfArrays[index];
            }
        }
        return arrayofLowestAverage;
    }

    public static String analyzingWeatherData(int[][] arrayOfArrays) {
        HashSet<Integer> uniqueTemp = new HashSet<>();
        int highestTemp = arrayOfArrays[0][0];
        int lowestTemp = arrayOfArrays[0][0];
        for (int[] array: arrayOfArrays) {
            for(int index = 0; index < array.length; index++) {
                uniqueTemp.add(array[index]);
                if(array[index] < lowestTemp){
                    lowestTemp = array[index];
                }
                if(array[index] > highestTemp) {
                    highestTemp = array[index];
                }
            }
        }

        String result = "High: " + highestTemp + "\n";
        result += "Low: " + lowestTemp + "\n";
        for( int checkforTemp = lowestTemp; checkforTemp < highestTemp; checkforTemp++) {
            if(!uniqueTemp.contains(checkforTemp)) {
                result += "Never saw temperature: " + checkforTemp + "\n";
            }
        }
        return result;
    }

    public static String tally(List<String> votes) {

        String winner = " ";

        HashMap<String, Integer> possibleVotes = new HashMap<>();
        for(String entry : votes){
            possibleVotes.put(entry, 0);
        }

        for( String vote : votes) {
            int voteCount = possibleVotes.get(vote);
            possibleVotes.put(vote, voteCount + 1);
        }

        int mostVotes = Integer.MIN_VALUE;

        //https://www.baeldung.com/java-iterate-map
        for(HashMap.Entry<String, Integer> votePossiblity : possibleVotes.entrySet()) {
            if (votePossiblity.getValue() > mostVotes){
                mostVotes = votePossiblity.getValue();
                winner = votePossiblity.getKey();

            }
        }

        return winner;
    }

}
