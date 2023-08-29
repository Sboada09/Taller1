public class MedianaVector {
    public static void main(String[] args) {
        double[] vector = {5.2, 1.7, 3.9, 7.1, 2.5, 6.8, 4.0}; 
        double mediana = calcularMediana(vector);

        System.out.println("Mediana del vector: " + mediana);
    }

    public static double calcularMediana(double[] vector) {
        int n = vector.length;
        int middleIndex = n / 2;

        
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (vector[j] > vector[j + 1]) {
                    double temp = vector[j];
                    vector[j] = vector[j + 1];
                    vector[j + 1] = temp;
                }
            }
        }

        
        if (n % 2 == 1) {
            return vector[middleIndex];
        }
        
        else {
            double valormitad1 = vector[middleIndex - 1];
            double valormitad2 = vector[middleIndex];
            return (valormitad1 + valormitad2) / 2.0;
        }
    }
}
