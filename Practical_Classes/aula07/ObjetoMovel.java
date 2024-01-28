package aula07;

public class ObjetoMovel {
    private int x;
    private int y;
    private double distanciaPercorrida;

    public ObjetoMovel(int x, int y, double distanciaPercorrida){
        this.x = x;
        this.y = y;
        this.distanciaPercorrida = distanciaPercorrida;
    }

    public void setX(int x){
        this.x = x;
    }
    public void setY(int y){
        this.y = y;
    }
    public void setDistanciaPercorrida(double distanciaPercorrida){
        this.distanciaPercorrida = distanciaPercorrida;
    }

    public double getX(){
        return x;
    }
    public double getY(){
        return y;
    }
    public double getDistanciaPercorrida(){
        return distanciaPercorrida;
    }

    public void move(int newX, int newY){
        this.distanciaPercorrida += Math.abs(x - newX) + Math.abs(y - newY) ;
        this.x += x;
        this.y += y;
    }

    @Override
    public String toString(){
        return "Objeto Móvel de coordenadas: (" + x + ", " + y + ") e percorre uma distancia de " + distanciaPercorrida;
    }
    @Override
    public int hashCode(){
        final int prime = 31;
        int result = 1;
        long temp;
        result = prime * result + x;
        result = prime * result + y;
        temp = Double.doubleToLongBits(distanciaPercorrida);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public boolean equals(Object obj){
        if(this == obj)
            return true;
        if(obj == null)
            return false;
        if(getClass() != obj.getClass())
            return false;
        ObjetoMovel other = (ObjetoMovel) obj;
        if (x != other.x)
			return false;
        if (y != other.y)
			return false;
        if (Double.doubleToLongBits(distanciaPercorrida) != Double.doubleToLongBits(other.distanciaPercorrida))
			return false;
        return true;
    }
}
