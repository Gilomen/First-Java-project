package ascii.big;

import ascii.AbstractCaracter;
import font.CaracterInterface;

public class BigG extends AbstractCaracter implements CaracterInterface
{
    public BigG (FontBig font) //constructor; we want to receive the font from FontBig
    {
        this.definition = new char[font.getLineHeight()][7]; //height and width, font.AbstractFont peut nous distribuer la hauteur
        
        this.definition[0][2] = font.getCH();
        this.definition[0][6] = font.getSymbolDefault();
        this.definition[1][1] = font.getCRTL();
        this.definition[1][2] = font.getSymbolDefault();
        this.definition[1][3] = font.getCH();
        this.definition[1][6] = font.getCV();
        this.definition[2][0] = font.getCV();
        this.definition[2][1] = font.getSymbolDefault();
        this.definition[2][2] = font.getCV();
        this.definition[2][3] = font.getCH();
        this.definition[2][6] = font.getSymbolDefault();
        this.definition[3][0] = font.getCV();
        this.definition[3][1] = font.getSymbolDefault();
        this.definition[3][2] = font.getCV();
        this.definition[3][3] = font.getCH();
        this.definition[3][4] = font.getSymbolDefault();
        this.definition[3][6] = font.getCV();
        this.definition[4][0] = font.getCV();
        this.definition[4][1] = font.getSymbolDefault();
        this.definition[4][2] = font.getCV();
        this.definition[4][3] = font.getCH();
        this.definition[4][4] = font.getCV();
        this.definition[4][5] = font.getSymbolDefault();
        this.definition[4][6] = font.getCV();
        this.definition[5][1] = font.getCLTR();
        this.definition[5][2] = font.getCH();
        this.definition[5][6] = font.getCV();
    }
    
    public String toString() //see method font.CaracterInterface
    {
        return "G";
    }

}
