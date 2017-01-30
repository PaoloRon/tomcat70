package org.apache.tomcat.util.bcel;

public class ArrayConstants {

	/** The names of the access flags. */
	private final static String[] ACCESS_NAMES = { "public", "private", "protected", "static", "final", "synchronized",
			"volatile", "transient", "native", "interface", "abstract", "strictfp", "synthetic", "annotation", "enum" };

	/** The names of the types of entries in a constant pool. */
	private final static String[] CONSTANT_NAMES = { "", "CONSTANT_Utf8", "", "CONSTANT_Integer", "CONSTANT_Float",
			"CONSTANT_Long", "CONSTANT_Double", "CONSTANT_Class", "CONSTANT_String", "CONSTANT_Fieldref",
			"CONSTANT_Methodref", "CONSTANT_InterfaceMethodref", "CONSTANT_NameAndType" };

	/**
	 * The primitive type names corresponding to the T_XX constants, e.g.,
	 * TYPE_NAMES[T_INT] = "int"
	 */
	private static final String[] TYPE_NAMES = { Constants.ILLEGAL_TYPE, Constants.ILLEGAL_TYPE, Constants.ILLEGAL_TYPE,
			Constants.ILLEGAL_TYPE, "boolean", "char", "float", "double", "byte", "short", "int", "long", "void",
			"array", "object", "unknown", "address" };

