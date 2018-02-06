public class firstIndexOfAny {

	/**	 
	 * <p>Find the last index of any of a set of potential substrings.</p>
     * <p/>
     * <p><code>null</code> String will return <code>-1</code>.</p>
	 * if the case of the substring matches that of the case within the string, return this value first.
     *
     * @param string the String to check
     * @param potentialString the Strings to search for
	 * @param numbOfStrings number of strings in potentialString
     * @return the first index of any of the potentialString in string
     * @throws NullPointerException if any of potentialString[i] is <code>null</code>
     */
    public static int setFirstindexofany( String string, String [] potentialstring, int numbOfStrings )
    {
		int notfound =-1   ;
		
        if  ( potentialstring == null ){ return notfound;
		
        } if(string ==null) return notfound;
		
		  // String's can't have a MAX_VALUEth index. So begin by initilizing resultIndex to min double value.
        int resultindex = 
		Integer.MAX_VALUE;
		
        int temp; int i;
        for ( i=0; i< numbOfStrings; i++)
        {
            temp = string.indexOf( potentialstring[i] );            
			//if a substring is found move to next searchString 
 if ( temp != -1 ){

           if ( temp > resultindex )
            {
                resultindex = temp;
            }
	}}
				if(resultindex == Integer.MAX_VALUE){return notfound;
				
				} return resultindex;
    }

}



