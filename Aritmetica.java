public class Aritmetica {
    public static void main(String[] args) {
        InterfacesImpl op =  new InterfacesImpl();
        int a = 20;
        int b = 5;
        double c = op.division((op.multiplicacion((op.resta(a,b)),(op.resta(b,a)))),(op.multiplicacion((op.suma(a,b)),(op.resta(a,b)))));
        System.out.println(c);
    }
}
