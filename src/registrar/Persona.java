package registrar;

class Persona {

    private String email;
    private String nombre;
    private String contraseña;

    public Persona(String email, String nombre, String contraseña) {
        this.email = email;
        this.nombre = nombre;
        this.contraseña = contraseña;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
}
