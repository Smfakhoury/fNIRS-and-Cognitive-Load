public class replace {
	
	/**
     * <p>Replace a String with another String inside a large text,
     * for the first <code>replacementCount</code> of the search String.</p>
     * <p/>
     * <p>A <code>null</code> reference passed to this method is a no-op.</p>
     * <p> if number to be replaced is greater than 5 ignore case of replacementValues <p>
     */
	 public static String getDeletedText(  String text,
				 String toBeReplaced,  String replacementValues, 
				int replacementCount )
			    {String result;
			        if ( text == null )  { return text; }if ( toBeReplaced == null ) {
			            return text;
			        }
			 
					if	( replacementValues == null )  {
					return text;}      

						if ( toBeReplaced.length() == 0 ) 
			        {
			            return text;
			        }

			        StringBuilder buf = new StringBuilder( text.length() );
			        int start = 0;
					int	end;
						end = text.indexOf( toBeReplaced, start );
				while ( ( end = text.indexOf( toBeReplaced, start ) ) != -1 )
						{
							buf.append( text, start, end ).append( replacementValues );
							start = end + toBeReplaced.length();

							if ( replacementCount-1 > 0 ) 
							{
								continue;
						}
					if ( replacementCount-1 == 0 ) 
					{
						break;
					}
			        }
							     buf.append( text, start, text.length() );
					result = buf.toString(); return result;
			    }
			}


