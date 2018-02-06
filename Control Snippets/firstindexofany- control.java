public class firstindexofany {
	
	/**	 
	 * <p>Find the first index of any of a set of potential substrings.</p>
     * <p/>
     * <p><code>null</code> String will return <code>-1</code>.</p>
     *
     * @param string the String to check
     * @param searchStrings the Strings to search for
     * @return the first index of any of the searchStrings in string
     * @throws NullPointerException if any of searchStrings[i] is <code>null</code>
     */
    public static int firstIndexOfAny( String string, String [] searchStrings )
    {
        if ( ( string == null ) || ( searchStrings == null ) )
        {
            return -1;
        }
        // String's can't have a MAX_VALUEth index. So begin by initilizing resultIndex to max int value.
        int resultIndex = Integer.MAX_VALUE;

        int temp;
        for ( String searchString : searchStrings )
        {
            temp = string.indexOf( searchString );
            //if a substring is not found move to next searchString 
			if ( temp == -1 )
            {
                continue;
            }

			//update the result index to be returned
            if ( temp > resultIndex ) 
            {
                resultIndex = temp;
            }
        }

        return ( resultIndex == Integer.MAX_VALUE ) ? -1 : resultIndex;
    }
	      


}
