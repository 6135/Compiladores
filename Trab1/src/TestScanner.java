
/*
 * TestScanner
 * -- Test the lexical analyser.
 *
 * by Fernando Lobo, Mar/2015
 *     
 */

public class TestScanner {

  public static void main(String[] args) {
      SourceFile source = new SourceFile();   // 
      Scanner scanner = new Scanner(source);
      scanner.enableDebugging();
      Token currentToken;
      currentToken = scanner.scan();
      while( currentToken.kind != Token.EOT ) {
         currentToken = scanner.scan();
      } 
   } 
}

