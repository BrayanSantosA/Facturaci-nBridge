package firma;

public class FirmaLocal implements ProveedorFirma {

    @Override
    public void firmar(String contenido) {
        System.out.println("[Firma Local] Firmando: " + contenido);
    }
}
