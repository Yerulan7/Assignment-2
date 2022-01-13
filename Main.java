package com.company;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> base = new ArrayList<>();

        Student bob = new Student("Bob", "+77076589135", 24);
        Student john = new Student("John", "87776665544",17);
        Student lucy = new Student("Lucy", "+77777777777", 21);
        base.add(bob);
        base.add(john);
        base.add(lucy);

        Integer cur = 0;
        while(cur < 1){
            System.out.println("Hello! This is phonebook! \n" + "1. To print all\n" + "2. To add\n" + "3. To search\n" + "4. To delete\n" + "5. To quit");
            Integer x = sc.nextInt();
            switch(x){
                case 1:
                    for(int i = 0; i < base.size(); ++i){
                        System.out.println(base.get(i).getAll() + "\n=======================================");
                    }
                    break;
                case 2:
                        System.out.println("Enter name: ");
                        String name = sc.next();
                        System.out.println("Enter phone: ");
                        String phone = sc.next();
                        if(phone.charAt(0) == '+'){
                            if (phone.length() != 12){
                                System.out.println("That's wrong phone number! Try again.");
                                continue;
                            }
                        }
                        if(phone.charAt(0) == '8'){
                            if(phone.length() != 11){
                                System.out.println("That's wrong phone number! Try again.");
                                continue;
                            }
                        }
                        if(phone.charAt(0) != '+' && phone.charAt(0) != '8'){
                            System.out.println("That's wrong phone number! Try again.");
                            continue;
                        }
                        Boolean ph = false;
                        for(int i = 0; i < phone.length(); ++i){
                            if(phone.charAt(i)<'0'||phone.charAt(i)>'9'){
                                if(phone.charAt(i) == '+'){
                                    continue;
                                }
                                else{
                                    ph = true;
                                }
                            }
                        }
                        if(ph == true){
                            System.out.println("That's wrong phone number! Try again.");
                            continue;
                        }
                        System.out.println("Enter age: ");
                        Integer age = sc.nextInt();
                        if(age > 150 || age < 0){
                            System.out.println("That's wrong age! Try again.");
                            continue;
                        }
                        base.add(new Student(name, phone, age));
                        System.out.println("Student has added successfully!");
                        break;
                case 3:
                    System.out.println("Enter the name of who you need: ");
                    String search = sc.next();
                    Boolean find = false;
                    for(int i = 0; i < base.size(); ++i){
                        if(search.equals(base.get(i).getName())){
                            System.out.println(base.get(i).getAll()+ "\n=======================================");
                            find = true;
                        }
                    }
                    if(find == false){
                        System.out.println("There are no matches!");
                    }
                    break;
                case 4:
                    System.out.println("Enter the ID of who you want to delete: ");
                    Integer ID = sc.nextInt();
                    Boolean findID = false;
                    for(int i = 0; i < base.size(); ++i){
                        if(ID == base.get(i).getID()){
                            base.remove(i);
                            findID = true;
                            break;
                        }
                    }
                    if(findID == false){
                        System.out.println("There are no matches!");
                    }
                    else{
                        System.out.println("Student has removed successfully!");
                    }
                    break;
                case 5:
                    cur = 2;
                    break;
                default:
                    System.out.println("That's wrong! Try again.");
                    break;
            }
        }
    }
}
