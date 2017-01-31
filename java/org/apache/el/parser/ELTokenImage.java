package org.apache.el.parser;

public class ELTokenImage {

	 /** Literal token values. */
	
	private static String[] tokenImage = {
		    "<EOF>",
		    "<LITERAL_EXPRESSION>",
		    "\"${\"",
		    "\"#{\"",
		    "\" \"",
		    "\"\\t\"",
		    "\"\\n\"",
		    "\"\\r\"",
		    "<INTEGER_LITERAL>",
		    "<FLOATING_POINT_LITERAL>",
		    "<EXPONENT>",
		    "<STRING_LITERAL>",
		    "\"true\"",
		    "\"false\"",
		    "\"null\"",
		    "\"}\"",
		    "\".\"",
		    "\"(\"",
		    "\")\"",
		    "\"[\"",
		    "\"]\"",
		    "\":\"",
		    "\",\"",
		    "\">\"",
		    "\"gt\"",
		    "\"<\"",
		    "\"lt\"",
		    "\">=\"",
		    "\"ge\"",
		    "\"<=\"",
		    "\"le\"",
		    "\"==\"",
		    "\"eq\"",
		    "\"!=\"",
		    "\"ne\"",
		    "\"!\"",
		    "\"not\"",
		    "\"&&\"",
		    "\"and\"",
		    "\"||\"",
		    "\"or\"",
		    "\"empty\"",
		    "\"instanceof\"",
		    "\"*\"",
		    "\"+\"",
		    "\"-\"",
		    "\"?\"",
		    "\"/\"",
		    "\"div\"",
		    "\"%\"",
		    "\"mod\"",
		    "<IDENTIFIER>",
		    "<FUNCTIONSUFFIX>",
		    "\"#\"",
		    "<LETTER>",
		    "<DIGIT>",
		    "<ILLEGAL_CHARACTER>",
		  };

	private ELTokenImage() {
		super();
	}

	public static String[] getTokenImage() {
		return tokenImage;
	}


}
