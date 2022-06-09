
package examenOrdinaria.ejercicio3.modelo;

import java.util.Objects;

/**
 *
 * @author Álvaro Saavedra Calero
 */
public class Numeros {
    private Double num1;
    private Double num2;

    public Numeros(Double num1, Double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public Numeros() {
    }

    public Double getNum1() {
        return num1;
    }

    public void setNum1(Double num1) {
        this.num1 = num1;
    }

    public Double getNum2() {
        return num2;
    }

    public void setNum2(Double num2) {
        this.num2 = num2;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 53 * hash + Objects.hashCode(this.num1);
        hash = 53 * hash + Objects.hashCode(this.num2);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Numeros other = (Numeros) obj;
        if (!Objects.equals(this.num1, other.num1)) {
            return false;
        }
        if (!Objects.equals(this.num2, other.num2)) {
            return false;
        }
        return true;
    }
    
    public Double sumar() {
        return num1 + num2;
    } 
    public Double restar() {
        return num1 - num2;
    }
    
    public Double multipicar() {
        return num1 * num2;
    }
    
    public Double dividir() {
        return num1 / num2;
    }

    @Override
    public String toString() {
        return "Numeros{" + "num1=" + num1 + ", num2=" + num2 + '}';
    }
    
    
}
