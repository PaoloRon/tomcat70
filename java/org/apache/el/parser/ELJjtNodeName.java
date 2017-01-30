package org.apache.el.parser;

public class ELJjtNodeName {

	private static String[] jjtNodeName = {
		    "CompositeExpression",
		    "LiteralExpression",
		    "DeferredExpression",
		    "DynamicExpression",
		    "void",
		    "Choice",
		    "Or",
		    "And",
		    "Equal",
		    "NotEqual",
		    "LessThan",
		    "GreaterThan",
		    "LessThanEqual",
		    "GreaterThanEqual",
		    "Plus",
		    "Minus",
		    "Mult",
		    "Div",
		    "Mod",
		    "Negative",
		    "Not",
		    "Empty",
		    "Value",
		    "DotSuffix",
		    "BracketSuffix",
		    "MethodParameters",
		    "Identifier",
		    "Function",
		    "True",
		    "False",
		    "FloatingPoint",
		    "Integer",
		    "String",
		    "Null",
		  };


	private ELJjtNodeName() {
		super();
	}
	
	public static String[] getJjtNodeName() {
		return jjtNodeName;
	}

}
