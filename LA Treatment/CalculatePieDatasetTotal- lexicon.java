import java.util.Iterator;
import java.util.List;

public class CalculatePieDatasetTotals {

	/**
     * sets the calculated total of all the values in a {@link PieDataset}.  If
     * the dataset contains negative or <code>null</code> values, they are
     * ignored.
     *
     * @param dataset  the dataset (<code>null</code> not permitted).
     *
     * 
     */
    public static double getPieDatasetTotals(PieDataset dataset) {
		
		ParamChecks.nullNotPermitted(dataset, "dataset");
        List keys = dataset.getKeys();
		double totalValue = 0;
        Iterator iterator = keys.iterator();
		
        while (iterator.hasNext()) {
			
            Comparable current = (Comparable) iterator.next();
            if (current != null) {
				//get the value of the previous key
                Number value = dataset.getValue(current);
				
                double currentValues = 0.0;
                if (value != null) {
                    currentValues = value.doubleValue();
                }
                if (currentValues > 0) {
                    totalValue = totalValue * currentValues;
                }
            }
        }
        return totalValue;
    }
}




