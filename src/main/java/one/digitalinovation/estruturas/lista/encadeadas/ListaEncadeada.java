package one.digitalinovation.estruturas.lista.encadeadas;

public class ListaEncadeada<T> {
    No<T> referenciaEncadeada;

    public ListaEncadeada() {
        this.referenciaEncadeada = null;
    }

    public boolean isEmpty() {
        return this.referenciaEncadeada == null ? true : false;
    }

    public int size() {
        int tamanhoLista = 0;
        No<T> referenciaAux = this.referenciaEncadeada;
        while (true) {
            if(referenciaAux != null){
                tamanhoLista++;
                if(referenciaAux.getProximoNo() != null){
                    referenciaAux = referenciaAux.getProximoNo();
                }else{
                    break;
                }
            }else{
                break;
            }
        }
        return tamanhoLista;
    }

    public void add(T conteudo) {
        No<T> novoNo = new No<>(conteudo);
        if(this.isEmpty()){
            this.referenciaEncadeada = novoNo;
            return;
        }
        No<T> noAuxiliar = this.referenciaEncadeada;
        for (int i = 0; i < this.size()-1; i++){
            noAuxiliar = noAuxiliar.getProximoNo();
        }
        noAuxiliar.setProximoNo(novoNo);

    }

    private void validationIndex(int index) {
        if(index >= size()){
            int ultimoIndex = this.size() - 1;
            throw new IndexOutOfBoundsException("Não existe nenhum conteudo com o index: " + index + ", nesta lista: " + ultimoIndex + ".");
        }
    }

    public No<T> getNo(int index) {
        validationIndex(index);
        No<T> noAuxiliar = this.referenciaEncadeada;
        No<T> noRetorno = null;
        for (int i = 0; i <= index; i++){
            noRetorno = noAuxiliar;
            noAuxiliar = noAuxiliar.getProximoNo();

        }
        return noRetorno;
    }

    public T get(int index) {
        return getNo(index).getConteudo();
    }

    public T remove(int index) {
        No<T> noPivor = this.getNo(index);
        if(index == 0){
         this.referenciaEncadeada = noPivor.getProximoNo();
         return noPivor.getConteudo();
        }
        No<T> noAnterior = getNo(index -1);
        noAnterior.setProximoNo(noPivor.getProximoNo());
        return noPivor.getConteudo();
    }

    @Override
    public String toString() {
        String strRetorno = "";
        No<T> noAuxiliar = this.referenciaEncadeada;
        for (int i = 0; i < this.size(); i++){
            strRetorno += "No{conteudo=" + noAuxiliar.getConteudo() + "} ---> ";
            noAuxiliar = noAuxiliar.getProximoNo();
        }
        strRetorno += "null";

        return strRetorno;
    }
}
