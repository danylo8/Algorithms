import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Algorithms {
    private static File f;
    private static Scanner s;
    public static void main(String[] args) throws FileNotFoundException {
        f = new File("Numbers.txt");
        int odds = odds();
        int evens = evens();
        int twoDigits=twoDigits();
        int greaterThan500=greaterThan500();
        int newgreatestnum=greatestnum();
        System.out.println(odds);
        System.out.println(evens);
        System.out.println(twoDigits); // check why s.nextInt() has to be replaced with n
        System.out.println(greaterThan500);
        System.out.println(newgreatestnum);
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
        int greatestnum=0;
        int newgreatestnum=0;
        while (s.hasNext()){
            if (greatestnum<s.nextInt())
            {
          
                newgreatestnum=(s.nextInt());
            }
        }
        return newgreatestnum;
}
}