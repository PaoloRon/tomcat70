/*
 *  Licensed to the Apache Software Foundation (ASF) under one or more
 *  contributor license agreements.  See the NOTICE file distributed with
 *  this work for additional information regarding copyright ownership.
 *  The ASF licenses this file to You under the Apache License, Version 2.0
 *  (the "License"); you may not use this file except in compliance with
 *  the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License. 
 *
 */
package org.apache.tomcat.util.bcel;

/**
 * Constants for the project, mostly defined in the JVM specification.
 *
 * @version $Id$
 * @author  <A HREF="mailto:m.dahm@gmx.de">M. Dahm</A>
 */
public interface Constants {

    /** One of the access flags for fields, methods, or classes.
   *  @see #ACC_PUBLIC
   */
  public final static short ACC_FINAL        = 0x0010;

  /** One of the access flags for fields, methods, or classes.
   *  @see #ACC_PUBLIC
   */
  public final static short ACC_INTERFACE    = 0x0200;

  /** One of the access flags for fields, methods, or classes.
   *  @see #ACC_PUBLIC
   */
  public final static short ACC_ABSTRACT     = 0x0400;

  /** One of the access flags for fields, methods, or classes.
   *  @see #ACC_PUBLIC
   */
  public final static short ACC_ENUM         = 0x4000;

  // Applies to classes compiled by new compilers only
  /** One of the access flags for fields, methods, or classes.
   *  @see #ACC_PUBLIC
   */
  public final static short ACC_SUPER        = 0x0020;

  /** One of the access flags for fields, methods, or classes.
   *  @see #ACC_PUBLIC
   */
  public final static short MAX_ACC_FLAG     = ACC_ENUM;

  /** Marks a constant pool entry as type UTF-8.  */
  public final static byte CONSTANT_Utf8               = 1;

  /** Marks a constant pool entry as type Integer.  */
  public final static byte CONSTANT_Integer            = 3;

  /** Marks a constant pool entry as type Float.  */
  public final static byte CONSTANT_Float              = 4;

  /** Marks a constant pool entry as type Long.  */
  public final static byte CONSTANT_Long               = 5;

  /** Marks a constant pool entry as type Double.  */
  public final static byte CONSTANT_Double             = 6;

  /** Marks a constant pool entry as a Class.  */
  public final static byte CONSTANT_Class              = 7;

  /** Marks a constant pool entry as a Field Reference.  */
  public final static byte CONSTANT_Fieldref           = 9;

  /** Marks a constant pool entry as type String.  */
  public final static byte CONSTANT_String             = 8;

  /** Marks a constant pool entry as a Method Reference.  */
  public final static byte CONSTANT_Methodref          = 10;

  /** Marks a constant pool entry as an Interface Method Reference.  */
  public final static byte CONSTANT_InterfaceMethodref = 11;

  /** Marks a constant pool entry as a name and type.  */
  public final static byte CONSTANT_NameAndType        = 12;
  
  /** Java VM opcode.
   * @see <a href="http://java.sun.com/docs/books/jvms/second_edition/html/Instructions2.doc.html">Opcode definitions in The Java Virtual Machine Specification</a> */
  public static final short LDC              = 18;
  /** Java VM opcode.
   * @see <a href="http://java.sun.com/docs/books/jvms/second_edition/html/Instructions2.doc.html">Opcode definitions in The Java Virtual Machine Specification</a> */
  public static final short LDC_W            = 19;
  /** Java VM opcode.
   * @see <a href="http://java.sun.com/docs/books/jvms/second_edition/html/Instructions2.doc.html">Opcode definitions in The Java Virtual Machine Specification</a> */
  public static final short LDC2_W           = 20;
  /** Java VM opcode.
   * @see <a href="http://java.sun.com/docs/books/jvms/second_edition/html/Instructions2.doc.html">Opcode definitions in The Java Virtual Machine Specification</a> */
  public static final short ILOAD            = 21;
  /** Java VM opcode.
   * @see <a href="http://java.sun.com/docs/books/jvms/second_edition/html/Instructions2.doc.html">Opcode definitions in The Java Virtual Machine Specification</a> */
  public static final short LLOAD            = 22;
  /** Java VM opcode.
   * @see <a href="http://java.sun.com/docs/books/jvms/second_edition/html/Instructions2.doc.html">Opcode definitions in The Java Virtual Machine Specification</a> */
  public static final short FLOAD            = 23;
  /** Java VM opcode.
   * @see <a href="http://java.sun.com/docs/books/jvms/second_edition/html/Instructions2.doc.html">Opcode definitions in The Java Virtual Machine Specification</a> */
  public static final short DLOAD            = 24;
  /** Java VM opcode.
   * @see <a href="http://java.sun.com/docs/books/jvms/second_edition/html/Instructions2.doc.html">Opcode definitions in The Java Virtual Machine Specification</a> */
  public static final short ALOAD            = 25;

