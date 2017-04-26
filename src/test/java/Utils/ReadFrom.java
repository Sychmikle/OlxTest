package Utils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;



public class ReadFrom {
    static ArrayList <String> result = new ArrayList<>();
    final static Random random = new Random();

    public String someProduct() throws FileNotFoundException {
        File file = new File("Resources.txt");
        Scanner scanner = new Scanner(file);
        while (scanner.hasNextLine()){this.result.add(scanner.nextLine());}
        int x = result.size();
        return result.get(random.nextInt(x));

    }


    /* int i = 0;
        for(i = 0; i< result.size(); i++){
            System.out.println(i+" "+result.get(i));
         }*/

}
