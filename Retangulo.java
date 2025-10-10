public class Retangulo extends Ponto{
    private float b,h;
    public Retangulo(int x,int y,float b, float h){
        super(x,y); // Construtor da superclasse Local.
        this.b=b; this.h=h;
        area=b*h; // area redefinida para circulo.
        per=2*(b+h);
    }

    @Override
    public void hide(){
        visible=false;
        System.out.print("Retangulo de lados "+b+" e "+h+" visivel em  ");showLoc();
        System.out.println(". ");
    }

    @Override
    public void show(){
        visible=true;
        System.out.print("Retangulo de lados "+b+" e "+h+" invisivel em  ");showLoc();
        System.out.println(". ");
    }

    @Override
    public double getArea(){return area;}
    @Override
    public double getPer(){return per;}
}