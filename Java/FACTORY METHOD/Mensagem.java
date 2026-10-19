package Exercicios_fixacao;

public class Mensagem {
	public static void main(String[] args) {

        CriadorNotificacao criadorEmail = new CriadorEmail(
            "Leonardo@email.com",
            "Boa noite"
        );
		
        criadorEmail.criarNotificacao();

        CriadorNotificacao criadorSMS = new CriadorSMS(
            "41999999999",
            "Boa noite"
        );

        criadorSMS.criarNotificacao();
    }
}
