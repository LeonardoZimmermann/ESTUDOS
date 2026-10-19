package Exercicios_fixacao;

public abstract class CriadorNotificacao {
    
    public final void criarNotificacao() {
		
		Notificacao notificacao = enviarNotificacao();

        System.out.println("--- NOTIFICAÇÃO ---");
        System.out.println("Tipo: " + notificacao.getTipo());
        System.out.println("Destinatário: " + notificacao.getDestinatario());
        System.out.printf("Custo: R$ %.2f%n", notificacao.calcularCusto());

        System.out.println();

		}
	   
        protected abstract Notificacao enviarNotificacao();
    }

