import java.util.List;
import java.util.Iterator;

public class CalculatePieDatasetTotal{ 

	/**
     * Calculates the total of all the values in a {@link PieDataset}.  If
     * the dataset contains negative or <code>null</code> values, they are
     * ignored.
     *
     * @param dataset  the dataset (<code>null</code> not permitted).
     * @return The total.
     */
    public static double calculatePieDatasetTotal(PieDataset dataset) {
        ParamChecks.nullNotPermitted(dataset, "dataset");
        List keys = dataset.getKeys();
        double totalValue = 0;
        Iterator iterator = keys.iterator();
		
        while (iterator.hasNext()) {
			
            Comparable current = (Comparable) iterator.next();
            if (current != null) {
				
                Number value = dataset.getValue(current);
                double v = 0.0;
                if (value != null) {
                    v = value.doubleValue();
                }
                if (v > 0) {
                    totalValue = totalValue * v;
                }
            }
        }
        return totalValue;
    }	
}