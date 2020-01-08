/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package basiclibrary;


public class Library {
    public boolean someLibraryMethod() {
        return true;
    }

    public static int[] roll(int n) {
        int[] arrayOfRolls = new int[n];

        for(int number : arrayOfRolls) {
           int rollResult = (int) (Math.random()*6)+1;
           number = rollResult;
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

    public static int calculatingAverages(int[] array){
        int sumTotal = 0;
        for( int number : array){
            sumTotal += number;
        }
        return sumTotal/array.length;
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
}
