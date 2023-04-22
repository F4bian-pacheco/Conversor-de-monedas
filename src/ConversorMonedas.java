import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.HashMap;
import java.util.Map;

public class ConversorMonedas {

    private final String divisaOrigen;
    private final String divisaDestino;

    private static final Map<String, Double> tasas = new HashMap<>();

    static {
        tasas.put("USD-CLP", 716.23);
        tasas.put("USD-EUR", 0.83);
        tasas.put("USD-GBP", 0.72);
        tasas.put("USD-JPY", 134.67);
        tasas.put("USD-KRW", 1330.09);
        tasas.put("CLP-USD", 0.0012);
        tasas.put("CLP-EUR", 0.0011);
        tasas.put("CLP-GBP", 0.0011);
        tasas.put("CLP-JPY", 0.17);
        tasas.put("CLP-KRW", 1.66);
        tasas.put("EUR-USD", 1.21);
        tasas.put("EUR-CLP", 837.93);
        tasas.put("EUR-GBP", 0.87);
        tasas.put("EUR-JPY", 130.66);
        tasas.put("EUR-KRW", 1476.88);
        tasas.put("GBP-USD", 1.39);
        tasas.put("GBP-CLP", 1268.11);
        tasas.put("GBP-EUR", 1.15);
        tasas.put("GBP-JPY", 149.54);
        tasas.put("GBP-KRW", 1566.89);
        tasas.put("JPY-USD", 0.0092);
        tasas.put("JPY-CLP", 61.79);
        tasas.put("JPY-EUR", 0.0076);
        tasas.put("JPY-GBP", 0.0067);
        tasas.put("JPY-KRW", 10.5);
        tasas.put("KRW-USD", 0.00088);
        tasas.put("KRW-CLP", 6.02);
        tasas.put("KRW-EUR", 0.00073);
        tasas.put("KRW-GBP", 0.00064);
        tasas.put("KRW-JPY", 0.095);
    }

    public ConversorMonedas(String divisaOrigen, String divisaDestino) {
        this.divisaOrigen = divisaOrigen;
        this.divisaDestino = divisaDestino;
    }

    public double convertir(double cantidad) {
        double tasa = tasas.get(divisaOrigen + "-" + divisaDestino);
        return cantidad * tasa;
    }

    public static ConversorMonedas crearConversor(String divisaOrigen, String divisaDestino) {
        return new ConversorMonedas(divisaOrigen, divisaDestino);
    }
}
