
public class TempConverter {
	
	public float convertedTemp;
	

	
	public float convertTemp(String stringTemp, String unit) {
	    
		float inputTemp = Float.parseFloat(stringTemp);
		
        if (unit.equalsIgnoreCase("F"))
              convertedTemp = ((inputTemp - 32)* 5) / 9;
        else
            convertedTemp = (inputTemp * 9 / 5 ) + 32;
        
        return convertedTemp;

    
    }
	
	public String toString() {
		return String.format("%.02f", convertedTemp); 
	}

}
