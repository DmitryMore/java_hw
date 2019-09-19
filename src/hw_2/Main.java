package hw_2;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        //String path = "E:\\study\\java_hw\\src\\hw_2\\trades.txt";
        if (args.length == 0) {
            System.err.println("No input file");
            System.exit(1);
        }
        String path = args[0];

        if (!Files.exists(Paths.get(path))) {
            System.err.println("File doesn't exist");
            System.exit(2);
        }

        List<String> lines;
        lines = Files.readAllLines(Paths.get(path));

        Trade[] arrTrade = new Trade[lines.size() / 2];
        for (int i = 0; i < lines.size(); i += 2) {
            arrTrade[i / 2] = createTrade(lines.get(i), Double.valueOf(lines.get(i + 1)));
        }

    }

    public static Trade createTrade(String type, double price) {
        return new Trade(TradeType.valueOf(type), price);
    }
}
