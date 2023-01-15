package File_Handling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedWriter;

public class Student {

    public void inputStudent(String name, int id, int mark) {
        try {
            FileWriter fw = new FileWriter("Student-Details", true);
            BufferedWriter bw = new BufferedWriter(fw);

            bw.write("Name: " + name + "\n");
            bw.write("Id:" + id + "\n");
            bw.write("Mark: " + mark + "\n");
            bw.write("-----------------" + "\n");

            bw.flush();
            System.out.println("Done");

            bw.close();
            fw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void loadListStudent() {
        try {
            FileReader fr = new FileReader("Student-Details");
            BufferedReader br = new BufferedReader(fr);

            String data = "";
            while ((data = br.readLine()) != null) {
                System.out.println(data);
            }
            br.close();
            fr.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}



