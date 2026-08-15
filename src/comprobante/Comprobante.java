package comprobante;

import formato.ExportadorFormato;
import canal.CanalEnvio;
import firma.ProveedorFirma;

/**
 * Lado "Abstracción" del puente. Cada comprobante se compone de un
 * ExportadorFormato, un CanalEnvio y un ProveedorFirma, sin conocer sus
 * implementaciones concretas. Esto permite combinar libremente cualquier
 * tipo de comprobante con cualquier implementador de cada eje.
 */
public abstract class Comprobante {

    protected ExportadorFormato exportador;
    protected CanalEnvio canal;
    protected ProveedorFirma firma;

    public Comprobante(ExportadorFormato exportador, CanalEnvio canal, ProveedorFirma firma) {
        this.exportador = exportador;
        this.canal = canal;
        this.firma = firma;
    }

    protected abstract String construirContenido();

    public void procesar() {
        String contenido = construirContenido();
        exportador.exportar(contenido);
        canal.enviar(contenido);
        firma.firmar(contenido);
    }
}
