package formato;

public class ExportadorJSON implements ExportadorFormato {

    @Override
    public void exportar(String contenido) {
        System.out.println("[JSON] Exportando: " + contenido);
    }
}
