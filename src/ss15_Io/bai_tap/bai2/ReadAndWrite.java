//package ss15_Io.bai_tap.bai2;
//
//import java.io.*;
//import java.util.ArrayList;
//import java.util.List;
//
//public class ReadAndWrite {
//    public static List<Nation> readFile() {
//        List<Nation> list = new ArrayList<>();
//        File file = new File("src/ss15_Io/bai_tap/bai2/nation.csv");
//        FileReader fileReader;
//        BufferedReader bufferedReader;
//        try {
//            fileReader = new FileReader(file);
//            bufferedReader = new BufferedReader(fileReader);
//            String str = "";
//            while ((str = bufferedReader.readLine()) != null) {
//                String[] arr = str.split(",");
//                list.add(new Nation(Integer.parseInt(arr[0]), arr[1], arr[2]));
//                (int)
//            }
//            bufferedReader.close();
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        return list;
//    }
//
//    public static void main(String[] args) {
//
//        for (int i = 0; i < readFile().size(); i++) {
//            System.out.println(readFile().get(i).toString());
//        }
//    }
//}
