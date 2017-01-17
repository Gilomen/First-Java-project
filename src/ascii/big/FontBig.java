package ascii.big;

import ascii.AbstractFont;
import font.CaracterInterface;

public class FontBig extends AbstractFont implements FontBigInterface
{
    //attributes
    
    private char cV;
    private char cH;
    private char cLTR;
    private char cRTL;
    private char cSP;
    private char cPar;
    private char cInf;
    
    //constructor
    
    public FontBig()
    {
        super(); //call to parent, optional
        
        //affect values
        this.cV = '|';
        this.cH = '_';
        this.cLTR = '\\';
        this.cRTL = '/';
        this.cSP = ' ';
        this.cPar = ')';
        this.cInf = '<';
    }
    
    //methods - 3 contracts to respect: 2 from font.AbstractFont, 1 from ascii.AbstractFont
    
    protected void initLineHeight()
    {
        this.lineHeight = 6;
    }
    
    protected CaracterInterface createCaracter (char caracter) //define minimum 1 caracter 
    {
        
        
        if ('b' == caracter || 'B' == caracter)
        {
            return new BigB(this);
            
        }
        else 
        {
            return new BigG(this);      //possible because only 2 letters
        }
        
        
        
    }
    
    protected void initSymbolDefault()
    {
        this.symbolDefault = ' ';
    }
    
    //methods - get symbols
    
    public char getCV()
    {
        return this.cV;
    }
    
    public char getCH()
    {
        return this.cH;
    }
    
    public char getCLTR()
    {
        return this.cLTR;
    }
    
    public char getCRTL()
    {
        return this.cRTL;
    }
    
    public char getCSP()
    {
        return this.cSP;
    }
    
    public char getCPar()
    {
        return this.cPar;
    }
    
    public char getCInf()
    {
        return this.cInf;
    }


        

}
