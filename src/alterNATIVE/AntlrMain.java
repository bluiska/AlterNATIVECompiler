package alterNATIVE;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

@SuppressWarnings("deprecation")
public class AntlrMain {

	private AlterNATIVELexer lexer;
	private CommonTokenStream tokens;
	private AlterNATIVEParser parser;
	
	
	public AntlrMain(String program) {
		ANTLRInputStream input = new ANTLRInputStream(program);
		// create a lexer that feeds off of input CharStream
        lexer = new AlterNATIVELexer(input);
        // create a buffer of tokens pulled from the lexer
        tokens = new CommonTokenStream(lexer);
        // create a parser that feeds off the tokens buffer
        parser = new AlterNATIVEParser(tokens);
      
	}
	
	public ParseTree parse() {
       return parser.program(); // begin parsing at program rule
	}
	
}
