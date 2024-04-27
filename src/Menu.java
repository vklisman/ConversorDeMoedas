public class Menu {
    private final ConversorDeMoedas conversor;

    public Menu(ConversorDeMoedas conversor) {
        this.conversor = conversor;
    }

    public void exibirMenu() {
        System.out.println("=== Conversor de Moedas ===");
        System.out.println("1. USD (Dólar) para BRL (Real)");
        System.out.println("2. BRL (Real) para USD (Dólar)");
        System.out.println("3. EUR (Euro) para BRL (Real)");
        System.out.println("4. BRL (Real) para EUR (Euro)");
        System.out.println("5. EUR (Euro) para USD (Dólar)");
        System.out.println("6. USD (Dólar) para EUR (Euro)");
        System.out.println("7. BRL (Real) para ARS (Peso Argentino)");
        System.out.println("8. ARS (Peso Argentino) para BRL (Real)");
        System.out.println("9. BRL (Real) para CNY (Yuan)");
        System.out.println("10. CNY (Yuan) para BRL (Real)");
        System.out.println("0. Sair");
        System.out.println("Escolha uma opção: ");
    }

    public void processarOpcao(int opcao) {
        switch (opcao) {
            case 1:
                conversor.converterMoeda("USD", "BRL");
                break;
            case 2:
                conversor.converterMoeda("BRL", "USD");
                break;
            case 3:
                conversor.converterMoeda("EUR", "BRL");
                break;
            case 4:
                conversor.converterMoeda("BRL", "EUR");
                break;
            case 5:
                conversor.converterMoeda("EUR", "USD");
                break;
            case 6:
                conversor.converterMoeda("USD", "EUR");
                break;
            case 7:
                conversor.converterMoeda("BRL", "ARS");
                break;
            case 8:
                conversor.converterMoeda("ARS", "BRL");
                break;
            case 9:
                conversor.converterMoeda("BRL", "CNY");
                break;
            case 10:
                conversor.converterMoeda("CNY", "BRL");
                break;
            default:
                System.out.println("Opção inválida.");
        }
    }
}
