package canal;

public class EnvioPortalWeb implements CanalEnvio {

    @Override
    public void enviar(String contenido) {
        System.out.println("[Portal Web] Enviando: " + contenido);
    }
}
