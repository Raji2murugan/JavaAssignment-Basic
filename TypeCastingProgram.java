package javaAssignmentBasic;

/**
  2. Write a program to demonstrate compatible type conversions. For example, float to int, double to float, int to short
 */
public class TypeCastingProgram {

    public static void main(String[] args) {
        // Data Types are : boolean, byte, short, char, int, float, long, double;

        boolean boolValue = false;
        byte byteValue = 126;
        short shortValue = 170;
        char character = 'R';
        int intValue = 260;
        float floatValue = 1579.00f;
        long longValue = 995287654L;
        double doubleValue = 10034567.00;

        // Demonstrating type conversions
        System.out.println("__________________________________________");
        byteToAll(byteValue);
        
        System.out.println("__________________________________________");
        shortToAll(shortValue);
        System.out.println("__________________________________________");

        charToAll(character);
        System.out.println("__________________________________________");

        intToAll(intValue);
        System.out.println("__________________________________________");

        floatToAll(floatValue);
        System.out.println("__________________________________________");

        longToAll(longValue);
        System.out.println("__________________________________________");

        doubleToAll(doubleValue);
        System.out.println("__________________________________________");

    }

    private static void byteToAll(byte byteValue) {
        short shortValue = byteValue;
        char character=(char) byteValue;
        int intValue = byteValue;
        long longValue = byteValue;
        float floatValue = byteValue;
        double doubleValue = byteValue;
        
        System.out.println("Byte to others:"+byteValue);
        System.out.println("Short: " + shortValue);
        System.out.println("char: "+character);
        System.out.println("Int: " + intValue);
        System.out.println("Long: " + longValue);
        System.out.println("Float: " + floatValue);
        System.out.println("Double: " + doubleValue);
        System.out.println();
    }
   //_____________________________________________________________________________________________________________________---

    private static void shortToAll(short shortValue) {
    	byte byteValue=(byte)shortValue;
    	char character=(char) shortValue;
        int intValue = shortValue;
        long longValue = shortValue;
        float floatValue = shortValue;
        double doubleValue = shortValue;

        System.out.println("Short to others:"+shortValue);
        System.out.println("byte: " + byteValue);
        System.out.println("char: "+character);
        System.out.println("Int: " + intValue);
        System.out.println("Long: " + longValue);
        System.out.println("Float: " + floatValue);
        System.out.println("Double: " + doubleValue);
          System.out.println();
    }
    //____________________________________________________________________________________________________

    private static void charToAll(char character) {
    	byte byteValue=(byte)character;
    	short shortValue=(short) character;
        int intValue = character;
        long longValue = character;
        float floatValue = character;
        double doubleValue = character;

        System.out.println("Char to others:"+character);
        System.out.println("byte: "+byteValue);
        System.out.println("Short: " + shortValue);      
        System.out.println("Int: " + intValue);
        System.out.println("Long: " + longValue);
        System.out.println("Float: " + floatValue);
        System.out.println("Double: " + doubleValue);
       System.out.println();
    }
    
    //________________________________________________________________________________________

    private static void intToAll(int intValue) {
    	byte byteValue=(byte) intValue;
        short shortValue = (short) intValue;
        char character=(char) intValue;
        long longValue = intValue;
        float floatValue = intValue;
        double doubleValue = intValue;

        System.out.println("Int to others:"+intValue);
        System.out.println("byte:"+byteValue);
        System.out.println("Short: " + shortValue);
        System.out.println("char: "+character);
           System.out.println("Long: " + longValue);
        System.out.println("Float: " + floatValue);
        System.out.println("Double: " + doubleValue);
       System.out.println();
    }
    
    //__________________________________________________________________________________

    private static void floatToAll(float floatValue) {
    	byte byteValue=(byte) floatValue;
        short shortValue = (short) floatValue;
        char character=(char) floatValue;
        long longValue = (long) floatValue;
        int intValue = (int) floatValue;
        double doubleValue = floatValue;

        System.out.println("float to others:"+floatValue);
        System.out.println("byte:"+byteValue);
        System.out.println("Short: " + shortValue);
        System.out.println("char: "+character);
           System.out.println("Long: " + longValue);
        System.out.println("int: " + intValue);
        System.out.println("Double: " + doubleValue);
       System.out.println();
    }
    //__________________________________________________________________________

    private static void longToAll(long longValue) {
    	byte byteValue=(byte) longValue;
        short shortValue = (short) longValue;
        char character=(char) longValue;
        int intValue = (int) longValue;
        float floatValue = longValue;
        double doubleValue = longValue;

        System.out.println("long to others:"+longValue);
        System.out.println("byte:"+byteValue);
        System.out.println("Short: " + shortValue);
        System.out.println("char: "+character);
           System.out.println("int: " + intValue);
        System.out.println("Float: " + floatValue);
        System.out.println("Double: " + doubleValue);
       System.out.println();
    }
    //____________________________________________________________________

    private static void doubleToAll(double doubleValue) {
    	byte byteValue=(byte) doubleValue;
        short shortValue = (short) doubleValue;
        char character=(char) doubleValue;
        long longValue = (long) doubleValue;
        float floatValue = (float) doubleValue;
        int intValue = (int) doubleValue;

        System.out.println("double to others:"+doubleValue);
        System.out.println("byte:"+byteValue);
        System.out.println("Short: " + shortValue);
        System.out.println("char: "+character);
           System.out.println("Long: " + longValue);
        System.out.println("Float: " + floatValue);
        System.out.println("int: " + intValue);
       System.out.println();
    }
}
/**
 output:
__________________________________________
Byte to others:126
Short: 126
char: ~
Int: 126
Long: 126
Float: 126.0
Double: 126.0

__________________________________________
Short to others:170
byte: -86
char: ª
Int: 170
Long: 170
Float: 170.0
Double: 170.0

__________________________________________
Char to others:R
byte: 82
Short: 82
Int: 82
Long: 82
Float: 82.0
Double: 82.0

__________________________________________
Int to others:260
byte:4
Short: 260
char: Ą
Long: 260
Float: 260.0
Double: 260.0

__________________________________________
float to others:1579.0
byte:43
Short: 1579
char: ث
Long: 1579
int: 1579
Double: 1579.0

__________________________________________
long to others:995287654
byte:102
Short: -7578
char: 
int: 995287654
Float: 9.9528768E8
Double: 9.95287654E8

__________________________________________
double to others:1.0034567E7
byte:-121
Short: 7559
char: ᶇ
Long: 10034567
Float: 1.0034567E7
int: 10034567

__________________________________________
*/

