import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Concatenating {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new  InputStreamReader(System.in));
        String part1,a,b;
        String part2;
        System.out.println("Enter the first string :");
        part1 = br.readLine();
        System.out.println("Enter the Second string :");
        part2 = br.readLine();
        System.out.println(part1.concat(part2));
    }


}
