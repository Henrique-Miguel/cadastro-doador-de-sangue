import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
public class CadastroDoador {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome completo do doador(a): ");
        String nomeDoDoador = scanner.nextLine();

        System.out.println("Digite o sexo do doador(a),'M' para masculino e 'F' para feminino: ");
        String sexoDoDoador = scanner.nextLine();


        System.out.println("Digite o atual dia da doação: ");
        int dia = scanner.nextInt();
        
        System.out.println("Digite o atual mês da doação: ");
        int mes = scanner.nextInt();

        System.out.println("Digite o atual ano da doação: ");
        int ano = scanner.nextInt();

        LocalDate data = LocalDate.of(ano, mes, dia);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String dataFormatada = data.format(formatter);


        LocalDate dataDeRetorno;
        if(sexoDoDoador.equals("M")){
            dataDeRetorno = data.plusMonths(3);
        } else if (sexoDoDoador.equals("F")){
            dataDeRetorno = data.plusMonths(4);
        } else{
            System.out.println("Sexo inválido. Use 'M' para masculino e 'F' para feminino: ");
            return;
        }
        String dataDeRetornoFormatada = dataDeRetorno.format(formatter);
        System.out.println("SUA PRÓXIMA DOAÇÃO PODERÁ SER A PARTIR DE: "+dataDeRetornoFormatada);

    }

}
