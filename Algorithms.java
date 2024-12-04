import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;

public class Algorithms {
    private static File f;
    private static Scanner s;
    public static void main(String[] args) throws FileNotFoundException {
        f = new File("Numbers.txt");
        int odds = odds();
        int evens = evens();
        int twoDigits=twoDigits();
        int greaterThan500=greaterThan500();
        int greatestnum=greatestnum();
        int smallestnum=smallestnum();
        int sum=sum();
        double mean=mean();
        System.out.println(odds);
        System.out.println(evens);
        System.out.println(twoDigits); // check why s.nextInt() has to be replaced with n
        System.out.println(greaterThan500);
        System.out.println(greatestnum);
        System.out.println(smallestnum);
        System.out.println(sum);
        System.out.println(mean);

        s.close();

    }

    public static int odds() throws FileNotFoundException{
        s = new Scanner(f);
        int odds = 0;
        while (s.hasNext()) {
            if (s.nextInt() % 2 != 0)
                odds++;
        }
        return odds;
    }

    public static int evens() throws FileNotFoundException{
        s = new Scanner(f);
        int evens = 0;
        while (s.hasNext()) {
            if (s.nextInt() % 2 == 0)
                evens++;
        }
        return evens;
    }

    public static int twoDigits() throws FileNotFoundException{
        s = new Scanner(f);
        int twoDigits = 0;

        while (s.hasNext()) {
            int n = s.nextInt();
            if ( n>=10 && n <=99)
                twoDigits++;
        }
        return twoDigits;
    }

    public static int greaterThan500() throws FileNotFoundException{
        s = new Scanner(f);
        int greaterThan500 = 0;

        while (s.hasNext()) {
            int n = s.nextInt();
            if ( n>500 )
                greaterThan500++;
        }
        return greaterThan500;


    }

    public static int totalsum() throws FileNotFoundException{
        s = new Scanner(f);
        int totalsum = 0;

        while (s.hasNext()) {
            int n = s.nextInt();
            totalsum+=n;
        }
        return totalsum;
    }


    public static int greatestnum() throws FileNotFoundException{
        s = new Scanner(f);
        int greatestnum=0;

        while (s.hasNext()){
            if (greatestnum<s.nextInt())
            {
          
                greatestnum=s.nextInt();
            }
        }
        return greatestnum;
    }

    public static int smallestnum() throws FileNotFoundException{
        s = new Scanner(f);
        int smallestnum=0;

        while (s.hasNext()){
            if (smallestnum>s.nextInt())
            {

                smallestnum=s.nextInt();
            }
        }
        return smallestnum;
    }

    public static int sum() throws FileNotFoundException{
        s = new Scanner(f);
        int sum=0;

        while (s.hasNext()){
            sum+=s.nextInt();
        }
        return sum;

    }

    public static double mean() throws FileNotFoundException {
        s = new Scanner(f);
        double sum = 0;
        double numofterms=0;

        while (s.hasNext()) {
            sum += s.nextInt();
            numofterms+=1;
        }
        return ((sum)/numofterms);


    }

    public static double mode() throws FileNotFoundException {
        s = new Scanner(f);
        return 0;
    }
}