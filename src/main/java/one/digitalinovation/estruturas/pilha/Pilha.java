package one.digitalinovation.estruturas.pilha;

public class Pilha {
    private No refNoEntradaPilha;

    public Pilha() {
        this.refNoEntradaPilha = null;
    }

    public void push(No novoNo) {
        No refAux = refNoEntradaPilha;
        refNoEntradaPilha = novoNo;
        refNoEntradaPilha.setRefNo(refAux);
    }

    public No pop() {
        if(!isEmpty()){
            No noPoped = refNoEntradaPilha;
            refNoEntradaPilha = refNoEntradaPilha.getRefNo();

        }
        return null;
    }

    public No top(){
        return refNoEntradaPilha;
    }

    public boolean isEmpty() {
        return this.refNoEntradaPilha == null;
    }

    @Override
    public String toString() {
        String stringRetorno = "-----------------\n";
        stringRetorno += " Pilha\n";
        stringRetorno += "-----------------\n";

        No noRefAux = refNoEntradaPilha;

        while(noRefAux != null){
            stringRetorno += "[No{dado=" + noRefAux.getDado() +"}]\n";
            noRefAux = noRefAux.getRefNo();
        }
        stringRetorno += "=================\n";
        return stringRetorno;
    }
}
