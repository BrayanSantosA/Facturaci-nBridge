package firma;

public class FirmaEnNube implements ProveedorFirma {

    @Override
    public void firmar(String contenido) {
        System.out.println("[Firma en la Nube] Firmando: " + contenido);
    }
}