  /** Java VM opcode.
   * @see <a href="http://java.sun.com/docs/books/jvms/second_edition/html/Instructions2.doc.html">Opcode definitions in The Java Virtual Machine Specification</a> */
  public static final short ISTORE           = 54;
  /** Java VM opcode.
   * @see <a href="http://java.sun.com/docs/books/jvms/second_edition/html/Instructions2.doc.html">Opcode definitions in The Java Virtual Machine Specification</a> */
  public static final short LSTORE           = 55;
  /** Java VM opcode.
   * @see <a href="http://java.sun.com/docs/books/jvms/second_edition/html/Instructions2.doc.html">Opcode definitions in The Java Virtual Machine Specification</a> */
  public static final short FSTORE           = 56;
  /** Java VM opcode.
   * @see <a href="http://java.sun.com/docs/books/jvms/second_edition/html/Instructions2.doc.html">Opcode definitions in The Java Virtual Machine Specification</a> */
  public static final short DSTORE           = 57;
  /** Java VM opcode.
   * @see <a href="http://java.sun.com/docs/books/jvms/second_edition/html/Instructions2.doc.html">Opcode definitions in The Java Virtual Machine Specification</a> */
  public static final short ASTORE           = 58;
  
  /** Java VM opcode.
   * @see <a href="http://java.sun.com/docs/books/jvms/second_edition/html/Instructions2.doc.html">Opcode definitions in The Java Virtual Machine Specification</a> */
  public static final short IINC             = 132;
  
