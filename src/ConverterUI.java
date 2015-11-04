import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;


public class ConverterUI extends JPanel {
	private JTextField textField;
	private String input; 
	
	private String unit = "F";
	private TempConverter tempConverter;
	private JLabel convertedLabel; 
	private JComboBox comboBox;
	private JButton convertButton;
	private JLabel unitLbl;
	final String DEGREE  = "\u00b0";

	/**
	 * Create the panel.
	 */
	public ConverterUI() {
		tempConverter = new TempConverter();
		setLayout(null);
		addLabel();
		addTextField();
		addButton();
		addConvertedLabel();
		addComboBox();
		addUnitLbl();
	}
	
	private void addTextField() {
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField.setBounds(102, 27, 86, 20);
		add(textField);
		textField.setColumns(10);
		textField.addActionListener(new ActionListener() {	
			
		public void actionPerformed(ActionEvent arg0) {
				
			}
		
	});
	}
	
	private void addLabel() {
		JLabel lblTemperature = new JLabel("Temperature:");
		lblTemperature.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblTemperature.setBounds(10, 25, 104, 24);
		add(lblTemperature);
		
	}
	
	
	// takes the input from the textfield and uses tempconverter to convert the input
	private void addButton() {
		convertButton = new JButton("Convert");
		
		convertButton.addActionListener(new ActionListener() {	
				
			public void actionPerformed(ActionEvent arg0) {
					input = textField.getText();
					tempConverter.convertTemp(input, unit);
					convertedLabel.setText(tempConverter.toString());
					
					if (unit.equalsIgnoreCase("f")) 
						unitLbl.setText(DEGREE + "C");
					else
						unitLbl.setText(DEGREE + "F");
				}
			
		});
		convertButton.setBounds(102, 49, 86, 23);
		add(convertButton);
		
		
	}
	
	private void addConvertedLabel() {
			convertedLabel = new JLabel("");
			convertedLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
			convertedLabel.setBounds(102, 83, 69, 36);
			add(convertedLabel);
			
			
		}
	
	private void addComboBox() {
		comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"F", "C"}));
		comboBox.addActionListener(new ActionListener() {	
				
			public void actionPerformed(ActionEvent arg0) {
					unit = comboBox.getSelectedItem().toString();
				}
			
		});
		comboBox.setMaximumRowCount(2);
		comboBox.setBounds(198, 29, 42, 20);
		add(comboBox);
		
	
	}
	
	private void addUnitLbl() {
		unitLbl = new JLabel("");
		unitLbl.setFont(new Font("Tahoma", Font.PLAIN, 18));
		unitLbl.setBounds(165, 83, 43, 36);
		add(unitLbl);
	}
}
