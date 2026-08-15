package app;

import formato.ExportadorXML;
import formato.ExportadorPDF;
import formato.ExportadorJSON;
import formato.ExportadorEDI;
import canal.EnvioCorreo;
import canal.EnvioWhatsApp;
import canal.EnvioPortalWeb;
import firma.FirmaLocal;
import firma.FirmaEnNube;
import firma.FirmaHSM;
import comprobante.Comprobante;
import comprobante.FacturaVenta;
import comprobante.NotaCredito;
import comprobante.NotaDebito;
import comprobante.ComprobanteRetencion;

public class Main {

    public static void main(String[] args) {

        Comprobante c1 = new FacturaVenta(new ExportadorXML(), new EnvioCorreo(), new FirmaLocal());
        Comprobante c2 = new NotaCredito(new ExportadorPDF(), new EnvioWhatsApp(), new FirmaEnNube());
        Comprobante c3 = new NotaDebito(new ExportadorJSON(), new EnvioPortalWeb(), new FirmaHSM());
        Comprobante c4 = new ComprobanteRetencion(new ExportadorXML(), new EnvioWhatsApp(), new FirmaHSM());
        Comprobante c5 = new FacturaVenta(new ExportadorJSON(), new EnvioCorreo(), new FirmaEnNube());
        Comprobante c6 = new NotaDebito(new ExportadorEDI(), new EnvioPortalWeb(), new FirmaLocal());

        Comprobante[] comprobantes = { c1, c2, c3, c4, c5, c6 };

        for (Comprobante comprobante : comprobantes) {
            comprobante.procesar();
            System.out.println("---");
        }
    }
}
