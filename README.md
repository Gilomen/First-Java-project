# My first Java project

My first Java project prints my initials in the font Big of [Ascii] (http://patorjk.com/software/taag/#p=display&f=Big&t=).

The project runs on eclipse and has 3 packages: 
- font
- ascii
- big.ascii

It is meant to be extendable to other fonts and symbols.

### src/font

The package font contains one class (AbstractFont) and 2 interfaces (FontInterface and CaracterInterface).

### src/ascii

The package ascii depends on the package font. Its class AbstractFont and interface FontInterface extend the AbstractFont and FontInterface in the package font. 
The package ascii also contains the classes AbstractCaracter and Ascii. The class Ascii contains the main method for printing the two letters in the font Big, consisting of 3 interrelated loops:
- 1 for the letters
- 1 for the lines
- 1 for the symbols in the lines

### src/ascii.big

The package ascii.big is part of the package ascii. It contains the classes FontBig, BigB and BigG, and the interface FontBigInterface. FontBig contains the symbols needed for the letters B and G, and BigB and BigG specify the positions of the symbols in the letters. Each letter has a height of 6 lines and a width of 7 symbols.
