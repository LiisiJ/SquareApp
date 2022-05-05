public class Square {

    private double side;  // Ruudu külg

    public Square(double side) {
        this.side = side;
    }

    public double getPerimeter() { // ruudu ümbermõõt
        return 4 * side;
    } // Ruudu ümbermõõt

    public double getArea() {  // ruudu pindala
        return side * side;
    } // Ruudu pindala

    public double getDiagonal() { return side = Math.sqrt(2) * side;} // Ruudu diagonaal

    }
