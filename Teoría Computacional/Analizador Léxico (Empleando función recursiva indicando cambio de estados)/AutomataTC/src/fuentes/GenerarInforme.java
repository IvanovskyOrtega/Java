package fuentes;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class GenerarInforme {
    public void generarInforme(ArrayList<String> A, ArrayList<String> NA) {
		try {
			File file = new File("C:/Users/Jessica/Desktop/Informe.txt");

			// if file doesnt exists, then create it
			if (!file.exists()) {
				file.createNewFile();
			}

			FileWriter fw = new FileWriter(file.getAbsoluteFile());
			BufferedWriter bw = new BufferedWriter(fw);
			
                        bw.write("Informe final:\n");
                        bw.newLine();
			bw.write("Números aceptados:\n");
                        bw.newLine();
                        for(int i = 0 ; i < A.size() ; i++ ){
                            bw.write("\t"+A.get(i));
                            bw.newLine();
                        }
                        bw.newLine();
                        bw.write("Números no aceptados:\n");
                        bw.newLine();
                        for(int i = 0 ; i < NA.size() ; i++ ){
                            bw.write("\t"+NA.get(i));
                            bw.newLine();
                        }
                        bw.close();

			System.out.println("Done");

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
