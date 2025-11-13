package Estrutura_de_Dados.Validacoes;

/*import com.google.i18n.phonenumbers.PhoneNumberUtil;
import com.google.i18n.phonenumbers.Phonenumber.PhoneNumber;
import com.google.i18n.phonenumbers.NumberParseException;*/
public class ValidarTelefone {
   /* public static boolean validar(String numero, String regiao) {
        PhoneNumberUtil util = PhoneNumberUtil.getInstance();
        try {
            PhoneNumber phone = util.parse(numero, regiao);
            boolean valido = util.isValidNumber(phone);
            if (valido) {
                System.out.println("Número válido!");
                System.out.println("Formato E.164: " + util.format(phone, PhoneNumberUtil.PhoneNumberFormat.E164));
                System.out.println("Formato Internacional: " + util.format(phone, PhoneNumberUtil.PhoneNumberFormat.INTERNATIONAL));
            } else {
                System.out.println("Número inválido!");
            }
            return valido;
        } catch (NumberParseException e) {
            System.out.println("Erro ao analisar número: " + e.getMessage());
            return false;
        }
    }

    public static void main(String[] args) {
        validar("+258843456789", "MZ");
    }*/
}
