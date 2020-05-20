package lesson2.task1112;

import java.io.*;
import java.util.*;

public class Main {
    void solve(Scanner in, PrintWriter out) {
        int a = in.nextInt();
        out.println(a / 100 + a % 100 / 10 + a % 100 % 10);
    }

    void run() {
        try (
//                Scanner in = new Scanner(System.in);
//                PrintWriter out = new PrintWriter(System.out)
                Scanner in = new Scanner(new FileReader("INPUT.TXT"));
                PrintWriter out = new PrintWriter(new FileWriter("OUTPUT.TXT"))
        )
        {
            solve(in, out);
        } catch (IOException e) {
            throw new Error(e);
        }
    }

    public static void main(String[] args) {
        new Main().run();
    }
}