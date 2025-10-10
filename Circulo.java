public class Circulo extends Ponto{
    private float r;
    public Circulo(int x,int y,float r){
        super(x,y); // Construtor da superclasse Local.
        this.r=r;
        area=Math.PI*r*r; // area redefinida para circulo.
        per= 2*Math.PI*r;
    }

    @Override
    public void hide(){
        visible=false;
        System.out.print("Circulo de raio "+r+" invisivel em ");showLoc();
        System.out.println(". ");
    }

    @Override
    public void show(){
        visible=true;
        System.out.print("Circulo de raio "+r+" visivel em ");showLoc();
        System.out.println(". ");
    }

    @Override
    public double getArea(){return area;}
    @Override
    public double getPer(){return per;}
}