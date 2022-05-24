public class main 
{
    public static void main(String args[])
    {
        TrianguloRectangulo  TR = new TrianguloRectangulo(5,15);

        System.out.println("Area del triangulo = " + TR.calcularArea());
        System.out.println("Perimetro del triangulo = " + TR.calcularPerimetro());
        TR.determinarTipoTriangulo();

    }   
}