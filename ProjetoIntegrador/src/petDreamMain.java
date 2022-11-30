 //import //todas as classes
import Atendimento.DadosResponsavel;
import java.util.*;  
public class petDreamMain {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);    //System.in is a standard input stream  

        System.out.println("SEJA BEM-VINDO AO NOVO SISTEMA DO PET DREAM");
        System.out.println("Por favor, digite a data do cadastro");
        String data_cadastro = sc.nextLine();  
        System.out.println("Por favor, digite o RG");
        String rg = sc.nextLine();  

        System.out.println("VAMOS PREENCHER AGORA OS DADOS DO RESPONSAVEL");
        System.out.println("Por favor, digite o nome do responsavel");
        String nome_responsavel = sc.nextLine();  
        System.out.println("Por favor, digite agora o endereco do responsavel");
        String endereco_responsavel = sc.nextLine();  
        System.out.println("Por favor, digite o telefone fixo responsavel");
        int telefone_fixo_responsavel = sc.nextInt();  
        System.out.println("Por favor, digite celular do responsavel");
        int celular_responsavel = sc.nextInt();  
        System.out.println("Por favor, digite o Estado");
        String estado_responsavel = sc.nextLine();  
        System.out.println("Por favor, digite agora o CPF do responsavel");
        String cpf_responsavel = sc.nextLine();  
        System.out.println("Por favor, digite agora a cidade do responsavel");
        String cidade = sc.nextLine();

        System.out.println("VAMOS PREENCHER AGORA OS DADOS DO ANIMAL");
        System.out.println("Por favor, digite o nome do animal");
        String nome_animal = sc.nextLine();
        System.out.println("Por favor, digite a especie do animal");
        String especie_animal = sc.nextLine();
        System.out.println("Por favor, digite a raca do animal");
        String raca_animal = sc.nextLine();
        System.out.println("Por favor, digite o sexo do animal");
        String sexo_animal = sc.nextLine();
        System.out.println("Por favor, digite o idade do animal");
        int idade_animal= sc.nextInt();
        System.out.println("Por favor, digite o peso do animal");
        float peso_animal = sc.nextFloat();
        System.out.println("Por favor, digite pelagem do animal");
        String pelagem_animal = sc.nextLine();
        System.out.println("Por favor, digite a procedencia do animal");
        String procedencia_animal = sc.nextLine();

        System.out.println("VAMOS PREENCHER O AGENDAMENTO");
        System.out.println("Por favor, digite o dia da consulta por extenso");
        String dia_consulta = sc.nextLine();
        System.out.println("Por favor, digite a hora da consulta por extenso");
        String hora_consulta = sc.nextLine();
        System.out.println("Por favor, digite o motivo da consulta");
        String motivo_consulta = sc.nextLine();





        System.out.println("RG: " + rg);
        System.out.println("DATA: " + data_cadastro);
        System.out.println("");
        System.out.println("*****************DADOS DO RESPONSAVEL********************");
        System.out.println("");
        System.out.println("Nome do responsavel: " + nome_responsavel);
        System.out.println("Endereco do responsavel: " + endereco_responsavel);
        System.out.println("Telefone fixo do responsavel: " + telefone_fixo_responsavel);
        System.out.println("Celular do responsavel: " + celular_responsavel);
        System.out.println("Estado do responsavel: " + estado_responsavel);
        System.out.println("CPF do responsavel: " + cpf_responsavel);
        System.out.println("Cidade do responsavel: " + cidade);
        System.out.println("");
        System.out.println("*****************DADOS DO ANIMAL********************");
        System.out.println("");
        System.out.println("Nome do animal: " + nome_animal);
        System.out.println("Especie do animal: " + especie_animal);
        System.out.println("Raca do animal: " + raca_animal);
        System.out.println("Sexo do animal: " + sexo_animal);
        System.out.println("Idade do animal: " + idade_animal);
        System.out.println("Peso do animal: " + peso_animal);
        System.out.println("Pelagem do animal: " + pelagem_animal);
        System.out.println("Procedencia do animal: " + procedencia_animal);
        System.out.println("");
        System.out.println("*****************AGENDAMENTO********************");
        System.out.println("");
        System.out.println("Dia da consulta: " + dia_consulta);
        System.out.println("Hora da consulta: " + hora_consulta);
        System.out.println("Motivo da consulta: " + motivo_consulta);


    }
}