	/**
	 * Number of byte code operands for each opcode, i.e., number of bytes after
	 * the tag byte itself. Indexed by opcode, so NO_OF_OPERANDS[BIPUSH] = the
	 * number of operands for a bipush instruction.
	 */
	private static final short[] NO_OF_OPERANDS = { 0/* nop */, 0/* aconst_null */, 0/* iconst_m1 */, 0/* iconst_0 */,
			0/* iconst_1 */, 0/* iconst_2 */, 0/* iconst_3 */, 0/* iconst_4 */, 0/* iconst_5 */, 0/* lconst_0 */,
			0/* lconst_1 */, 0/* fconst_0 */, 0/* fconst_1 */, 0/* fconst_2 */, 0/* dconst_0 */, 0/* dconst_1 */,
			1/* bipush */, 2/* sipush */, 1/* ldc */, 2/* ldc_w */, 2/* ldc2_w */, 1/* iload */, 1/* lload */,
			1/* fload */, 1/* dload */, 1/* aload */, 0/* iload_0 */, 0/* iload_1 */, 0/* iload_2 */, 0/* iload_3 */,
			0/* lload_0 */, 0/* lload_1 */, 0/* lload_2 */, 0/* lload_3 */, 0/* fload_0 */, 0/* fload_1 */,
			0/* fload_2 */, 0/* fload_3 */, 0/* dload_0 */, 0/* dload_1 */, 0/* dload_2 */, 0/* dload_3 */,
			0/* aload_0 */, 0/* aload_1 */, 0/* aload_2 */, 0/* aload_3 */, 0/* iaload */, 0/* laload */, 0/* faload */,
			0/* daload */, 0/* aaload */, 0/* baload */, 0/* caload */, 0/* saload */, 1/* istore */, 1/* lstore */,
			1/* fstore */, 1/* dstore */, 1/* astore */, 0/* istore_0 */, 0/* istore_1 */, 0/* istore_2 */,
			0/* istore_3 */, 0/* lstore_0 */, 0/* lstore_1 */, 0/* lstore_2 */, 0/* lstore_3 */, 0/* fstore_0 */,
			0/* fstore_1 */, 0/* fstore_2 */, 0/* fstore_3 */, 0/* dstore_0 */, 0/* dstore_1 */, 0/* dstore_2 */,
			0/* dstore_3 */, 0/* astore_0 */, 0/* astore_1 */, 0/* astore_2 */, 0/* astore_3 */, 0/* iastore */,
			0/* lastore */, 0/* fastore */, 0/* dastore */, 0/* aastore */, 0/* bastore */, 0/* castore */,
			0/* sastore */, 0/* pop */, 0/* pop2 */, 0/* dup */, 0/* dup_x1 */, 0/* dup_x2 */, 0/* dup2 */,
			0/* dup2_x1 */, 0/* dup2_x2 */, 0/* swap */, 0/* iadd */, 0/* ladd */, 0/* fadd */, 0/* dadd */,
			0/* isub */, 0/* lsub */, 0/* fsub */, 0/* dsub */, 0/* imul */, 0/* lmul */, 0/* fmul */, 0/* dmul */,
			0/* idiv */, 0/* ldiv */, 0/* fdiv */, 0/* ddiv */, 0/* irem */, 0/* lrem */, 0/* frem */, 0/* drem */,
			0/* ineg */, 0/* lneg */, 0/* fneg */, 0/* dneg */, 0/* ishl */, 0/* lshl */, 0/* ishr */, 0/* lshr */,
			0/* iushr */, 0/* lushr */, 0/* iand */, 0/* land */, 0/* ior */, 0/* lor */, 0/* ixor */, 0/* lxor */,
			2/* iinc */, 0/* i2l */, 0/* i2f */, 0/* i2d */, 0/* l2i */, 0/* l2f */, 0/* l2d */, 0/* f2i */, 0/* f2l */,
			0/* f2d */, 0/* d2i */, 0/* d2l */, 0/* d2f */, 0/* i2b */, 0/* i2c */, 0/* i2s */, 0/* lcmp */,
			0/* fcmpl */, 0/* fcmpg */, 0/* dcmpl */, 0/* dcmpg */, 2/* ifeq */, 2/* ifne */, 2/* iflt */, 2/* ifge */,
			2/* ifgt */, 2/* ifle */, 2/* if_icmpeq */, 2/* if_icmpne */, 2/* if_icmplt */, 2/* if_icmpge */,
			2/* if_icmpgt */, 2/* if_icmple */, 2/* if_acmpeq */, 2/* if_acmpne */, 2/* goto */, 2/* jsr */, 1/* ret */,
			Constants.UNPREDICTABLE, Constants.UNPREDICTABLE, 0/* ireturn */, 0/* lreturn */, 0/* freturn */,
			0/* dreturn */, 0/* areturn */, 0/* return */, 2/* getstatic */, 2/* putstatic */, 2/* getfield */,
			2/* putfield */, 2/* invokevirtual */, 2/* invokespecial */, 2/* invokestatic */, 4/* invokeinterface */,
			Constants.UNDEFINED, 2/* new */, 1/* newarray */, 2/* anewarray */, 0/* arraylength */, 0/* athrow */,
			2/* checkcast */, 2/* instanceof */, 0/* monitorenter */, 0/* monitorexit */, Constants.UNPREDICTABLE,
			3/* multianewarray */, 2/* ifnull */, 2/* ifnonnull */, 4/* goto_w */, 4/* jsr_w */, 0/* breakpoint */,
			Constants.UNDEFINED, Constants.UNDEFINED, Constants.UNDEFINED, Constants.UNDEFINED, Constants.UNDEFINED,
			Constants.UNDEFINED, Constants.UNDEFINED, Constants.UNDEFINED, Constants.UNDEFINED, Constants.UNDEFINED,
			Constants.UNDEFINED, Constants.UNDEFINED, Constants.UNDEFINED, Constants.UNDEFINED, Constants.UNDEFINED,
			Constants.UNDEFINED, Constants.UNDEFINED, Constants.UNDEFINED, Constants.UNDEFINED, Constants.UNDEFINED,
			Constants.UNDEFINED, Constants.UNDEFINED, Constants.UNDEFINED, Constants.UNDEFINED, Constants.UNDEFINED,
			Constants.UNDEFINED, Constants.UNDEFINED, Constants.UNDEFINED, Constants.UNDEFINED, Constants.UNDEFINED,
			Constants.UNDEFINED, Constants.UNDEFINED, Constants.UNDEFINED, Constants.UNDEFINED, Constants.UNDEFINED,
			Constants.UNDEFINED, Constants.UNDEFINED, Constants.UNDEFINED, Constants.UNDEFINED, Constants.UNDEFINED,
			Constants.UNDEFINED, Constants.UNDEFINED, Constants.UNDEFINED, Constants.UNDEFINED, Constants.UNDEFINED,
			Constants.UNDEFINED, Constants.UNDEFINED, Constants.UNDEFINED, Constants.UNDEFINED, Constants.UNDEFINED,
			Constants.UNDEFINED, Constants.RESERVED, Constants.RESERVED };

