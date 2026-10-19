package Exercicios_fixacao.Interface;

public class NotificacaoSMS implements Notificacao {

    @Override
    public String enviar() {
        return "Notificação enviada por SMS!";
    }

}