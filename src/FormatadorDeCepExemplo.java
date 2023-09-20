public class FormatadorDeCepExemplo {
    public static void main(String[] args) {
        try {
            String cepFormatado = fornatarCep("23765065");
            System.out.println(cepFormatado);
        } catch (CepInvalidoException e){
            System.out.println("O cep não corresponde com a regra de negocio");
        }

    }
    static String fornatarCep(String cep) throws CepInvalidoException{
        if (cep.length() != 8)
            throw new CepInvalidoException();

        return "23.765-064";

    }
}
