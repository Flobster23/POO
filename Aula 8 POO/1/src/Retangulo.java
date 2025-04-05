public class Retangulo extends TwoDShape {
    public boolean isSquare() {
        if (getLargura() == getAltura()) {
            return true;
        }
        else {
            return false;
        }
    }
    public double areaRetangulo() {
        return getLargura() * getAltura();
    }
}
