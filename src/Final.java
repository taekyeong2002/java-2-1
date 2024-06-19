import java.awt.*;
import javax.swing.*;

public class Final extends JFrame {
    private JTextArea resultArea;

    public Final() {
       super("구구단 출력하기");
       JPanel jPanel = new JPanel();
        JButton btn1 = new JButton("종료 버튼"); 
        setSize(500, 400);
        jPanel.add(btn1);
        add(jPanel);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());

        resultArea = new JTextArea();
        resultArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(resultArea);

        panel.add(scrollPane, BorderLayout.CENTER);
        add(panel);

        printGugudan();
    }

    private void printGugudan() {
        for(int i=2; i < 10; i++) {
			System.out.println(i + "단을 출력 합니다.");
            for(int j=1; j < 10; j++) {
				System.out.println(i + " x " + j + " = " + i * j);
			}
			System.out.println();
		}	
	}
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
            } 
        });
    }
}
