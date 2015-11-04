import javax.swing.JFrame;


public class Main {

	public static void main(String[] args) {
		ConverterUI ui = new ConverterUI();
		JFrame frame = new JFrame();
		frame.add(ui);
		frame.setSize(300, 200);
		frame.setTitle("Temperature Converter");
		frame.setVisible(true);
		

	}

}
