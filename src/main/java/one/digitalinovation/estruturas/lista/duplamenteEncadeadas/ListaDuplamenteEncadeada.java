package one.digitalinovation.estruturas.lista.duplamenteEncadeadas;

public class ListaDuplamenteEncadeada<T> {
    private NoDuplo<T> primeiroNo;
    private NoDuplo<T> ultimoNo;
    private int tamnanhoLista;

    public ListaDuplamenteEncadeada() {
        this.primeiroNo = null;
        this.ultimoNo = null;
        this.tamnanhoLista = 0;
    }

    private int size(){
        return this.tamnanhoLista;
    }

    private NoDuplo<T> getNo(int index) {
        NoDuplo<T> auxNo = this.primeiroNo;
        for (int i = 0; (i < index) && (auxNo != null); i++) {
            auxNo = auxNo.getNoProximo();
        }
        return auxNo;
    }

    public  T get(int index) {
        return this.getNo(index).getConteudo();
    }

    public void add(T elemento) {
        NoDuplo<T> novoNo = new NoDuplo<>(elemento);
        novoNo.setNoProximo(null);
        novoNo.setNoPrevio(ultimoNo);
        if(primeiroNo == null) {
            primeiroNo = novoNo;
        } else if (ultimoNo != null) {
            ultimoNo.setNoProximo(novoNo);
        }
        ultimoNo = novoNo;
        tamnanhoLista++;
    }

    public void add(int index, T elemento) {
        NoDuplo<T> auxNo = getNo(index);
        NoDuplo<T> novoNo = new NoDuplo<>(elemento);
        novoNo.setNoProximo(auxNo);

        if(novoNo.getNoProximo() != null) {
            novoNo.setNoPrevio(auxNo.getNoPrevio());
            novoNo.getNoProximo().setNoPrevio(novoNo);
        }else{
            novoNo.setNoPrevio(ultimoNo);
            ultimoNo = novoNo;
        }
        if(index == 0) {
            primeiroNo = novoNo;
        } else{
            novoNo.getNoPrevio().setNoProximo(novoNo);
        }
        tamnanhoLista++;
    }

    public void remove(int index) {
        if(index == 0) {
            primeiroNo = primeiroNo.getNoPrevio();
            if(primeiroNo != null) {
                primeiroNo.setNoPrevio(null);
            }
        } else{
            NoDuplo<T> auxNo = getNo(index);
            auxNo.getNoPrevio().setNoProximo(auxNo.getNoProximo());
            if (auxNo != ultimoNo) {
                auxNo.getNoProximo().setNoPrevio(auxNo.getNoPrevio());
            }else {
                ultimoNo = auxNo;
            }
        }
        this.tamnanhoLista--;
    }

    @Override
    public String toString() {
        String strRetorno = "";
        NoDuplo<T> auxNo = primeiroNo;

        for (int i = 0; (i < size()); i++) {
            strRetorno += "[No{conteudo=" + auxNo.getConteudo() + "}] ---> ";
            auxNo = auxNo.getNoProximo();
        }
        strRetorno += null;
        return strRetorno;
    }
}
