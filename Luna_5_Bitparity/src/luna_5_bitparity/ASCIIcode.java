/*******************************************************************************
 * Program Filename : Luna_5_BitParity.java
 * Author : Luna, Andrew
 * Date : MAy 11th, 2017
 * Description : creates a class constructor to hold and get ascii and binary values
 * Input : none
 * Output : ascii and binary values
 ******************************************************************************/
package luna_5_bitparity;
public class ASCIIcode {
    String asciinum;
    String binaryval;
    public ASCIIcode(String b , String c){
        asciinum = b;
        binaryval = c;
    }

    public String getAsciinum() {
        return asciinum;
    }

    public void setAsciinum(String asciinum) {
        this.asciinum = asciinum;
    }

    public String getBinaryval() {
        return binaryval;
    }

    public void setBinaryval(String binaryval) {
        this.binaryval = binaryval;
    }
}