	/**
	 * How the byte code operands are to be interpreted for each opcode. Indexed
	 * by opcode. TYPE_OF_OPERANDS[ILOAD] = an array of shorts describing the
	 * data types for the instruction.
	 */
	private static final short[][] TYPE_OF_OPERANDS = { {}/* nop */, {}/* aconst_null */, {}/* iconst_m1 */,
			{}/* iconst_0 */, {}/* iconst_1 */, {}/* iconst_2 */, {}/* iconst_3 */, {}/* iconst_4 */, {}/* iconst_5 */,
			{}/* lconst_0 */, {}/* lconst_1 */, {}/* fconst_0 */, {}/* fconst_1 */, {}/* fconst_2 */, {}/* dconst_0 */,
			{}/* dconst_1 */, { Constants.T_BYTE }/* bipush */, { Constants.T_SHORT }/* sipush */,
			{ Constants.T_BYTE }/* ldc */, { Constants.T_SHORT }/* ldc_w */, { Constants.T_SHORT }/* ldc2_w */,
			{ Constants.T_BYTE }/* iload */, { Constants.T_BYTE }/* lload */, { Constants.T_BYTE }/* fload */,
			{ Constants.T_BYTE }/* dload */, { Constants.T_BYTE }/* aload */, {}/* iload_0 */, {}/* iload_1 */,
			{}/* iload_2 */, {}/* iload_3 */, {}/* lload_0 */, {}/* lload_1 */, {}/* lload_2 */, {}/* lload_3 */,
			{}/* fload_0 */, {}/* fload_1 */, {}/* fload_2 */, {}/* fload_3 */, {}/* dload_0 */, {}/* dload_1 */,
			{}/* dload_2 */, {}/* dload_3 */, {}/* aload_0 */, {}/* aload_1 */, {}/* aload_2 */, {}/* aload_3 */,
			{}/* iaload */, {}/* laload */, {}/* faload */, {}/* daload */, {}/* aaload */, {}/* baload */,
			{}/* caload */, {}/* saload */, { Constants.T_BYTE }/* istore */, { Constants.T_BYTE }/* lstore */,
			{ Constants.T_BYTE }/* fstore */, { Constants.T_BYTE }/* dstore */, { Constants.T_BYTE }/* astore */,
			{}/* istore_0 */, {}/* istore_1 */, {}/* istore_2 */, {}/* istore_3 */, {}/* lstore_0 */, {}/* lstore_1 */,
			{}/* lstore_2 */, {}/* lstore_3 */, {}/* fstore_0 */, {}/* fstore_1 */, {}/* fstore_2 */, {}/* fstore_3 */,
			{}/* dstore_0 */, {}/* dstore_1 */, {}/* dstore_2 */, {}/* dstore_3 */, {}/* astore_0 */, {}/* astore_1 */,
			{}/* astore_2 */, {}/* astore_3 */, {}/* iastore */, {}/* lastore */, {}/* fastore */, {}/* dastore */,
			{}/* aastore */, {}/* bastore */, {}/* castore */, {}/* sastore */, {}/* pop */, {}/* pop2 */, {}/* dup */,
			{}/* dup_x1 */, {}/* dup_x2 */, {}/* dup2 */, {}/* dup2_x1 */, {}/* dup2_x2 */, {}/* swap */, {}/* iadd */,
			{}/* ladd */, {}/* fadd */, {}/* dadd */, {}/* isub */, {}/* lsub */, {}/* fsub */, {}/* dsub */,
			{}/* imul */, {}/* lmul */, {}/* fmul */, {}/* dmul */, {}/* idiv */, {}/* ldiv */, {}/* fdiv */,
			{}/* ddiv */, {}/* irem */, {}/* lrem */, {}/* frem */, {}/* drem */, {}/* ineg */, {}/* lneg */,
			{}/* fneg */, {}/* dneg */, {}/* ishl */, {}/* lshl */, {}/* ishr */, {}/* lshr */, {}/* iushr */,
			{}/* lushr */, {}/* iand */, {}/* land */, {}/* ior */, {}/* lor */, {}/* ixor */, {}/* lxor */,
			{ Constants.T_BYTE, Constants.T_BYTE }/* iinc */, {}/* i2l */, {}/* i2f */, {}/* i2d */, {}/* l2i */,
			{}/* l2f */, {}/* l2d */, {}/* f2i */, {}/* f2l */, {}/* f2d */, {}/* d2i */, {}/* d2l */, {}/* d2f */,
			{}/* i2b */, {}/* i2c */, {}/* i2s */, {}/* lcmp */, {}/* fcmpl */, {}/* fcmpg */, {}/* dcmpl */,
			{}/* dcmpg */, { Constants.T_SHORT }/* ifeq */, { Constants.T_SHORT }/* ifne */,
			{ Constants.T_SHORT }/* iflt */, { Constants.T_SHORT }/* ifge */, { Constants.T_SHORT }/* ifgt */,
			{ Constants.T_SHORT }/* ifle */, { Constants.T_SHORT }/* if_icmpeq */, { Constants.T_SHORT }/* if_icmpne */,
			{ Constants.T_SHORT }/* if_icmplt */, { Constants.T_SHORT }/* if_icmpge */,
			{ Constants.T_SHORT }/* if_icmpgt */, { Constants.T_SHORT }/* if_icmple */,
			{ Constants.T_SHORT }/* if_acmpeq */, { Constants.T_SHORT }/* if_acmpne */, { Constants.T_SHORT }/* goto */,
			{ Constants.T_SHORT }/* jsr */, { Constants.T_BYTE }/* ret */, {}/* tableswitch */, {}/* lookupswitch */,
			{}/* ireturn */, {}/* lreturn */, {}/* freturn */, {}/* dreturn */, {}/* areturn */, {}/* return */,
			{ Constants.T_SHORT }/* getstatic */, { Constants.T_SHORT }/* putstatic */,
			{ Constants.T_SHORT }/* getfield */, { Constants.T_SHORT }/* putfield */,
			{ Constants.T_SHORT }/* invokevirtual */, { Constants.T_SHORT }/* invokespecial */,
			{ Constants.T_SHORT }/* invokestatic */,
			{ Constants.T_SHORT, Constants.T_BYTE, Constants.T_BYTE }/* invokeinterface */, {},
			{ Constants.T_SHORT }/* new */, { Constants.T_BYTE }/* newarray */, { Constants.T_SHORT }/* anewarray */,
			{}/* arraylength */, {}/* athrow */, { Constants.T_SHORT }/* checkcast */,
			{ Constants.T_SHORT }/* instanceof */, {}/* monitorenter */, {}/* monitorexit */,
			{ Constants.T_BYTE }/* wide */, { Constants.T_SHORT, Constants.T_BYTE }/* multianewarray */,
			{ Constants.T_SHORT }/* ifnull */, { Constants.T_SHORT }/* ifnonnull */, { Constants.T_INT }/* goto_w */,
			{ Constants.T_INT }/* jsr_w */, {}/* breakpoint */, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {},
			{}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {},
			{}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}/* impdep1 */, {}/* impdep2 */
	};

	/**
	 * Names of opcodes. Indexed by opcode. OPCODE_NAMES[ALOAD] = "aload".
	 */
	private static final String[] OPCODE_NAMES = { "nop", "aconst_null", "iconst_m1", "iconst_0", "iconst_1",
			"iconst_2", "iconst_3", "iconst_4", "iconst_5", "lconst_0", "lconst_1", "fconst_0", "fconst_1", "fconst_2",
			"dconst_0", "dconst_1", "bipush", "sipush", "ldc", "ldc_w", "ldc2_w", "iload", "lload", "fload", "dload",
			"aload", "iload_0", "iload_1", "iload_2", "iload_3", "lload_0", "lload_1", "lload_2", "lload_3", "fload_0",
			"fload_1", "fload_2", "fload_3", "dload_0", "dload_1", "dload_2", "dload_3", "aload_0", "aload_1",
			"aload_2", "aload_3", "iaload", "laload", "faload", "daload", "aaload", "baload", "caload", "saload",
			"istore", "lstore", "fstore", "dstore", "astore", "istore_0", "istore_1", "istore_2", "istore_3",
			"lstore_0", "lstore_1", "lstore_2", "lstore_3", "fstore_0", "fstore_1", "fstore_2", "fstore_3", "dstore_0",
			"dstore_1", "dstore_2", "dstore_3", "astore_0", "astore_1", "astore_2", "astore_3", "iastore", "lastore",
			"fastore", "dastore", "aastore", "bastore", "castore", "sastore", "pop", "pop2", "dup", "dup_x1", "dup_x2",
			"dup2", "dup2_x1", "dup2_x2", "swap", "iadd", "ladd", "fadd", "dadd", "isub", "lsub", "fsub", "dsub",
			"imul", "lmul", "fmul", "dmul", "idiv", "ldiv", "fdiv", "ddiv", "irem", "lrem", "frem", "drem", "ineg",
			"lneg", "fneg", "dneg", "ishl", "lshl", "ishr", "lshr", "iushr", "lushr", "iand", "land", "ior", "lor",
			"ixor", "lxor", "iinc", "i2l", "i2f", "i2d", "l2i", "l2f", "l2d", "f2i", "f2l", "f2d", "d2i", "d2l", "d2f",
			"i2b", "i2c", "i2s", "lcmp", "fcmpl", "fcmpg", "dcmpl", "dcmpg", "ifeq", "ifne", "iflt", "ifge", "ifgt",
			"ifle", "if_icmpeq", "if_icmpne", "if_icmplt", "if_icmpge", "if_icmpgt", "if_icmple", "if_acmpeq",
			"if_acmpne", "goto", "jsr", "ret", "tableswitch", "lookupswitch", "ireturn", "lreturn", "freturn",
			"dreturn", "areturn", "return", "getstatic", "putstatic", "getfield", "putfield", "invokevirtual",
			"invokespecial", "invokestatic", "invokeinterface", Constants.ILLEGAL_OPCODE, "new", "newarray",
			"anewarray", "arraylength", "athrow", "checkcast", "instanceof", "monitorenter", "monitorexit", "wide",
			"multianewarray", "ifnull", "ifnonnull", "goto_w", "jsr_w", "breakpoint", Constants.ILLEGAL_OPCODE,
			Constants.ILLEGAL_OPCODE, Constants.ILLEGAL_OPCODE, Constants.ILLEGAL_OPCODE, Constants.ILLEGAL_OPCODE,
			Constants.ILLEGAL_OPCODE, Constants.ILLEGAL_OPCODE, Constants.ILLEGAL_OPCODE, Constants.ILLEGAL_OPCODE,
			Constants.ILLEGAL_OPCODE, Constants.ILLEGAL_OPCODE, Constants.ILLEGAL_OPCODE, Constants.ILLEGAL_OPCODE,
			Constants.ILLEGAL_OPCODE, Constants.ILLEGAL_OPCODE, Constants.ILLEGAL_OPCODE, Constants.ILLEGAL_OPCODE,
			Constants.ILLEGAL_OPCODE, Constants.ILLEGAL_OPCODE, Constants.ILLEGAL_OPCODE, Constants.ILLEGAL_OPCODE,
			Constants.ILLEGAL_OPCODE, Constants.ILLEGAL_OPCODE, Constants.ILLEGAL_OPCODE, Constants.ILLEGAL_OPCODE,
			Constants.ILLEGAL_OPCODE, Constants.ILLEGAL_OPCODE, Constants.ILLEGAL_OPCODE, Constants.ILLEGAL_OPCODE,
			Constants.ILLEGAL_OPCODE, Constants.ILLEGAL_OPCODE, Constants.ILLEGAL_OPCODE, Constants.ILLEGAL_OPCODE,
			Constants.ILLEGAL_OPCODE, Constants.ILLEGAL_OPCODE, Constants.ILLEGAL_OPCODE, Constants.ILLEGAL_OPCODE,
			Constants.ILLEGAL_OPCODE, Constants.ILLEGAL_OPCODE, Constants.ILLEGAL_OPCODE, Constants.ILLEGAL_OPCODE,
			Constants.ILLEGAL_OPCODE, Constants.ILLEGAL_OPCODE, Constants.ILLEGAL_OPCODE, Constants.ILLEGAL_OPCODE,
			Constants.ILLEGAL_OPCODE, Constants.ILLEGAL_OPCODE, Constants.ILLEGAL_OPCODE, Constants.ILLEGAL_OPCODE,
			Constants.ILLEGAL_OPCODE, Constants.ILLEGAL_OPCODE, "impdep1", "impdep2" };

	// TOFO: FIXXXXX
	private static final String[] ATTRIBUTE_NAMES = { "SourceFile", "ConstantValue", "Code", "Exceptions",
			"LineNumberTable", "LocalVariableTable", "InnerClasses", "Synthetic", "Deprecated", "PMGClass", "Signature",
			"StackMap", "RuntimeVisibleAnnotations", "RuntimeInvisibleAnnotations",
			"RuntimeVisibleParameterAnnotations", "RuntimeInvisibleParameterAnnotations", "AnnotationDefault",
			"LocalVariableTypeTable", "EnclosingMethod", "StackMapTable" };

	private static final String[] ITEM_NAMES = {
	    "Bogus", "Integer", "Float", "Double", "Long",
	    "Null", "InitObject", "Object", "NewObject" 
	  };

	private ArrayConstants() {
		super();
	}

	public static String[] getAccessNames() {
		return ACCESS_NAMES;
	}

	public static String[] getConstantNames() {
		return CONSTANT_NAMES;
	}

	public static String[] getTypeNames() {
		return TYPE_NAMES;
	}

	public static short[] getNoOfOperands() {
		return NO_OF_OPERANDS;
	}

	public static short[][] getTypeOfOperands() {
		return TYPE_OF_OPERANDS;
	}

	public static String[] getOpcodeNames() {
		return OPCODE_NAMES;
	}

	public static String[] getAttributeNames() {
		return ATTRIBUTE_NAMES;
	}

	public static String[] getItemNames() {
		return ITEM_NAMES;
	}

}
