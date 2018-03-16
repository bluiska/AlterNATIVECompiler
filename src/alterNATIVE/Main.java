package alterNATIVE;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import org.antlr.v4.gui.TreeViewer;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import org.w3c.dom.Document;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import alterNATIVE.*;

public class Main {
	
    public static void main(String[] args) throws Exception {
        // create a CharStream that reads from standard input
        @SuppressWarnings("deprecation")
		ANTLRInputStream input = new ANTLRInputStream(System.in);
        // create a lexer that feeds off of input CharStream
        AlterNATIVELexer lexer = new AlterNATIVELexer(input);
        // create a buffer of tokens pulled from the lexer
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        // create a parser that feeds off the tokens buffer
        AlterNATIVEParser parser = new AlterNATIVEParser(tokens);
        
        ParseTree tree = parser.program(); // begin parsing at init rule

        // Create a generic parse tree walker that can trigger callbacks
        ParseTreeWalker walker = new ParseTreeWalker();
        
        JFrame frame = new JFrame("Parse Tree");
        JPanel panel = new JPanel();
        
        TreeViewer viewr = new TreeViewer(Arrays.asList(
                parser.getRuleNames()),tree.getChild(2));
        
        viewr.setScale(2);//scale a little
        viewr.setAlignmentX(4);
        frame.add(new JScrollPane(viewr));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600,600);
        frame.setVisible(true);
             
        
        
        // Walk the tree created during the parse and display it in an indented format
        walker.walk(new IndentedDisplay(Arrays.asList(parser.getRuleNames())), tree);
        
        
     
        
        
        System.out.println("\n\nJSON:\n\n");
        
        System.out.println(toJson(tree));

        System.out.println(); // print a \n after translation
    }



    
    //JSON Converter methods
    //Source: https://stackoverflow.com/questions/49116223/convert-antlr-parse-tree-to-json/49117903?noredirect=1#comment85300669_49117903
    //I asked for help as I couldn't find any information on how to do it. I am using the methods of the accepted answer.

  	  private static final Gson PRETTY_PRINT_GSON = new GsonBuilder().setPrettyPrinting().create();
  	  private static final Gson GSON = new Gson();

  	  public static String toJson(ParseTree tree) {
  	    return toJson(tree, true);
  	  }

  	  public static String toJson(ParseTree tree, boolean prettyPrint) {
  	    return prettyPrint ? PRETTY_PRINT_GSON.toJson(toMap(tree)) : GSON.toJson(toMap(tree));
  	  }

  	  public static Map<String, Object> toMap(ParseTree tree) {
  	    Map<String, Object> map = new LinkedHashMap<>();
  	    traverse(tree, map);
  	    return map;
  	  }

  	  public static void traverse(ParseTree tree, Map<String, Object> map) {

  	    if (tree instanceof TerminalNodeImpl) {
  	      Token token = ((TerminalNodeImpl) tree).getSymbol();
  	      //map.put("type", token.getType());
  	      map.put("text", token.getText());
  	    }
  	    else {
  	      List<Map<String, Object>> children = new ArrayList<>();
  	      String name = tree.getClass().getSimpleName().replaceAll("Context$", "");
  	      map.put(Character.toLowerCase(name.charAt(0)) + name.substring(1), children);

  	      for (int i = 0; i < tree.getChildCount(); i++) {
  	        Map<String, Object> nested = new LinkedHashMap<>();
  	        children.add(nested);
  	        traverse(tree.getChild(i), nested);
  	      }
  	    }
  	  }
  
    
	}




