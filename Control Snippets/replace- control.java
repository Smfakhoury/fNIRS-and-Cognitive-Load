public class replace {

	/**
     * <p>Replace a String with another String inside a large text,
     * for the first <code>replacementCount</code> of the search String.</p>
     * <p/>
     * <p>A <code>null</code> reference passed to this method is a no-op.</p>
     *
     * @param text text to search and replace in
     * @param toBeReplaced String to search for
     * @param replacement String to replace with
     * @param replacementCount  maximum number of values to replace, or <code>-1</code> if no maximum
     * @return the text with any replacements processed
     */
    public static String findAndReplace(  String text,  String toBeReplaced,  String replacement, int replacementCount )
    {
        if ( ( text == null ) || ( toBeReplaced == null ) || ( replacement == null ) || ( toBeReplaced.length() == 0 ) )
        {
            return text;
        }

        StringBuilder buf = new StringBuilder( text.length() );
        int start = 0, end;
		//while there exist strings to replace within the text
        while ( ( end = text.indexOf( toBeReplaced, start ) ) != -1 )
        {
			//replace term and update position
            buf.append( text, start, end ).append( replacement );
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