  /** Java VM opcode.
   * @see <a href="http://java.sun.com/docs/books/jvms/second_edition/html/Instructions2.doc.html">Opcode definitions in The Java Virtual Machine Specification</a> */
  public static final short IFEQ             = 153;
  /** Java VM opcode.
   * @see <a href="http://java.sun.com/docs/books/jvms/second_edition/html/Instructions2.doc.html">Opcode definitions in The Java Virtual Machine Specification</a> */
  public static final short IFNE             = 154;
  /** Java VM opcode.
   * @see <a href="http://java.sun.com/docs/books/jvms/second_edition/html/Instructions2.doc.html">Opcode definitions in The Java Virtual Machine Specification</a> */
  public static final short IFLT             = 155;
  /** Java VM opcode.
   * @see <a href="http://java.sun.com/docs/books/jvms/second_edition/html/Instructions2.doc.html">Opcode definitions in The Java Virtual Machine Specification</a> */
  public static final short IFGE             = 156;
  /** Java VM opcode.
   * @see <a href="http://java.sun.com/docs/books/jvms/second_edition/html/Instructions2.doc.html">Opcode definitions in The Java Virtual Machine Specification</a> */
  public static final short IFGT             = 157;
  /** Java VM opcode.
   * @see <a href="http://java.sun.com/docs/books/jvms/second_edition/html/Instructions2.doc.html">Opcode definitions in The Java Virtual Machine Specification</a> */
  public static final short IFLE             = 158;
  /** Java VM opcode.
   * @see <a href="http://java.sun.com/docs/books/jvms/second_edition/html/Instructions2.doc.html">Opcode definitions in The Java Virtual Machine Specification</a> */
  public static final short IF_ICMPEQ        = 159;
  /** Java VM opcode.
   * @see <a href="http://java.sun.com/docs/books/jvms/second_edition/html/Instructions2.doc.html">Opcode definitions in The Java Virtual Machine Specification</a> */
  public static final short IF_ICMPNE        = 160;
  /** Java VM opcode.
   * @see <a href="http://java.sun.com/docs/books/jvms/second_edition/html/Instructions2.doc.html">Opcode definitions in The Java Virtual Machine Specification</a> */
  public static final short IF_ICMPLT        = 161;
  /** Java VM opcode.
   * @see <a href="http://java.sun.com/docs/books/jvms/second_edition/html/Instructions2.doc.html">Opcode definitions in The Java Virtual Machine Specification</a> */
  public static final short IF_ICMPGE        = 162;
  /** Java VM opcode.
   * @see <a href="http://java.sun.com/docs/books/jvms/second_edition/html/Instructions2.doc.html">Opcode definitions in The Java Virtual Machine Specification</a> */
  public static final short IF_ICMPGT        = 163;
  /** Java VM opcode.
   * @see <a href="http://java.sun.com/docs/books/jvms/second_edition/html/Instructions2.doc.html">Opcode definitions in The Java Virtual Machine Specification</a> */
  public static final short IF_ICMPLE        = 164;
  /** Java VM opcode.
   * @see <a href="http://java.sun.com/docs/books/jvms/second_edition/html/Instructions2.doc.html">Opcode definitions in The Java Virtual Machine Specification</a> */
  public static final short IF_ACMPEQ        = 165;
  /** Java VM opcode.
   * @see <a href="http://java.sun.com/docs/books/jvms/second_edition/html/Instructions2.doc.html">Opcode definitions in The Java Virtual Machine Specification</a> */
  public static final short IF_ACMPNE        = 166;
  /** Java VM opcode.
   * @see <a href="http://java.sun.com/docs/books/jvms/second_edition/html/Instructions2.doc.html">Opcode definitions in The Java Virtual Machine Specification</a> */
  public static final short GOTO             = 167;
  /** Java VM opcode.
   * @see <a href="http://java.sun.com/docs/books/jvms/second_edition/html/Instructions2.doc.html">Opcode definitions in The Java Virtual Machine Specification</a> */
  public static final short JSR              = 168;
  /** Java VM opcode.
   * @see <a href="http://java.sun.com/docs/books/jvms/second_edition/html/Instructions2.doc.html">Opcode definitions in The Java Virtual Machine Specification</a> */
  public static final short RET              = 169;
  /** Java VM opcode.
   * @see <a href="http://java.sun.com/docs/books/jvms/second_edition/html/Instructions2.doc.html">Opcode definitions in The Java Virtual Machine Specification</a> */
  public static final short TABLESWITCH      = 170;
  /** Java VM opcode.
   * @see <a href="http://java.sun.com/docs/books/jvms/second_edition/html/Instructions2.doc.html">Opcode definitions in The Java Virtual Machine Specification</a> */
  public static final short LOOKUPSWITCH     = 171;
  /** Java VM opcode.
   * @see <a href="http://java.sun.com/docs/books/jvms/second_edition/html/Instructions2.doc.html">Opcode definitions in The Java Virtual Machine Specification</a> */
  public static final short GETSTATIC        = 178;
  /** Java VM opcode.
   * @see <a href="http://java.sun.com/docs/books/jvms/second_edition/html/Instructions2.doc.html">Opcode definitions in The Java Virtual Machine Specification</a> */
  public static final short PUTSTATIC        = 179;
  /** Java VM opcode.
   * @see <a href="http://java.sun.com/docs/books/jvms/second_edition/html/Instructions2.doc.html">Opcode definitions in The Java Virtual Machine Specification</a> */
  public static final short GETFIELD         = 180;
  /** Java VM opcode.
   * @see <a href="http://java.sun.com/docs/books/jvms/second_edition/html/Instructions2.doc.html">Opcode definitions in The Java Virtual Machine Specification</a> */
  public static final short PUTFIELD         = 181;
  /** Java VM opcode.
   * @see <a href="http://java.sun.com/docs/books/jvms/second_edition/html/Instructions2.doc.html">Opcode definitions in The Java Virtual Machine Specification</a> */
  public static final short INVOKEVIRTUAL    = 182;
  /** Java VM opcode.
   * @see <a href="http://java.sun.com/docs/books/jvms/second_edition/html/Instructions2.doc.html">Opcode definitions in The Java Virtual Machine Specification</a> */
  public static final short INVOKESPECIAL    = 183;
  
