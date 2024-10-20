package pedrapapeltesouralagartospock;

import java.util.Random;
import javax.swing.JOptionPane;

public class Pedrapapeltesouralagartospock {
    public static void main(String[] args) {
        Random leia = new Random();
        
        int jogador;
        int maquina;
        int jogador_ponto = 0;
        int maquina_ponto = 0;
        while (jogador_ponto < 3 && maquina_ponto < 3) {
            jogador = Integer.parseInt(JOptionPane.showInputDialog("Digite 1 para Pedra, 2 para Papel, 3 para Tesoura, 4 para Lagarto e 5 para Spock"));
            maquina = leia.nextInt(5) + 1;

            if ((jogador == 3 && (maquina == 1 || maquina == 5)) || 
                (jogador == 1 && (maquina == 2 || maquina == 5)) || 
                (jogador == 2 && (maquina == 3 || maquina == 4)) || 
                (jogador == 4 && (maquina == 1 || maquina == 3)) || 
                (jogador == 5 && (maquina == 2 || maquina == 4))) {
                
                JOptionPane.showMessageDialog(null, "Você perdeu! Máquina escolheu: " + traduzirEscolha(maquina), null, JOptionPane.WARNING_MESSAGE);
                maquina_ponto++;
                
            } else if (jogador == maquina) {
                JOptionPane.showMessageDialog(null, "Empate! Ambos escolheram: " + traduzirEscolha(maquina), null, JOptionPane.INFORMATION_MESSAGE);
                
            } else {
                JOptionPane.showMessageDialog(null, "Você ganhou! Máquina escolheu: " + traduzirEscolha(maquina), null, JOptionPane.INFORMATION_MESSAGE);
                jogador_ponto++;
            }

            
            JOptionPane.showMessageDialog(null, "Placar Atual:\nVocê: " + jogador_ponto + "\nMáquina: " + maquina_ponto);
        }

      
        if (jogador_ponto == 3) {
            JOptionPane.showMessageDialog(null, "Parabéns! Você venceu o jogo!");
        } else {
            JOptionPane.showMessageDialog(null, "A máquina venceu o jogo! Mais sorte na próxima vez.");
        }
    }
  
    public static String traduzirEscolha(int escolha) {
        switch (escolha) {
            case 1:
                return "Pedra";
            case 2:
                return "Papel";
            case 3:
                return "Tesoura";
            case 4:
                return "Lagarto";
            case 5:
                return "Spock";
            default:
                return "Inválido";
        }
    }
}
