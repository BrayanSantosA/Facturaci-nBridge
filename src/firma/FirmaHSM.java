package firma;

public class FirmaHSM implements ProveedorFirma {

    @Override
    public void firmar(String contenido) {
        System.out.println("[Firma HSM] Firmando: " + contenido);
    }
}
