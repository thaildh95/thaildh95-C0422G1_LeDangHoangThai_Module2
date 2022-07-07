package case_study.util.read_and_write;


import case_study.facility.Villa;

import java.io.*;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class ReadAndWriteForVilla {
    public static Map<Villa,Integer> readFile() {
        Map<Villa,Integer> villaMap= new LinkedHashMap<>();
        File file = new File("src/case_study/data/villa_data.csv");
        FileReader fileReader;
        BufferedReader bufferedReader;
        String string;
        String[] arr;
        try {
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            while ((string = bufferedReader.readLine()) != null) {
                arr = string.split(",");
                villaMap.put(new Villa(arr[0], Double.parseDouble(arr[1]), Double.parseDouble(arr[2]), Integer.parseInt(arr[3]), arr[4],
                        arr[5], Double.parseDouble(arr[6]), Integer.parseInt(arr[7])),0);
//                String serviceName, double useArea, double rentPrice, int maximumPeople, String rentType, String typeRoom, double poolArea, int floor) {
            }
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return villaMap;
    }

    public static  void writeFile(Map<Villa,Integer> villaMap ,boolean append) {
        File file = new File("src/case_study/data/villa_data.csv");
        FileWriter fileWriter;
        BufferedWriter bufferedWriter;
        try {
            fileWriter = new FileWriter(file,append);
            bufferedWriter = new BufferedWriter(fileWriter);
            Set<Villa> villaSet = villaMap.keySet();
            for (Villa v: villaSet) {
               bufferedWriter.write(v.getVillaInfo()+","+villaMap.get(v));
               bufferedWriter.newLine();
                
            }
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
