package treino05;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Ex5 {

    static ArrayList<Utilizador> alunos = new ArrayList<>();
    static ArrayList<Livro> livros = new ArrayList<>();
    static HashMap<Integer, ArrayList<Livro>> livrosAluno = new HashMap<>();
    static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {
        int opt;
        do{
            menu();
            opt = sc.nextInt();

            switch(opt){

                case 1:
                    registar();
                    break;
                case 2:
                    System.out.print("Nome do aluno: ");
                    String nome = sc.next();
                    System.out.print("Numero mecanografico: ");
                    int nMec = sc.nextInt();
                    System.out.print("Curso: ");
                    String curso = sc.next();
                    remover(new Utilizador(nome, nMec, curso));
                    break;
                case 3:
                    imprimirUsers();
                    break;
                case 4:
                    addLivro();
                    break;
                case 5:
                    imprimirLivros();
                    break;
                case 6:
                    emprestar();
                    break;
                case 7:
                    devolver();
                    break;
                case 8:
                    System.out.println("Programa encerrado");
                    break;
                default:
                    System.out.println("Método não implementado");
                    break;
            }
        }while(opt != 8);
        sc.close();
    }

    public static void menu(){
        System.out.print("Opções da biblioteca:\n" +
         "1 - inscrever utilizador\n" +
         "2 - remover utilizador\n" +
         "3 - imprimir lista de utilizadores\n" + 
         "4 - registar um novo livro\n" + 
         "5 - imprimir lista de livros\n" +
         "6 - emprestar\n" +
         "7 - devolver\n" +
         "8 - sair\n"
         );
    }

    public static void registar(){
        String nome;
        int nMec;
        String curso;

        System.out.print("Nome do aluno: ");
        nome = sc.next();
        System.out.print("Numero mecanografico: ");
        nMec = sc.nextInt();
        System.out.print("Curso: ");
        curso = sc.next();
        
        alunos.add(new Utilizador(nome, nMec, curso));
        System.out.println("Aluno adicionado com sucesso");
    }

    public static void remover(Utilizador n){
        for(Utilizador u : alunos){
            if(n.equals(u)){
                alunos.remove(u);
                System.out.println("Utilizador removido com sucesso");
                break;
            }else{
                System.out.println("Utilizador não encontrado");
            }
        }
    }

    public static void imprimirUsers(){
        for(Utilizador u : alunos){
            System.out.println(u.toString());
        }
    }

    public static void addLivro(){
        String titulo;
        String emp;

        System.out.print("Titulo: ");
        titulo = sc.next();
        do{
            System.out.print("Tipo do emprestimo ((c)ondicional ou (n)ormal)? ");
            emp = sc.next();
        }while(!(emp.equals("c")) && !(emp.equals("n")));
        if(emp.equals("c")){
            emp = "CONDICIONAL";
        }else{
            emp = "NORMAL";
        }   

        livros.add(new Livro(titulo, emp));
        System.out.println("Livro adicionado com sucesso");
    }

    public static void imprimirLivros(){
        for(Livro l : livros){
            System.out.println(l.toString());
        }
    }

    public static void emprestar(){
        // verificar se o utilizar esta registado, so ai pode emprestar um livro
        // cada utilizador so pode ter tres livros
        // livro tem de estar na lista de livros e nao pode ser condicional senao nao pode ser requisitado
        // remover o livro do vatalogo de livros disponiveis
        System.out.print("Numero mecanografico do utilizador? ");
        int nMec = sc.nextInt();
        boolean found = false;

        for(Utilizador u: alunos){
            if(u.getnMec() == nMec){
                System.out.println("Utilizador encontrado");
                found = true;
                break;
            }
        }
        if(found == false){
            System.out.println("Utilizador não encontrado por favor escolha um número válido");
        }else{
            // fazer as cenas dos livros aqui
            if(livrosAluno.containsKey(nMec)){
                if(livrosAluno.get(nMec).size() == 3){
                    System.out.println("Já possui 3 livros, não pode reservar mais");
                }else{
                    System.out.print("Qual é o ID do livro? ");
                    int id = sc.nextInt();
                    for(Livro l: livros){
                        if(l.getId() == id){
                            System.out.println("Livro encontrado");
                            if(l.getTipoEmprestimo().equals("CONDICIONAL")){
                                System.out.println("Livro não pode ser requisitado");
                                break;
                            }else{
                                livrosAluno.get(nMec).add(l);
                                System.out.println("Livro adicionado");
                                livros.remove(l);
                                break;
                            }
                        }
                    }
                }

            }else{
                System.out.print("Qual é o ID do livro? ");
                int id = sc.nextInt();
                found = false;

                for(Livro l: livros){
                    if(l.getId() == id){
                        System.out.println("Livro encontrado");
                        found = true;
                        if(l.getTipoEmprestimo().equals("CONDICIONAL")){
                            System.out.println("Livro não pode ser requisitado");
                            break;
                        }else{
                            livrosAluno.put(nMec, new ArrayList<>());
                            livrosAluno.get(nMec).add(l);
                            System.out.println("Livro adicionado");
                            livros.remove(l);
                            break;
                        }
                    }
                }
                if(found == false){
                    System.out.println("Livro não encontrado\n");
                }
            }
        }
    }

    public static void devolver(){
        // perguntar pelo id do user e verificar se possui o livro, so ai o pode devolver
        // remover esse livro do utiizador e devolve lo ao catalogo
        boolean controlo = false;
        System.out.print("Qual é o numero mecanografico? ");
        int nMec = sc.nextInt();
        if(livrosAluno.containsKey(nMec)){
            System.out.print("Qual é o id do livro a devolver? ");
            int id = sc.nextInt();
            for(Livro l : livrosAluno.get(nMec)){
                if(l.getId() == id){
                    System.out.println("A devolver o livro...");
                    livrosAluno.get(nMec).remove(l);
                    System.out.println("Removido com sucesso");
                    livros.add(l);
                    controlo = true;
                    break;
                }
            }
            if(controlo == false){
                System.out.println("Livro não foi encontrado");
            }

        }else{
            System.out.println("Utilizador não encontrado");
        }
    }
}
