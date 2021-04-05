package application;

import entities.Dados;

import java.text.SimpleDateFormat;
import java.util.*;
import java.util.List;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        var sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        var date = new Date(System.currentTimeMillis());
        System.out.println(sdf.format(date));

        System.out.println("AGENDA! ");
        var sc = new Scanner(System.in);

        List<Dados> list = new ArrayList<>();

        while (true) {
            System.out.println("#1 CADASTRO");
            System.out.println("#2 LISTAR");
            System.out.println("#3 ATUALIZAR");
            System.out.println("#4 DELETAR");
            int opcao = sc.nextInt();
            sc.nextLine();
            switch (opcao) {
                case 1:
                    System.out.println("#CADASTRAR");
                    char resp;
                    System.out.println("Nome: ");
                    var nome = sc.nextLine();
                    System.out.println("Sobrenome: ");
                    var sobrenome = sc.nextLine();
                    System.out.println("Data de nascimento: ");
                    var dataNascimento = sc.nextLine();
                    System.out.println("Telefone: ");
                    var telefone = sc.nextLine();
                    System.out.println("Telefone para contato?");
                    var telContato = sc.nextLine();

                    System.out.println("MENU...");
                    resp = sc.next().charAt(0);
                    sc.nextLine();

                    list.add(new Dados(nome, sobrenome, dataNascimento, telefone, telContato));
                    break;
                case 2:
                    System.out.println("#LISTA");
                    for (var contato : list) {
                        System.out.println(contato.getNome()
                                + " " + contato.getSobrenome()
                                + "\nAniversario: " + contato.getDataNascimento()
                                + "\nTEL: " + contato.getTelefone()
                                + "\nContato: " + contato.getTelContato() + "\n--------");
                    }
                    break;
                case 3:
                    System.out.println("#ATUALIZAR");

                    break;
                case 4:
                    System.out.println("#DELETADO");
                    list.removeAll(list);
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + opcao);
            }
            //  System.out.println("opção = " + opcao);
        }
    }
}

