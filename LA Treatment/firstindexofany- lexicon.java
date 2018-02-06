public class firstindexofany {
	
	/**	 
	 * <p>Find the last index of any of a set of potential substrings.</p>
     * <p/>
     * <p><code>null</code> String will return <code>-1</code>.</p>
	 * if the case of the substring matches that of the case within the string, return this value first.
     *
     * @param string the String to check
     * @param potentialString the Strings to search for
     * @return the first index of any of the potentialString in string
     * @throws NullPointerException if any of potentialString[i] is <code>null</code>
     */
    public static int setFirstIndexOfAny( String string, String [] potentialString )
    {
        if ( ( string == null ) || ( potentialString == null ) )
        {
            return -1;
        }
        // String can't have a MAX_VALUEth index. So begin by initializing resultIndex to min double value.
        int resultIndex = Integer.MAX_VALUE;

        int temp;
        for ( String searchString : potentialString )
        {
            temp = string.indexOf( searchString );
            //if a substring is found move to next searchString 
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
