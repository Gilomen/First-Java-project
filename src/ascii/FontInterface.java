package ascii;



//import font.FontInterface; not possible if same name as in existing package:

public interface FontInterface extends font.FontInterface //"extends" links FontInterface in font & ascii

{
	public char getSymbolDefault();
}
