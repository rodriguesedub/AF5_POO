public class cliFigura{
    public static void main(String[] args) {
        Circulo C=new Circulo(5,-1,3);        
        Retangulo R=new Retangulo(1, 2, 2, 3);
        Hexagono H=new Hexagono(-1, 3, 5);
        Pentagono P=new Pentagono(5, 3, 5);
        C.show();
        H.show();
        P.show();

        System.out.format("Per. do circulo: %.3f.\n",C.getPer());
        System.out.format("Area do circulo: %.3f.\n\n",C.getArea());

        System.out.format("Per. do retangulo: %.3f\n.",R.getPer());
        System.out.format("Area do retangulo: %.3f.\n\n",R.getArea());

        System.out.format("Per. do hexagono: %.3f\n.",H.getPer());
        System.out.format("Area do hexagono: %.3f.\n\n",H.getArea());

        System.out.format("Per. do pentagono: %.3f\n.",P.getPer());
        System.out.format("Area do pentagono: %.3f.\n",P.getArea());
    }
}