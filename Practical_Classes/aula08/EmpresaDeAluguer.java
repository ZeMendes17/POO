package aula08;

import java.util.ArrayList;
import java.util.List;

public class EmpresaDeAluguer {
    private String nome;
    private String codigoPostal;
    private String email;
    private List<Veiculo> veiculos = new ArrayList<>();

    public EmpresaDeAluguer(String nome, String codigoPostal, String email) {
        this.nome = nome;
        if(validarEmail(email))
			this.email = email;
		else if(this.email == null)
			this.email = "Email não definido";
		if(validarCP(codigoPostal))
			this.codigoPostal = codigoPostal;
		else if(this.codigoPostal == null)
			this.codigoPostal = "Código Postal não definido";
    }

    public String getNome() {
		return nome;
	}

	public String getCodigoPostal() {
		return codigoPostal;
	}

	public String getEmail() {
		return email;
	}

    public List<Veiculo> getVeiculosList() {
        return veiculos;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setVeiculosList(List<Veiculo> veiculos) {
        this.veiculos = veiculos;
    }

    public void addVeiculo(Veiculo veiculo) {
        this.veiculos.add(veiculo);
    }



    public Veiculo getVeiculo(String matricula) {
        for(Veiculo veiculo : veiculos) {
            if(veiculo.getMatricula().equals(matricula)){
                return veiculo;
            }
        }

        return null;
    }

    private boolean validarEmail(String email) {
		if(!email.matches(".+@[A-z]+\\W[A-z]+")) {
			System.out.printf("ERRO NA OPERAÇÃO! O email introduzido (%S) é inválido, pelo este não foi definido! Defina um novo endereço através do método setEmail(), devendo de introduzir como parâmetro o endereço de email sob a forma de uma String.\n", email);
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

    public Veiculo viaturaComMaisQuilometros() {
		Veiculo viaturaMaisKm=null;
		int maiorDistancia=-1;
		for(Veiculo v: veiculos) {
			if(maiorDistancia < v.distanciaTotal()) {
				viaturaMaisKm = v;
				maiorDistancia = v.distanciaTotal();
			}
		}
		return viaturaMaisKm;
	}
}
