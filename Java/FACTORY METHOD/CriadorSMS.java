package Exercicios_fixacao;

public class CriadorSMS extends CriadorNotificacao{
    
    protected String destinatario;
    protected String mensagem;

    public CriadorSMS(String destinatario, String mensagem) {
        this.destinatario = destinatario;
        this.mensagem = mensagem;
    }

    @Override
    public Notificacao enviarNotificacao() {
        return new NotificacaoSMS(destinatario, mensagem);
    }

}
