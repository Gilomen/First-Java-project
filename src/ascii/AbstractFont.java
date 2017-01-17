package ascii;

public abstract class AbstractFont extends font.AbstractFont
{
    //attributes
    
	protected char symbolDefault;
	
	//methods
	
	protected abstract void initSymbolDefault();
	
	protected AbstractFont() //constructor
	{
		super(); 		//call to parent constructor (in package font)
		this.initSymbolDefault();
	}
	
	public char getSymbolDefault()
	{
		return this.symbolDefault;
	}

}
