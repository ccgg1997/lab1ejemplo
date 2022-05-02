package univalle;

public class Pronostico {

    private float base;

    public Pronostico() {
        this.base = 522 ;
    }

    public Pronostico(float base) {
        this.base = base*25;
    }

    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
        base= 100;
    }

    


}
