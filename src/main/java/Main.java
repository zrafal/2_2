// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;

import java.util.Scanner;
public class Main {
  public static void main (String[] args) {
Scanner scanner=new Scanner(System.in);
System.out.println("Prosze wprowadzic pierwsza liczbe:");
int a=scanner.nextInt();
System.out.println("Prosze wprowadzic druga liczbe:");
int b=scanner.nextInt();
System.out.println("Prosze wprowadzic trzecialiczbe:");
int c=scanner.nextInt();
int Max=Math.max(a,Math.max(b,c));
System.out.println("Najwieksza liczba to:"+Max);
scanner.close();
}
  // @Test
  // void addition() {
  //     assertEquals(2, 1 + 1);
  // }
}