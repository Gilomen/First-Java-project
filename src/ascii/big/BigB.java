package ascii.big;

import ascii.AbstractCaracter;
import font.CaracterInterface;

public class BigB extends AbstractCaracter implements CaracterInterface
{
    
    public BigB(FontBig font) //constructor; we want to receive the font from FontBig
    {
        //affect values
        
        this.definition = new char[font.getLineHeight()][7]; //hauteur et largeur, font.AbstractFont peut nous distribuer la hauteur
        
        
        this.definition[0][0] = font.getSymbolDefault();
        this.definition[0][1] = font.getCH();
        this.definition[0][5] = font.getSymbolDefault();
        this.definition[1][0] = font.getCV();
        this.definition[1][1] = font.getSymbolDefault();
        this.definition[1][3] = font.getCH();
        this.definition[1][4] = font.getSymbolDefault();
        this.definition[1][5] = font.getCLTR();
        this.definition[1][6] = font.getSymbolDefault();
        this.definition[2][0] = font.getCV();
        this.definition[2][1] = font.getSymbolDefault();
        this.definition[2][2] = font.getCV();
        this.definition[2][3] = font.getCH();
        this.definition[2][4] = font.getCPar();
        this.definition[2][5] = font.getSymbolDefault();
        this.definition[2][6] = font.getCV();
        this.definition[3][0] = font.getCV();
        this.definition[3][1] = font.getSymbolDefault();
        this.definition[3][3] = font.getCH();
        this.definition[3][4] = font.getSymbolDefault();
        this.definition[3][5] = font.getCInf();
        this.definition[3][6] = font.getSymbolDefault();
        this.definition[4][0] = font.getCV();
        this.definition[4][1] = font.getSymbolDefault();
        this.definition[4][2] = font.getCV();
        this.definition[4][3] = font.getCH();
        this.definition[4][4] = font.getCPar();
        this.definition[4][5] = font.getSymbolDefault();
        this.definition[4][6] = font.getCV();
        this.definition[5][0] = font.getCV();
        this.definition[5][1] = font.getCH();
        this.definition[5][5] = font.getCRTL();
        this.definition[5][6] = font.getSymbolDefault();
        
    }
    public String toString() //see method font.CaracterInterface
    {
        return "B";
    }
    
    
    

}