  /** Java VM opcode.
   * @see <a href="http://java.sun.com/docs/books/jvms/second_edition/html/Instructions2.doc.html">Opcode definitions in The Java Virtual Machine Specification</a> */
  public static final short INVOKESTATIC     = 184;
  /** Java VM opcode.
   * @see <a href="http://java.sun.com/docs/books/jvms/second_edition/html/Instructions2.doc.html">Opcode definitions in The Java Virtual Machine Specification</a> */
  public static final short INVOKEINTERFACE  = 185;
  
  /** Java VM opcode.
   * @see <a href="http://java.sun.com/docs/books/jvms/second_edition/html/Instructions2.doc.html">Opcode definitions in The Java Virtual Machine Specification</a> */
  public static final short NEW              = 187;
  /** Java VM opcode.
   * @see <a href="http://java.sun.com/docs/books/jvms/second_edition/html/Instructions2.doc.html">Opcode definitions in The Java Virtual Machine Specification</a> */
  public static final short NEWARRAY         = 188;
  /** Java VM opcode.
   * @see <a href="http://java.sun.com/docs/books/jvms/second_edition/html/Instructions2.doc.html">Opcode definitions in The Java Virtual Machine Specification</a> */
  public static final short ANEWARRAY        = 189;
  
  /** Java VM opcode.
   * @see <a href="http://java.sun.com/docs/books/jvms/second_edition/html/Instructions2.doc.html">Opcode definitions in The Java Virtual Machine Specification</a> */
  public static final short CHECKCAST        = 192;
  /** Java VM opcode.
   * @see <a href="http://java.sun.com/docs/books/jvms/second_edition/html/Instructions2.doc.html">Opcode definitions in The Java Virtual Machine Specification</a> */
  public static final short INSTANCEOF       = 193;
  
  /** Java VM opcode.
   * @see <a href="http://java.sun.com/docs/books/jvms/second_edition/html/Instructions2.doc.html">Opcode definitions in The Java Virtual Machine Specification</a> */
  public static final short WIDE             = 196;
  /** Java VM opcode.
   * @see <a href="http://java.sun.com/docs/books/jvms/second_edition/html/Instructions2.doc.html">Opcode definitions in The Java Virtual Machine Specification</a> */
  public static final short MULTIANEWARRAY   = 197;
  /** Java VM opcode.
   * @see <a href="http://java.sun.com/docs/books/jvms/second_edition/html/Instructions2.doc.html">Opcode definitions in The Java Virtual Machine Specification</a> */
  public static final short IFNULL           = 198;
  /** Java VM opcode.
   * @see <a href="http://java.sun.com/docs/books/jvms/second_edition/html/Instructions2.doc.html">Opcode definitions in The Java Virtual Machine Specification</a> */
  public static final short IFNONNULL        = 199;
  /** Java VM opcode.
   * @see <a href="http://java.sun.com/docs/books/jvms/second_edition/html/Instructions2.doc.html">Opcode definitions in The Java Virtual Machine Specification</a> */
  public static final short GOTO_W           = 200;
  /** Java VM opcode.
   * @see <a href="http://java.sun.com/docs/books/jvms/second_edition/html/Instructions2.doc.html">Opcode definitions in The Java Virtual Machine Specification</a> */
  public static final short JSR_W            = 201;

