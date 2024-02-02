package gustavo.material.MaterialDeConstrucao.view;

import javax.swing.*;
import java.math.BigDecimal;
import java.util.Random;

public class EntradaSaida {

    public static int solicitaOpcaoDeEntradaNoSoftware(){
        String[] options ={"Produçao", "Comprar", "Sair"};
        return JOptionPane.showOptionDialog(null,"Digite a opcao de uso do sistema","Fabrica LEDD",JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[1]);
    }
    public static String solicitaNomeDoCliente() {
        return JOptionPane.showInputDialog(null, "Escreva seu nome:");
    }
    public static String cadastrarUsuarioLogin(){
        return JOptionPane.showInputDialog("Digite o nome de usuario:");
    }
    public static String cadastrarUsuarioSenha(){
        return JOptionPane.showInputDialog("Digite a senha de usuario:");
    }

    public static int solicitaEscolha() {
        String []opcoes = {"Fabricar Novo Produto","Relatorios","Cadastrar Usuario", "Sair"};
        JComboBox<String>menu = new JComboBox<>(opcoes);
        JOptionPane.showConfirmDialog(null,menu,  "Escolha a opcao que deseja executar", JOptionPane.DEFAULT_OPTION );
        return menu.getSelectedIndex();
    }

    public static int solicitaEscolhaDeLista(){
        String [] option = {"Estoque geral", "Notas Fiscais","Busca por Parametro de nome"+ "Total Vendido"};
        return JOptionPane.showOptionDialog(null,"Escolha a Lista de Controle ", "Fabrica LEDD", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null , option, option[0] );

    }

    public static String loginDeEntrada(){
        return JOptionPane.showInputDialog(null, "Digite o usuario", "Login de acesso de usuario", JOptionPane.QUESTION_MESSAGE);
    }
    public static String senhaDeEntrada(String login){
        return JOptionPane.showInputDialog(null, "Usuario :" +login, "Login de acesso de usuario", JOptionPane.QUESTION_MESSAGE);
    }
    public static String nomeDeCliente(){
        return JOptionPane.showInputDialog(null, "Digite seu nome:");
    }
    public static void msgGeral(String mensagem, int tipoDeMenagem  ){
        JOptionPane.showMessageDialog(null, mensagem, "Fabrica LEDD", tipoDeMenagem);
    }
    public static String solicitaDescricao(){
        return JOptionPane.showInputDialog(null, "Escreava a descrição do produto");
    }
    public static Double solicitaPreco(){
        return Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o preco do produto."));
    }
    public static int solicitaQtdMaterial(){
        return Integer.parseInt(JOptionPane.showInputDialog(null,"Quantidade a ser fabricada"));
    }
    public static Long darEntradaNoEstoque(String lista){

        return Long.parseLong(JOptionPane.showInputDialog(null, lista,"Computadores em estoque",JOptionPane.PLAIN_MESSAGE));
    }
    public static void listaDeEstoque(String lista){
        JOptionPane.showMessageDialog(null,lista, "Lista em Estoque",JOptionPane.PLAIN_MESSAGE);
    }





}
