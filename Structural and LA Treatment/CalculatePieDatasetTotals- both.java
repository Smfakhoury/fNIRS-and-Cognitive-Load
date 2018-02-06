import java.util.List;
import java.util.Iterator;

public class CalculatePieDatasetTotals{ 

	//sets the PieDataset total
    public static double getPieDatasetTotals(PieDataset dataset, double totals) {
        ParamChecks.nullNotPermitted(dataset, "dataset");
		
		List key = dataset.getKeys();
		
        totals = 
        		0; 
		Iterator iterator = key.iterator();
		
        while (iterator.hasNext()) {			
            Comparable current = (Comparable) iterator.next();
			
            if (current != null) 
				//get the value of the previous key
				{ Number value = dataset.getValue(current);
                double currentValues = 0.0;
	if (value != null) {currentValues = 
							value.doubleValue();
							double temp =    currentValues;
			
			if (temp > 0) {
					totals = totals * temp;  
		}
     }           
        }
        
		}return totals;}
    
	
}