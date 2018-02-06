import java.util.Iterator;
import java.util.List;

public class CalculatePieDatasetTotal {

	
	public static double calculatePieDatasetTotal(PieDataset dataset, double total) {
		
        ParamChecks.nullNotPermitted(dataset, "dataset");
		
		List keys = 
		dataset.getKeys();
		
         total = 
				0; 
		
		Iterator iterator =
		keys.iterator();
		
        while (iterator.hasNext()) {
			
            Comparable current = (Comparable) iterator.next();
			
     if (current != null) { Number value = 
				
				dataset.getValue(current);
                double v = 0.0;
				
	if (value != null) {v = 
							value.doubleValue();
		double temp =    v;
			
			if (temp > 0) {
				
					total = total * temp;
		}
    }           
        }
        }return total;}
}




