import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DirectorioTelefono {
    public static void main(String[] args) {
        
        Map<String, String> phoneDirectory = new HashMap<>();

        
        try {
            Scanner scanner = new Scanner(new File("phoneData.txt"));
            while (scanner.hasNextLine()) {
                String name = scanner.nextLine();
                String phoneNumber = scanner.nextLine();
                phoneDirectory.put(name, phoneNumber);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("No se pudo encontrar el archivo phoneData.txt");
        }

       
        String nameToSearch = "Juan";
        if (phoneDirectory.containsKey(nameToSearch)) {
            System.out.println(nameToSearch + ": " + phoneDirectory.get(nameToSearch));
        } else {
            System.out.println("No se encontró el nombre " + nameToSearch);
        }

     
        String phoneNumberToSearch = "1234567890";
        boolean found = false;
        for (Map.Entry<String, String> entry : phoneDirectory.entrySet()) {
            if (entry.getValue().equals(phoneNumberToSearch)) {
                System.out.println(entry.getKey() + ": " + phoneNumberToSearch);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("No se encontró el número de teléfono " + phoneNumberToSearch);
        }
    }
}
