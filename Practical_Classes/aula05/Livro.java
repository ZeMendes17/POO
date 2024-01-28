package aula05;

public class Livro {
	private int id;
	private String titulo;
	private String tipoEmprestimo;
	private String disp;			//Disponibilidade do livro, pode ser "DISPONIVÉL" ou "EMPRESTADO"
	private static int contador = 100;
	
	public Livro(String titulo) {
		this.titulo = titulo; this.tipoEmprestimo = "NORMAL"; this.id = contador++; this.disp = "DISPONIVÉL";
	}
	public Livro(String titulo, String tipoEmprestimo) {
		this.titulo = titulo; this.tipoEmprestimo = tipoEmprestimo; this.id = contador++; this.disp = "DISPONIVÉL";
	}
	
	//getters e setters
	
	public int getId() {
		return id;
	}
	public String getTitulo() {
		return titulo;
	}
	public String getTipoEmprestimo() {
		return tipoEmprestimo;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public void setTipoEmprestimo(String tipoEmprestimo) {
		this.tipoEmprestimo = tipoEmprestimo;
	}
	public String getDisp() {
		return disp;
	}
	public void setDisp(String disp) {
		this.disp = disp;
	}
	
	//Overrides
	
	@Override
	public String toString() {
		return "Livro " + id + "; " + titulo + "; " + tipoEmprestimo + "; " + disp;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((tipoEmprestimo == null) ? 0 : tipoEmprestimo.hashCode());
		result = prime * result + ((titulo == null) ? 0 : titulo.hashCode());
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
		Livro other = (Livro) obj;
		if (id != other.id)
			return false;
		if (tipoEmprestimo == null) {
			if (other.tipoEmprestimo != null)
				return false;
		} else if (!tipoEmprestimo.equals(other.tipoEmprestimo))
			return false;
		if (titulo == null) {
			if (other.titulo != null)
				return false;
		} else if (!titulo.equals(other.titulo))
			return false;
		return true;
	}

} 

