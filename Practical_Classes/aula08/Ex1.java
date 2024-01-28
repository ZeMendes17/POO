package aula08;

public class Ex1 {
    public static void main(String[] args) {
        EmpresaDeAluguer empresa = new EmpresaDeAluguer("empresa", "4820-102", "empresa@gmail.com");
        Motociclo m = new Motociclo("67-FG-67", "Honda", "A30", 250, "desportivo");
        m.trajeto(50000);
        AutomovelLigeiro al = new AutomovelLigeiro("23-DF-45", "Ferrari", "F40", 340, 12, 100);
        al.trajeto(2000);
        PesadoDeMercadorias pm = new PesadoDeMercadorias("45-HJ-89", "Mercedes", "IO3", 100, 10, 2000, 1000);
        pm.trajeto(50);
        PesadoDePassageiros pp = new PesadoDePassageiros("56-CV-78", "Nissan", "FILO90", 90, 13, 1500, 40);
        pp.trajeto(40000);
        Taxi t = new Taxi("12-FF-21", "Seat", "Altea", 120, 10, 2500, "12b");
        t.trajeto(1000000);
        LigeiroEletrico le = new LigeiroEletrico("41-MB-72", "Tesla", "S", 560, 16, 2000, 12);
        le.trajeto(20);
        PesadoPassageirosEletrico ppe = new PesadoPassageirosEletrico("54-BM-12", "BMW", "I8", 560, 6);
        ppe.trajeto(700);

        empresa.addVeiculo(m);
        empresa.addVeiculo(al);
        empresa.addVeiculo(pp);
        empresa.addVeiculo(pm);
        empresa.addVeiculo(t);
        empresa.addVeiculo(le);
        empresa.addVeiculo(ppe);


        System.out.println(m.equals(new Motociclo("67-FG-67", "Honda", "A30", 250, "desportivo"))); // true
        System.out.println(m.equals(new Motociclo("67-FG-d7", "Citroen", "A30", 250, "estrada"))); // false
        System.out.println(pp.equals(new PesadoDePassageiros("56-CV-78", "Nissan", "FIL190", 90, 13, 1500, 40))); // false
        System.out.println(le.equals(new LigeiroEletrico("41-MB-72", "Tesla", "S", 560, 16, 2000, 12))); // true


        EmpresaDeAluguer e2 = new EmpresaDeAluguer("Agência de Fachada", "2345-234", "hello@233.34"); //ERRO email inválido
        System.out.println(e2.getEmail()); //Email n introduzido
		e2.setEmail("asdfg_asdf@sapopt"); //ERRO email inválido
		e2.setEmail("asdfg_asdf@sapo."); //ERRO email inválido
		e2.setEmail("@sapo.pt"); //ERRO email inválido
		e2.setEmail("asdfgsdfg@sapo.pt"); 
		System.out.println(e2.getEmail()); //asdfg_/sdfg@sapo.pt

        for(Veiculo veiculo : empresa.getVeiculosList()) {
            System.out.println(veiculo);
            System.out.println();
        }

        System.out.println(empresa.viaturaComMaisQuilometros()); 
    }
}

