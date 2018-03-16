package alterNATIVE;

import java.util.List;

import org.antlr.v4.runtime.ParserRuleContext;
import alterNATIVE.AlterNATIVEParser.*;

public class IndentedDisplay extends AlterNATIVEBaseListener {

	private int indent = 0;
	private int previousIndex = 0;
	private List<String> ruleNames;
	
	public IndentedDisplay(List ruleNames) {
		this.ruleNames = ruleNames;	
	}
	
	@Override
	public void enterEveryRule(ParserRuleContext ctx) {
		// TODO Auto-generated method stub
		super.enterEveryRule(ctx);
		if(previousIndex != ctx.getRuleIndex()) {
		indent++;
		printIndent();
		previousIndex = ctx.getRuleIndex();
		System.out.println(ruleNames.get(ctx.getRuleIndex()));
		}
	}


	@Override
	public void exitEveryRule(ParserRuleContext ctx) {
		// TODO Auto-generated method stub
		super.exitEveryRule(ctx);
		if(previousIndex != ctx.getRuleIndex()) {
		indent--;
		printIndent();
		previousIndex = ctx.getRuleIndex();
		System.out.println(ruleNames.get(ctx.getRuleIndex()));
		}
		
		
	}
	
	private void printIndent() {
		for(int i = 0; i < indent-1; i++) {
			System.out.print(" ");
		}
		System.out.print("->");

		
	}
	
}
