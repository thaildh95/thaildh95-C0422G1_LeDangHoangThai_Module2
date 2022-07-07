package case_study.util.read_and_write;

import case_study.facility.House;
import java.io.*;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;


public class ReadAndWriteForHouse{
    public static Map<House,Integer> readFile() {
        Map<House,Integer> houseMap= new LinkedHashMap<>();
        File file = new File("src/case_study/data/house_data.csv");
        FileReader fileReader;
        BufferedReader bufferedReader;
        String string;
        String[] arr;
        try {
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            while ((string = bufferedReader.readLine()) != null) {
                arr = string.split(",");
                houseMap.put(new House(arr[0], Double.parseDouble(arr[1]), Double.parseDouble(arr[2]), Integer.parseInt(arr[3]), arr[4],
                        arr[5], Integer.parseInt(arr[6])),Integer.parseInt(arr[7]));
//                String serviceName, double useArea, double rentPrice,
//                int maximumPeople, String rentType, String typeRoom, int floor) {
            }
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return houseMap;
    }

    public static  void writeFile(Map<House,Integer> houseMap, boolean append) {
        File file = new File("src/case_study/data/house_data.csv");
        FileWriter fileWriter;
        BufferedWriter bufferedWriter;
        try {
            fileWriter = new FileWriter(file,append);
            bufferedWriter = new BufferedWriter(fileWriter);
            Set<House> houseSet = houseMap.keySet();
            for (House v: houseSet) {
               bufferedWriter.write(v.getHouseInfo()+ ","+houseMap.get(v));
               bufferedWriter.newLine();

            }
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
