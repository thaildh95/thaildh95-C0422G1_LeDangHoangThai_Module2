package case_study.common;

import case_study.model.Customer;
import case_study.util.read_and_write.ReadAndWriteForCustomer;

import java.util.List;
import java.util.Scanner;

public class TypeOfGuest {
    public static String checkTypeOfGuest(){
        Scanner scanner = new Scanner(System.in);
        String typeOfGuest = null;
        String choiceTypeOfGuest;
        boolean isOk = true;
        do {
            System.out.println("Chọn loại khách hàng");
            choiceTypeOfGuest = scanner.nextLine();
            switch (choiceTypeOfGuest) {
                case "1":
                    typeOfGuest = "Member";
                    isOk = false;
                    break;
                case "2":
                    typeOfGuest = "Silver";
                    isOk = false;
                    break;
                case "3":
                    typeOfGuest = "Gold";
                    isOk = false;
                    break;
                case "4":
                    typeOfGuest = "Platinum";
                    isOk = false;
                    break;
                case "5":
                    typeOfGuest = "Diamond";
                    isOk = false;
                    break;
            }
        } while (isOk);
        return typeOfGuest;
    }
    public static void changeTypeOfGuest(int i){
        List<Customer> customerList = ReadAndWriteForCustomer.readFile();
        Scanner scanner = new Scanner(System.in);
        String choiceTypeOfGuest;
        boolean isOk=true;
        do {
            System.out.println(" Mời chọn loại khách hàng " +
                    "\n 1. Member" +
                    "\n 2. Silver" +
                    "\n 3. Gold" +
                    "\n 4. Platinum" +
                    "\n 5. Diamond");
            choiceTypeOfGuest = scanner.nextLine();
            switch (choiceTypeOfGuest) {
                case "1":
                    customerList.get(i).setTypeOfGuest("Member");
                    isOk = false;
                    break;
                case "2":
                    customerList.get(i).setTypeOfGuest("Silver");
                    isOk = false;
                    break;
                case "3":
                    customerList.get(i).setTypeOfGuest("Gold");
                    isOk = false;
                    break;
                case "4":
                    customerList.get(i).setTypeOfGuest("Platinum");
                    isOk = false;
                    break;
                case "5":
                    customerList.get(i).setTypeOfGuest("Diamond");
                    isOk = false;
                    break;
            }
        } while (isOk);

        ReadAndWriteForCustomer.writeFile(customerList,false);

    }

}
