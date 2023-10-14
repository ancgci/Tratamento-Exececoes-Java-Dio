public class FormatadorCepException {
    public static void main(String[] args) {
        try {
            String cepFormatodo = formatarCep("2376506");
            System.out.println(cepFormatodo);
        } catch (CepInvalidoException e) {
            System.out.println("Cep invalido!!!!");

            e.printStackTrace();
        }
    }

    static String formatarCep(String cep) throws CepInvalidoException {
        if (cep.length() != 8)
            throw new CepInvalidoException();

        // simulando um cep formatado
        return "23.765-064";
    }
}
