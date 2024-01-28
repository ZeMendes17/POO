package aula06;

public class Conjunto {
    private int[] vetor;

    // Construtores
    public Conjunto() {
        this.vetor = new int[0];

    }

    // getters e setters

    public int[] getVetor() {
        return vetor;
    }

    public void setVetor(int[] vetor) {
        this.vetor = vetor;
    }


    // metodos 

    public boolean contains(int n) {
        for(int i = 0; i < vetor.length; i++) {
            if(n == vetor[i]) {return true;}
            
            
        }
        return false;
    }

    public void insert(int n) {
        if(this.contains(n)) {return;}
        int new_length = vetor.length + 1;
        int[] new_vetor = new int[new_length];

        for(int j = 0; j < vetor.length; j++){
            new_vetor[j] = vetor[j];
        }

        new_vetor[new_length - 1] = n;

        vetor = new_vetor;
    }

    public void remove(int n) {
        if(!this.contains(n)) {return;}
        int new_length = vetor.length - 1;		//nova length do conjunto
		int[] new_vetor = new int[new_length];
        boolean removido = false;

        for(int i = 0; i < vetor.length; i++) {
            if(vetor[i] == n) {
                removido = true;
                continue;
            }
            if(!removido) {
                new_vetor[i] = vetor[i];
            } else {
                new_vetor[i - 1] = vetor[i];
            }
        }
        vetor = new_vetor;
    }

    public void empty() {
        vetor = new int[0];
    }

    @Override
    public String toString() {
        String s = "";
		for(int n : vetor) {
			s += n + " ";
        }

        return  s;
    }

    public int size() {
        return vetor.length;
    }

    public Conjunto combine(Conjunto add) {
		Conjunto nconjunto = new Conjunto();
		nconjunto = this;
		
		for(int i = 0; i < add.size(); i++) {
			int n = add.getVetor()[i];
			if(!nconjunto.contains(n)) {
				nconjunto.insert(n);
			}
		}
		return nconjunto;
	}

    public Conjunto subtract(Conjunto dif) {
		Conjunto nconjunto = new Conjunto();
		nconjunto = this;	
		
		for(int i = 0; i < dif.size(); i++) {
			int n = dif.getVetor()[i];
			if(nconjunto.contains(n)) {
				nconjunto.remove(n);
			}
		}
		return nconjunto;
	}
	
	public Conjunto intersect(Conjunto inter) {
		Conjunto nconjunto = new Conjunto();	
		
		for(int i = 0; i < inter.size(); i++) {
			int n = inter.getVetor()[i];
			if(this.contains(n)) {
				nconjunto.insert(n);
			}
		}
		return nconjunto;
	}
}
