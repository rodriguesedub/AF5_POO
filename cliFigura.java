public class cliFigura{
    public static void main(String[] args) {
        Ponto P=new Ponto(2,3);
        Circulo C=new Circulo(5,-1,2);
        P.show();
        C.show();
        C.hide();
        P.moveto(6,7);
        C.moveto(12,17);
        System.out.format("Area do ponto..: %.3f.\n",P.getArea());
        System.out.format("Area do circulo: %.3f.",C.getArea());
    }
}