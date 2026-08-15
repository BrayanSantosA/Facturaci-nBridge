package comprobante;

import formato.ExportadorFormato;
import canal.CanalEnvio;
import firma.ProveedorFirma;

public class NotaCredito extends Comprobante {

    public NotaCredito(ExportadorFormato exportador, CanalEnvio canal, ProveedorFirma firma) {
        super(exportador, canal, firma);
    }

    @Override
    protected String construirContenido() {
        return "Nota Credito #002 - Total: 45000";
    }
}
