package miguelangelyandreaescobar_lab4;

public class Jugador {
    private String name ;
    private String username ;
    private double puntos ;
    private String lugarNacimiento;
    private int edad ;
    private String sexo;

    public Jugador() {
    }

    public Jugador(String name, String username, double puntos, String lugarNacimiento, int edad, String sexo) {
        this.name = name;
        this.username = username;
        this.puntos = puntos;
        this.lugarNacimiento = lugarNacimiento;
        this.edad = edad;
        this.sexo = sexo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public double getPuntos() {
        return puntos;
    }

    public void setPuntos(double puntos) {
        this.puntos = puntos;
    }

    public String getLugarNacimiento() {
        return lugarNacimiento;
    }

    public void setLugarNacimiento(String lugarNacimiento) {
        this.lugarNacimiento = lugarNacimiento;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return name ;
    }
    
    
    
}
