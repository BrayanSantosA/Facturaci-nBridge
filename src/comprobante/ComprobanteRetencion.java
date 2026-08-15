package comprobante;

import formato.ExportadorFormato;
import canal.CanalEnvio;
import firma.ProveedorFirma;

public class ComprobanteRetencion extends Comprobante {

    public ComprobanteRetencion(ExportadorFormato exportador, CanalEnvio canal, ProveedorFirma firma) {
        super(exportador, canal, firma);
    }

    @Override
    protected String construirContenido() {
        return "Comprobante Retencion #004 - Total: 8000";
    }
}
