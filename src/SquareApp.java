import java.util.Scanner;

public class SquareApp {

   public SquareApp() {
        Scanner scanner = new Scanner(System.in); // Küsimise "objekt"
        System.out.print("Enter square side: "); // Väljasta tekst
        double side = scanner.nextDouble(); // Ootab kasutajalt sisestust

       Square square = new Square(side); // Tee ruudu objekt
       System.out.println( "Square perimeter is: " + square.getPerimeter()); // Väljasta pindala
       System.out.println( "Square area is: " + square.getArea());  // Ruudu ümbermõõt
       System.out.println( "Square diagonal is: " + square.getDiagonal()); // Ruudu diagonaal
   }


   public static void main(String[] args) {
        new SquareApp();
    }
}
