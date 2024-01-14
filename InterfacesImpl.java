public class InterfacesImpl implements Interfaces{
    @Override
    public double suma(double a, double b) {
        return a+b;
    }

    @Override
    public double resta(double a, double b) {
        return a-b;
    }

    @Override
    public double multiplicacion(double a, double b) {
        return a*b;
    }

    @Override
    public double division(double a, double b) {
        if(b==0){
            return 0;
        } else {
            return a / b;
        }
    }
}
