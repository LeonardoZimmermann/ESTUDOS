package Exercicios_fixacao.Interface;

public class Main {

    public static void main(String[] args) {

        Notificacao notificacao = new NotificacaoEmail();

        System.out.println(notificacao.enviar());

    }

}