  /** Illegal opcode. */
  public static final short  UNDEFINED      = -1;
  /** Illegal opcode. */
  public static final short  UNPREDICTABLE  = -2;
  /** Illegal opcode. */
  public static final short  RESERVED       = -3;
  /** Mnemonic for an illegal opcode. */
  public static final String ILLEGAL_OPCODE = "<illegal opcode>";
  /** Mnemonic for an illegal type. */
  public static final String ILLEGAL_TYPE   = "<illegal type>";

  /** Byte data type. */
  public static final byte T_BYTE    = 8;
  /** Short data type. */
  public static final byte T_SHORT   = 9;
  /** Int data type. */
  public static final byte T_INT     = 10;
  
  
  /** Unknown data type. */
  public static final byte T_UNKNOWN   = 15;
   

  /** Attributes and their corresponding names.
   */
  public static final byte ATTR_UNKNOWN                       			= -1;
  public static final byte ATTR_SOURCE_FILE                   			= 0;
  public static final byte ATTR_CONSTANT_VALUE                			= 1;
  public static final byte ATTR_CODE                          			= 2;
  public static final byte ATTR_EXCEPTIONS                    			= 3;
  public static final byte ATTR_LINE_NUMBER_TABLE             			= 4;
  public static final byte ATTR_LOCAL_VARIABLE_TABLE          			= 5;
  public static final byte ATTR_INNER_CLASSES                 			= 6;
  public static final byte ATTR_SYNTHETIC                     			= 7;
  public static final byte ATTR_DEPRECATED                    			= 8;
  public static final byte ATTR_PMG                           			= 9;
  public static final byte ATTR_SIGNATURE                     			= 10;
  public static final byte ATTR_STACK_MAP                     			= 11;
  public static final byte ATTR_RUNTIME_VISIBLE_ANNOTATIONS    			= 12;
  public static final byte ATTR_RUNTIMEIN_VISIBLE_ANNOTATIONS  			= 13;
  public static final byte ATTR_RUNTIME_VISIBLE_PARAMETER_ANNOTATIONS 	= 14;
  public static final byte ATTR_RUNTIMEIN_VISIBLE_PARAMETER_ANNOTATIONS = 15;
  public static final byte ATTR_ANNOTATION_DEFAULT                      = 16;
  public static final byte ATTR_LOCAL_VARIABLE_TYPE_TABLE               = 17;
  public static final byte ATTR_ENCLOSING_METHOD                      	= 18;
  public static final byte ATTR_STACK_MAP_TABLE                         = 19;

  public static final short KNOWN_ATTRIBUTES = 20;

  /** Constants used in the StackMap attribute.
   */
  public static final byte ITEM_Bogus      = 0;
  public static final byte ITEM_Object     = 7;
  public static final byte ITEM_NewObject  = 8;
  
  /** Constants used to identify StackMapEntry types.
   * 
   * For those types which can specify a range, the 
   * constant names the lowest value.
   */
  public static final int SAME_FRAME = 0; 
  public static final int SAME_LOCALS_1_STACK_ITEM_FRAME = 64; 
  public static final int SAME_LOCALS_1_STACK_ITEM_FRAME_EXTENDED = 247; 
  public static final int CHOP_FRAME = 248; 
  public static final int SAME_FRAME_EXTENDED = 251; 
  public static final int APPEND_FRAME = 252; 
  public static final int FULL_FRAME = 255; 
  
  /** Constants that define the maximum value of 
   * those constants which store ranges. */
  
  public static final int SAME_FRAME_MAX = 63;
  public static final int SAME_LOCALS_1_STACK_ITEM_FRAME_MAX = 127;
  public static final int CHOP_FRAME_MAX = 250;
  public static final int APPEND_FRAME_MAX = 254;
}
