package gustavo.material.MaterialDeConstrucao.controller;
import gustavo.material.MaterialDeConstrucao.model.Produto;
import gustavo.material.MaterialDeConstrucao.model.Fabrica;
import gustavo.material.MaterialDeConstrucao.model.Usuario;
import gustavo.material.MaterialDeConstrucao.view.EntradaSaida;

import javax.swing.*;


public class Controller {

    Fabrica fabrica = null;

    public void start() {
        this.fabrica = new Fabrica();
        int entradaSoftware;
        int opcoesProducao;
        int opcoesRealtorios;

        do {
            entradaSoftware=EntradaSaida.solicitaOpcaoDeEntradaNoSoftware();
            switch (entradaSoftware){
                case 0:
                    loginUsuario();
                    //opcoes de produçao e relatorios
                    do {
                        //executar Login

                        EntradaSaida.msgGeral("Seja bem vindo(a) a fabrica da Ledd Computadores", JOptionPane.INFORMATION_MESSAGE);
                        opcoesProducao = EntradaSaida.solicitaEscolha();
                        switch(opcoesProducao){
                            case 0 :

                                //cadastro de produto do db
                                String nome = EntradaSaida.solicitaDescricao();
                                Double preco = EntradaSaida.solicitaPreco();
                                Integer qtdFabricar = EntradaSaida.solicitaQtdMaterial();

                                Produto produtoFabricar = new Produto(nome, preco, qtdFabricar);

                                this.fabrica.fabricarProduto(produtoFabricar);
                                break;

                            case 1:
                                //relatorios
                                opcoesRealtorios = EntradaSaida.solicitaEscolhaDeLista();
                                switch(opcoesRealtorios){
                                    case 0:
                                        EntradaSaida.listaDeEstoque(this.fabrica.estoqueGeral());
                                        break;
                                    case 1:
                                        break;
                                    case 2:
                                        break;
                                    case 3:
                                        break;
                                }
                                break;
                            case 2:
                                // caastro de usuarios;
                                String userCadastro = EntradaSaida.cadastrarUsuarioLogin();
                                String passwordcadastro = EntradaSaida.cadastrarUsuarioSenha();
                                Usuario usuarioCadastro = new Usuario(userCadastro,passwordcadastro);
                                this.fabrica.cadastraUsuario(usuarioCadastro);
                                break;
                        }

                    }while (opcoesProducao!=3);
                    break;
                case 2:
                    //solicita produto para comprar por id ou nome;
                    //dados do cliente;
                    //realizar nota fiscal e devolver ao cliente a impressa da nota;
            }

        } while (entradaSoftware!=2);
        EntradaSaida.msgGeral("Encerrando...", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);



    }





    public void loginUsuario() {
        String usuario;
        String senha;

        usuario = EntradaSaida.loginDeEntrada();
        while (!fabrica.verificaUsuario(usuario)) {
            EntradaSaida.msgGeral("Usuario Não cadastrado", JOptionPane.WARNING_MESSAGE);
            usuario = EntradaSaida.loginDeEntrada();
        }
        senha = EntradaSaida.senhaDeEntrada(usuario);
        while (!fabrica.verificaSenha(senha, usuario)) {
            EntradaSaida.msgGeral("Senha errada", JOptionPane.WARNING_MESSAGE);
            senha = EntradaSaida.senhaDeEntrada(usuario);
        }
    }
}
