import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.stream.IntStream;

public class main {
  public static void main(String[] args) throws IOException {

    System.out.println("Enter N :");
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(bufferedReader.readLine());
    if(n > 0)
      //Catalan number C(n) = (2n)!/n!( n+1)!
      //the article i used is : "https://ru.wikipedia.org/wiki/Правильная_скобочная_последовательность"
      System.out.println(getFactorial(n*2).divide(getFactorial(n).multiply(getFactorial(n+1))) );

  }

  public static BigInteger getFactorial(int f) {
    if (f < 2) {
      return BigInteger.valueOf(1);
    }
    else {
      return IntStream.rangeClosed(2, f).mapToObj(BigInteger::valueOf).reduce(BigInteger::multiply).get();
    }
  }
}

