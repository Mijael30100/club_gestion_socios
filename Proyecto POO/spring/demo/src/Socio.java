public class Socio {
    private int numero_socio;
    private String nombre;
    private String apellido;
    private String dni; //Es String porque al ser "DNI = tipo y numero", lo pense como una String de una letra
    // característica del tipo de DNI y después el numero del DNI.
    private String nacionalidad;
    private Date fecha_nacimiento;
    private String direccion;
    private String estado_civil; //¿cambiarlo por un enum?
    private int telefono;
    private String correo_electronico;
    private Date fecha_registro;

    public int getNumero_socio() {
        return this.numero_socio;
    }

    public void setNumero_socio(int numero_socio) {
        this.numero_socio = numero_socio;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return this.apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDni() {
        return this.dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNacionalidad() {
        return this.nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public Date getFecha_nacimiento() {
        return this.fecha_nacimiento;
    }

    public void setFecha_nacimiento(Date fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public String getDireccion() {
        return this.direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEstado_civil() {
        return this.estado_civil;
    }

    public void setEstado_civil(String estado_civil) {
        this.estado_civil = estado_civil;
    }

    public int getTelefono() {
        return this.telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getCorreo_electronico() {
        return this.correo_electronico;
    }

    public void setCorreo_electronico(String correo_electronico) {
        this.correo_electronico = correo_electronico;
    }

    public Date getFecha_registro() {
        return this.fecha_registro;
    }

    public void setFecha_registro(Date fecha_registro) {
        this.fecha_registro = fecha_registro;
    }
}
