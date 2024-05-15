package one.digitalinovation.estruturas.objeto;

public class MeuObjt {
    Integer num;

    public MeuObjt(Integer num) {
        this.num = num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return this.num.toString();
    }


}
