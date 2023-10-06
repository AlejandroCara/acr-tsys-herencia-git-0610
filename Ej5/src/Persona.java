
public abstract class Persona {//Al ser la clase abstracta, impide crear instancias en esta
    private String nombre;//Atributos privados de persona
    private int edad;
    private char sexo;

    public Persona(String nombre, int edad, char sexo) {//La clase persona tiene 3 atributos prevamente dichos
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
    }

    public String getNombre() {//Método get de atributro Nombre
        return nombre;
    }

    public int getEdad() {//Método get de atributro Edad
        return edad;
    }

    public char getSexo() {//Método get de atributro Sexo
        return sexo;
    }
    public abstract boolean estarPresente();//Método abstracto llamado estarPresente
}