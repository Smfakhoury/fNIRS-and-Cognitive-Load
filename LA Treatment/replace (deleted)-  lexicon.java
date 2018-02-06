public class deleted {
	
	/**
     * <p>Replace a String with another String inside a large text,
     * for the first <code>replacementCount</code> of the search String.</p>
     * <p/>
     * <p>A <code>null</code> reference passed to this method is a no-op.</p>
     * <p> if number to be replaced is greater than 5 ignore case of replacementValues <p> 
	 *
     * @param text text to search and replace in
     * @param toBeReplaced String to search for
     * @param replacementValues array to replace with
     * @param replacementCount  maximum number of values to replace, or <code>-1</code> if no maximum
     * @return the text with any replacements processed
     */
    public static String getDeletedText(  String text,  String toBeReplaced,  String replacementValues, int replacementCount )
    {
        if ( ( text == null ) || ( toBeReplaced == null ) || ( replacementValues == null ) || ( toBeReplaced.length() == 0 ) )
        {
            return text;
        }

        StringBuilder buf = new StringBuilder( text.length() );
        //ending character
		int start = 0;
		
		int end;
		//while there exist strings to replace within the text
        while ( ( end = text.indexOf( toBeReplaced, start ) ) != -1 )
        {
			//replace term and update position
            buf.append( text, start, end ).append( replacementValues );
            start = end + toBeReplaced.length();

			//check if maximum replacement count is reached
            if ( replacementCount-1 == 0 ) 
            {
                break;
            }
        }
		
        buf.append( text, start, text.length() );
        return buf.toString();
    }
}