import java.util.Arrays;

public class NotasColegio {
    public static void main(String[] args) {
        
        double[][] Notas = {
            {90, 85, 80, 75, 70},
            {80, 75, 70, 65, 60},
            {70, 65, 60, 55, 50},
            {60, 55, 50, 45, 40},
            {50, 45, 40, 35, 30}
        };
        
        
        double[] PromedioEst = new double[Notas.length];
        for (int i = 0; i < Notas.length; i++) {
            double sum = 0;
            for (int j = 0; j < Notas[i].length; j++) {
                sum += Notas[i][j];
            }
            PromedioEst[i] = sum / Notas[i].length;
        }
        
        
        double[] PromedioMaterias = new double[Notas[0].length];
        for (int j = 0; j < Notas[0].length; j++) {
            double sum = 0;
            for (int i = 0; i < Notas.length; i++) {
                sum += Notas[i][j];
            }
            PromedioMaterias[j] = sum / Notas.length;
        }
        
        
        double totalSum = 0;
        for (int i = 0; i < PromedioEst.length; i++) {
            totalSum += PromedioEst[i];
        }
        double PromedioClase = totalSum / PromedioEst.length;
        
        
        shellSort(PromedioEst);
        
        
        System.out.println("Media de cada alumno: " + Arrays.toString(PromedioEst));
        System.out.println("Media de cada asignatura: " + Arrays.toString(PromedioMaterias));
        System.out.println("Media total de la clase: " + PromedioClase);
    }
    
    public static void shellSort(double[] array) {
        int n = array.length;
        
        for (int gap = n/2; gap > 0; gap /= 2) {
            for (int i = gap; i < n; i += 1) {
                double temp = array[i];
                int j;
                for (j = i; j >= gap && array[j - gap] < temp; j -= gap) {
                    array[j] = array[j - gap];
                }
                array[j] = temp;
            }
        }
    }
}
