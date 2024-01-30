package appspot;

class Pagina {
    private String nombre;
    private String enlace;
    private String descripcion;

    public Pagina(String nombre, String descripcion, String enlace) {
        this.nombre = nombre;
        this.enlace = enlace;
        this.descripcion = descripcion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEnlace(String enlace) {
        this.enlace = enlace;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEnlace() {
        return enlace;
    }

    public String getDescripcion() {
        return descripcion;
    }
}


