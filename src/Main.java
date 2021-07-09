import java.io.*;
import java.util.Scanner;

//task2:
//        args[0] = ".*connected.*"
//        args[1] = "D:\\IT\\IPR\\Java\\logs\\main.log.2014-11-17-separated-"
//        args[2] = "D:\\IT\\IPR\\Java\\logs_parsed\\main.log.2014-11-17-parsed-"

public class Main {

    public static void main(String[] args) throws IOException {

        String regex = args[0];
        for (int i = 1; i < 6; i++) {
            File log = new File(args[1] + i);
            FileWriter writer = new FileWriter(args[2] + i);
            Scanner scan = new Scanner(new FileReader(log));

            while (scan.hasNextLine()) {
                String line = scan.nextLine();
                if (line.matches(regex)) {
                    writer.write(line + "\n");
                }
            }
            writer.close();
        }
    }
}


