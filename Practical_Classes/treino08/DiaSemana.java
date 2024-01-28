package treino08;

public enum DiaSemana {
    Segunda, Terça, Quarta, Quinta, Sexta, Sábado, Domingo;

    public DiaSemana getEnum(int i){
        DiaSemana[] a = DiaSemana.values();
        return a[i];
    }
    
}
