package treino05;

public class Utilizador {
    private String nome;
    private int nMec;
    private String curso;

    public Utilizador(String nome, int nMec, String curso){
        this.nome = nome;
        this.nMec = nMec;
        this.curso = curso;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    public void setnMec(int nMec){
        this.nMec = nMec;
    }
    public void setCurso(String curso){
        this.curso = curso;
    }

    public String getNome(){
        return nome;
    }
    public int getnMec(){
        return nMec;
    }
    public String getCurso(){
        return curso;
    }


    @Override
    public String toString(){
        return "Aluno: " + nome + "; " + nMec + "; " + curso;
    }
    
    @Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((curso == null) ? 0 : curso.hashCode());
		result = prime * result + nMec;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		return result;
	}

    @Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Utilizador other = (Utilizador) obj;
		if (curso == null) {
			if (other.curso != null)
				return false;
		} else if (!curso.equals(other.curso))
			return false;
		if (nMec != other.nMec)
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}

}
