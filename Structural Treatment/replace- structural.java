public class replace {
	
	public static String findAndReplace(  String text,
			 String toBeReplaced,  String replacement, 
			int replacementCount )
		    {String result=
		  "";
		        if ( text == null )  { return text; }if ( toBeReplaced == null ) {
		            return text;
		        }
		 
				if	( replacement == null )  {
				
					
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
						buf.append( text, start, end ).append( replacement );
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
				result += buf.toString();
		        return result;
		    }
}