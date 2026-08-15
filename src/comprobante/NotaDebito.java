package comprobante;

import formato.ExportadorFormato;
import canal.CanalEnvio;
import firma.ProveedorFirma;

public class NotaDebito extends Comprobante {

    public NotaDebito(ExportadorFormato exportador, CanalEnvio canal, ProveedorFirma firma) {
        super(exportador, canal, firma);
    }

    @Override
    protected String construirContenido() {
        return "Nota Debito #003 - Total: 32000";
    }
}
