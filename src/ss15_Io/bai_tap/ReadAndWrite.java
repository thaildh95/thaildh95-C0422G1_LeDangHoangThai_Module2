package ss15_Io.bai_tap;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReadAndWrite {
    public static List<String> readFile(String filePath){
        List<String> numbers = new ArrayList<>();
        File file = new File(filePath);
        FileReader fileReader  = null;
        BufferedReader bufferedReader = null;
        String str = "";

        try {
            fileReader = new FileReader(file);
            if (!file.exists()){
                throw new FileNotFoundException();
            }
            bufferedReader = new BufferedReader(fileReader);
            while ((str=bufferedReader.readLine())!=null){
                numbers.add(str);
            }
            bufferedReader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
            return numbers;
    }
    public static  void writeFile(List<String> numbers , String fileTarget,boolean append){
        File file = new File(fileTarget);
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(file,append);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (String s: numbers) {
                bufferedWriter.write(s);
                bufferedWriter.newLine();

            }
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
//
        String filePath = "src/ss15_Io/bai_tap/baitap.csv";
        String targetPath = "src/ss15_Io/bai_tap/result.csv";

        Scanner scanner = new Scanner(System.in);
        System.out.println("moi nhap du lieu vao");
        String str = scanner.nextLine();
        List<String> trung = new ArrayList<>();
        trung.add(str);
        writeFile(trung,filePath,true);
        readFile(filePath);
        List<String> numbers =  readFile(filePath);
        writeFile(numbers,targetPath,true);
    }
}
