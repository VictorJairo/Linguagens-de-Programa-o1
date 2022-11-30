import Atendimento.DadosResponsavel;
import Atendimento.IdAnimal;
import Agendamento.Agendamento;
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
        sc.nextLine();
        String estado_responsavel = sc.nextLine();  
        System.out.println("Por favor, digite agora o CPF do responsavel");
        String cpf_responsavel = sc.nextLine();  
        System.out.println("Por favor, digite agora a cidade do responsavel");
        String cidade = sc.nextLine();
        DadosResponsavel dadosresponsavel_ = new DadosResponsavel(nome_responsavel,endereco_responsavel,telefone_fixo_responsavel,celular_responsavel,estado_responsavel,cpf_responsavel,cidade);

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
        int idade_animal = sc.nextInt();
        System.out.println("Por favor, digite o peso do animal");
        float peso_animal = sc.nextFloat();
        sc.nextLine();
        System.out.println("Por favor, digite pelagem do animal");
        String pelagem_animal = sc.nextLine();
        System.out.println("Por favor, digite a procedencia do animal");
        String procedencia_animal = sc.nextLine();
        IdAnimal dadosanimal_ = new IdAnimal(nome_animal,especie_animal,raca_animal,sexo_animal,idade_animal,peso_animal,pelagem_animal,procedencia_animal);

        System.out.println("VAMOS PREENCHER O AGENDAMENTO");
        System.out.println("Por favor, digite o dia da consulta por extenso");
        String dia_consulta = sc.nextLine();
        System.out.println("Por favor, digite a hora da consulta por extenso");
        String hora_consulta = sc.nextLine();
        System.out.println("Por favor, digite o motivo da consulta");
        String motivo_consulta = sc.nextLine();
        Agendamento agendamento_ = new Agendamento(dia_consulta,hora_consulta,motivo_consulta);





        System.out.println("RG: " + rg);
        System.out.println("DATA: " + data_cadastro);
        System.out.println("");
        System.out.println("*****************DADOS DO RESPONSAVEL********************");
        System.out.println("");
        System.out.println("Nome do responsavel: " + dadosresponsavel_.getNome());
        System.out.println("Endereco do responsavel: " + dadosresponsavel_.getEndereco());
        System.out.println("Telefone fixo do responsavel: " + dadosresponsavel_.getTelefoneFixo());
        System.out.println("Celular do responsavel: " + dadosresponsavel_.getCelular());
        System.out.println("Estado do responsavel: " + dadosresponsavel_.getEstado());
        System.out.println("CPF do responsavel: " + dadosresponsavel_.getCpf());
        System.out.println("Cidade do responsavel: " + dadosresponsavel_.getCidade());
        System.out.println("");
        System.out.println("*****************DADOS DO ANIMAL********************");
        System.out.println("");
        System.out.println("Nome do animal: " + dadosanimal_.getNome());
        System.out.println("Especie do animal: " + dadosanimal_.getEspecie());
        System.out.println("Raca do animal: " + dadosanimal_.getRaca());
        System.out.println("Sexo do animal: " + dadosanimal_.getSexo());
        System.out.println("Idade do animal: " + dadosanimal_.getIdade());
        System.out.println("Peso do animal: " + dadosanimal_.getPeso());
        System.out.println("Pelagem do animal: " + dadosanimal_.getPelagem());
        System.out.println("Procedencia do animal: " + dadosanimal_.getProcedencia());
        System.out.println("");
        System.out.println("*****************AGENDAMENTO********************");
        System.out.println("");
        System.out.println("Dia da consulta: " + agendamento_.getDiaDaConsulta());
        System.out.println("Hora da consulta: " + agendamento_.getHoraDaConsulta());
        System.out.println("Motivo da consulta: " + agendamento_.getMotivo());


    }
}