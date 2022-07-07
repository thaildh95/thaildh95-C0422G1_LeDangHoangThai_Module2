package case_study.util.read_and_write;


import case_study.facility.Room;

import java.io.*;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class ReadAndWriteForRoom {

    public static Map<Room,Integer> readFile() {
        Map<Room,Integer> roomMap= new LinkedHashMap<>();
        File file = new File("src/case_study/data/room_data.csv");
        FileReader fileReader;
        BufferedReader bufferedReader;
        String string;
        String[] arr;
        try {
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            while ((string = bufferedReader.readLine()) != null) {
                arr = string.split(",");
                roomMap.put(new Room(arr[0], Double.parseDouble(arr[1]), Double.parseDouble(arr[2]), Integer.parseInt(arr[3]), arr[4],
                        arr[5]),0);
//                String serviceName, double useArea, double rentPrice, int maximumPeople, String rentType, String freeService
            }
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return roomMap;
    }

    public static  void writeFile(Map<Room,Integer> roomMap, boolean append) {
        File file = new File("src/case_study/data/room_data.csv");
        FileWriter fileWriter;
        BufferedWriter bufferedWriter;
        try {
            fileWriter = new FileWriter(file,append);
            bufferedWriter = new BufferedWriter(fileWriter);
            Set<Room> roomSet = roomMap.keySet();
            for (Room v: roomSet) {
                bufferedWriter.write(v.getRoomInfo()+ ","+roomMap.get(v));
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
