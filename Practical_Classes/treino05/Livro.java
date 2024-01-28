package treino05;

public class Livro {
    private int id;
    private static int count = 100;
    private String titulo;
    private String tipoEmprestimo;

    public Livro(String titulo, String tipoEmprestimo){
        this.titulo = titulo;
        this.tipoEmprestimo = tipoEmprestimo;
        this.setId(count);
    }
    public Livro(String titulo){
        this.titulo = titulo;
        this.setId(count);
    }

    public void setId(int id){
        this.id = count++;
    }
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    public void setTipoEmprestimo(String tipoEmprestimo){
        this.tipoEmprestimo = tipoEmprestimo;
    }

    public int getId(){
        return id;
    }
    public String getTitulo(){
        return titulo;
    }
    public String getTipoEmprestimo(){
        return tipoEmprestimo;
    }

    @Override
    public String toString(){
        return "Livro " + id + "; " + titulo + "; " + tipoEmprestimo;
    }
}
