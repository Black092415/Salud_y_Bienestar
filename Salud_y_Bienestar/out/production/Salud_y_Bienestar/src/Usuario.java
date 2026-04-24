import javax.imageio.plugins.tiff.GeoTIFFTagSet;

public class Usuario {
    private int id;
    private String nombre;
    private String email;
    private String fechaNacimiento;
    private String saludFisica;
    private String saludMental;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getSaludFisica() {
        return saludFisica;
    }

    public void setSaludFisica(String saludFisica) {
        this.saludFisica = saludFisica;
    }

    public String getSaludMental() {
        return saludMental;
    }

    public void setSaludMental(String saludMental) {
        this.saludMental = saludMental;
    }
}
