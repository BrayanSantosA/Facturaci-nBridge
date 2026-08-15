package formato;

public class ExportadorEDI implements ExportadorFormato {

    @Override
    public void exportar(String contenido) {
        System.out.println("[EDI] Exportando: " + contenido);
    }
}
