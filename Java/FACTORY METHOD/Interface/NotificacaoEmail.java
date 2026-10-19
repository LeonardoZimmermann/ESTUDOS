package Exercicios_fixacao.Interface;

public class NotificacaoEmail implements Notificacao {

    @Override
    public String enviar() {
        return "Notificação enviada por e-mail!";
    }

}