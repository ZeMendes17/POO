package treino11;

public class Tempo {
    private int minutos;

    public Tempo(int minutos){
        this.minutos = minutos;
    }

    public Tempo(String s){
        this.minutos = (Integer.parseInt(s.split(":")[0]) * 60) + Integer.parseInt(s.split(":")[1]);
    }

    public int getMinutos(){
        return minutos;
    }

    @Override
    public String toString(){
        String h = String.valueOf(minutos / 60);
        String m = String.valueOf(minutos % 60);

        if(Integer.parseInt(h) < 10){
            h = "0" + h;
        }
        if(Integer.parseInt(m) < 10){
            m = m + "0";
        }

        return h + ":" + m;
    }

    public Tempo add(Tempo t){
        return new Tempo(this.minutos + t.minutos);
    }
}
