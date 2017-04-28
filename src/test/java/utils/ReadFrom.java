package utils;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;



public class ReadFrom {
    static ArrayList <String> result = new ArrayList<>();
    static Random random = new Random();

    public String someProduct() throws FileNotFoundException {
        File file = new File("Resources.txt");
        Scanner scanner = new Scanner(file);
        while (scanner.hasNextLine()){result.add(scanner.nextLine());}
        int x = result.size();
        return result.get(random.nextInt(x));
    }

}
