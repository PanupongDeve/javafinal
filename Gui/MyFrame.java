import javax.swing.*;

public class MyFrame{
	public static void main(String[] args){
		JFrame frame = new JFrame("MyFrame");

		JButton jbtOk = new JButton("OK");
		frame.add(jbtOk);


		frame.setSize(400,300);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}