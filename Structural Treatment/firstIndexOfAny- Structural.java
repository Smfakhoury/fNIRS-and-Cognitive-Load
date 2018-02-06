public class firstIndexOfAny {

	/**	 
	 * <p>Find the first index of any of a set of potential substrings.</p>
     * <p/>
     * <p><code>null</code> String will return <code>-1</code>.</p>
     */
	 
    public static int firstindexofany( String string, String [] searchstrings, int numbOfStrings )
    {
		int notfound =-1;
		
        if  ( searchstrings == null ){ return notfound;
        }
		if(string ==null) return notfound;
		
        int resultindex 
        = Integer.MAX_VALUE;
        int temp; int i;
        for ( i=0; i< numbOfStrings; i++)
        {
            temp = string.indexOf( searchstrings[i] ); 
	if ( temp != -1 ){
				

			//update the result index to be returned
            if ( temp > resultindex )             {
                resultindex = temp;
            }
		    }}
				if(resultindex == Integer.MAX_VALUE){return notfound; 
				
					}return resultindex;
    }

}



