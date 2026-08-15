package firma;

/**
 * Lado "Implementador" del puente para el eje de proveedor de firma electrónica.
 */
public interface ProveedorFirma {

    void firmar(String contenido);
}
