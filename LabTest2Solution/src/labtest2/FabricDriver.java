package labtest2;

import java.io.IOException;
import java.io.RandomAccessFile;

public class FabricDriver {

    public static void FileCreator(String filename) {
        try (RandomAccessFile file = new RandomAccessFile(filename, "rw")) {
            // Write 5 records to the file
            for (int i = 0; i < 5; i++) {
                // For simplicity, let's write the fabric type as a string
                // followed by fabric weight, fabric thickness, fabric width, and fabric color as double, float, int, and string respectively
                file.writeUTF("FabricRecord" + i);
                file.writeDouble(2.3);  // Example fabric weight
                file.writeFloat(0.23f);  // Example fabric thickness
                file.writeInt(49);  // Example fabric width
                file.writeUTF("Blue");  // Example fabric color
            }
            System.out.println("File created successfully with 5 records.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void FileFabric(String filename, double fabricDiameter) {
        try (RandomAccessFile file = new RandomAccessFile(filename, "r")) {
            // Assuming each record in the file has the same structure as written in FileCreator
            int recordSize = 2 * 8 + 4 + 4 + 2 * 8; // String (fabricType) + 4 doubles + float + int + String (fabricColor)

            // Calculate the number of records in the file
            long numRecords = file.length() / recordSize;

            // Search for fabricDiameter in the fabricThickness field of each record
            for (int i = 0; i < numRecords; i++) {
                file.seek(i * recordSize + 8);  // Move to the fabricThickness field in the current record
                float currentFabricThickness = file.readFloat();
                // Check if the current fabricThickness matches the fabricDiameter
                if (currentFabricThickness == fabricDiameter) {
                    System.out.println("Record found at position " + i);
                    return;  // Record found, exit the method
                }
            }
            System.out.println("Record with fabricDiameter " + fabricDiameter + " not found.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args){

        FabricProperty fpro = new FabricProperty("Chiffon", 2.3, 0, 49, "Blue");

        Velvet vel = new Velvet("Velvet", 13.2, 1, 19, "Red", 0.75, "Soft Velvet");

        Cotton ctn =new Cotton("Cotton", 4.2, 2, 103, "White", 0.11, true, 20);

        // Create the file
        FileCreator("fabricRecords.dat");

        // Search for a fabric record with a specific fabricDiameter
        FileFabric("fabricRecords.dat", 0.23);

        fpro.Show();
        ctn.Display();
        vel.Display();

    }
}
