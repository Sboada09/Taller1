import java.util.Arrays;
import java.util.Random;

public class Comparacion {
    public static void main(String[] args) {
       
        int[] listA = new int[2000];
        Random random = new Random();
        for (int i = 0; i < listA.length; i++) {
            listA[i] = random.nextInt(2000);
        }
        
       
        Arrays.sort(listA);
        
        
        int[] listB = new int[500];
        for (int i = 0; i < listB.length; i++) {
            listB[i] = random.nextInt(2000);
        }
        
        
        long sequentialSearchTime = 0;
        long binarySearchTime = 0;
        for (int key : listB) {
            // Medir tiempo de búsqueda secuencial
            long startTime = System.nanoTime();
            sequentialSearch(listA, key);
            long endTime = System.nanoTime();
            sequentialSearchTime += (endTime - startTime);
            
            
            startTime = System.nanoTime();
            binarySearch(listA, key);
            endTime = System.nanoTime();
            binarySearchTime += (endTime - startTime);
        }
        
        
        System.out.println("Tiempo total de búsqueda secuencial: " + sequentialSearchTime + " nanosegundos");
        System.out.println("Tiempo total de búsqueda binaria: " + binarySearchTime + " nanosegundos");
    }
    
    public static boolean sequentialSearch(int[] array, int key) {
        for (int element : array) {
            if (element == key) {
                return true;
            }
        }
        return false;
    }
    
    public static boolean binarySearch(int[] array, int key) {
        int low = 0;
        int high = array.length - 1;
        
        while (low <= high) {
            int mid = (low + high) / 2;
            if (array[mid] == key) {
                return true;
            } else if (array[mid] < key) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        
        return false;
    }
}
