package treino08;

import java.util.List;
import java.util.ArrayList;

public class Empresa {
    private String nome;
    private String codigoPostal;
    private String email;
    private List<Automovel> veiculos = new ArrayList<>();

    public Empresa(String nome, String codigoPostal, String email){
        this.nome = nome;
        if(validarEmail(email)){
            this.email = email;
        } else{
            System.out.println("Email não valido por favor introduza um valido");
            email = null;
        }
        if(validarCP(codigoPostal)){
            this.codigoPostal = codigoPostal;
        } else{
            System.out.println("Codigo Postal não valido por favor introduza um valido");
            codigoPostal = null;
        }

    }

    public String getNome(){
        return nome;
    }
    public String getCp(){
        return codigoPostal;
    }
    public String getEmail(){
        return email;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void addVeiculo(Automovel veiculo) {
        this.veiculos.add(veiculo);
    }


    private boolean validarEmail(String email){
        if(!email.matches(".+@[A-z]\\W[A-z]+")){
            return false;
        }
        return true;
    }

    private boolean validarCP(String cp) {
		if(!cp.matches("\\d{4}\\W\\d{3}")) {
			System.out.printf("ERRO NA OPERAÇÃO! O código postal introduzido (%S) é inválido, pelo este não foi definido! Defina um novo através do método setCp(), devendo de introduzir como parâmetro o código postal sob a forma de uma String.\n", cp);
			return false;
		}
		return true;
	}

    public Automovel getVeiculo(String matricula) {
        for(Automovel veiculo : veiculos) {
            if(veiculo.getMatricula().equals(matricula)){
                return veiculo;
            }
        }

        return null;
    }

    public Automovel maisKm(){
        Automovel a = null;
        int maiorDistancia = 0;
        for(Automovel auto : veiculos){
            if(auto.distanciaTotal() > maiorDistancia)
                a = auto;
                maiorDistancia = auto.distanciaTotal();
        }

        return a;
    }
    
}
