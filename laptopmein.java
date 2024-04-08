import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;

public class laptopmein {
    public static void main(String[] args) {
        Laptop laptop1 = new Laptop("Игровой ноутбук Lenovo LOQ", 16, 512,"Window" ,"blaсk");
        Laptop laptop2 = new Laptop("Apple", 8, 256, "MacOS", "gray");
        Laptop laptop3 = new Laptop("Игровой ноутбук MSI Thin GF63", 16, 1024, "Window", "white");
        Laptop laptop4 = new Laptop("Игровой ноутбук Asus ROG Zephyrus G15", 8, 1024, "Window", "blue");   
    
    
        // System.out.println(laptop1);
        // System.out.println(laptop2);
        // System.out.println(laptop3);
        // System.out.println(laptop4);
    
        HashSet<Laptop> laptops = new HashSet<>(Arrays.asList(laptop1,laptop2,laptop3,laptop4));
        for (Laptop laptop:laptops){
            System.out.println(laptop);
        }
    Map<String, Object> filters = new HashMap<>();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Выберите критерии для фильтрации:");
        System.out.println("1 - ОЗУ");
        System.out.println("2 - Объем ЖД");
        System.out.println("3 - Операционная система");
        System.out.println("4 - Цвет");
        System.out.println("5 - Посмотреть все");
        System.out.println("0 - Завершить выбор");

        int choice;
        while (true) {
            choice = scanner.nextInt();
            if (choice == 0) {
                break;
            }
            switch (choice) {
                case 1:
                    System.out.println("Выберите оз:");
                    System.out.println("1 - 8");
                    System.out.println("2 - 16");
                    choice = scanner.nextInt();
                        if(choice == 1){
                            System.out.println(laptop2);
                            System.out.println(laptop4);
                                break;
                            }
                        if(choice == 2){
                            System.out.println(laptop1);
                            System.out.println(laptop3);
                                break;
                        }      
                
                case 2:
                    System.out.println("десткий диск:");
                    System.out.println("1 - 512");
                    System.out.println("2 - 256");
                    System.out.println("3 - 1024");
                    choice = scanner.nextInt();
                        if(choice == 1){
                            System.out.println(laptop1);
                                break;
                                }
                        if(choice == 2){
                            System.out.println(laptop2);
                                break;
                            } 
                        if(choice == 3){
                            System.out.println(laptop3);
                            System.out.println(laptop4);
                                break;
                                } 
                case 3:
                System.out.println("Выберите операционую систему:");
                System.out.println("1 - Window");
                System.out.println("2 - MacOS");
                choice = scanner.nextInt();
                    if(choice == 1){
                        System.out.println(laptop1);
                        System.out.println(laptop3);
                        System.out.println(laptop4);
                            break;
                    }
                    if(choice == 2){
                        System.out.println(laptop2);
                            break;
                    }
                case 4:
                System.out.println("Выберите цвет:");
                System.out.println("1 - черный");
                System.out.println("2 - серый ");
                System.out.println("3 - белый ");
                System.out.println("4 - голубой ");
                choice = scanner.nextInt();
                    if(choice == 1){
                        System.out.println(laptop1);
                            break;
                    }
                    if(choice == 2){
                        System.out.println(laptop2);
                            break;
                    }
                    if(choice == 3){
                        System.out.println(laptop3);
                            break;
                    }
                    if(choice == 4){
                        System.out.println(laptop4);
                            break;
                    }
                }
            }
        }
            
}    

