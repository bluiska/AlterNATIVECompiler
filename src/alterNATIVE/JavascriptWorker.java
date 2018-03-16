package alterNATIVE;



import java.util.List;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import alterNATIVE.*;
import alterNATIVE.AlterNATIVEParser.*;


public class JavascriptWorker extends AlterNATIVEBaseListener {
	
	private boolean isToPrint = false;
	private int indent = 0;
	private int previousIndex = 0;
	private List<String> ruleNames;
	
	public JavascriptWorker(List ruleNames) {
	this.ruleNames = ruleNames;	
	}
	
	
	/** Translate { to " */
	
	
   
	@Override public void enterProgram(ProgramContext ctx) {
	
		
	} 
	   
		
		@Override public void exitProgram(ProgramContext ctx) { 
		}
		
		@Override
		public void enterPrintln(PrintlnContext ctx) {
			// TODO Auto-generated method stub
			super.enterPrintln(ctx);
			
			isToPrint = true;
			
		}
		
		@Override public void exitPrintln(PrintlnContext ctx) { 

			
		}


		@Override
		public void enterText(TextContext ctx) {
			// TODO Auto-generated method stub
			super.enterText(ctx);
		}


		@Override
		public void exitText(TextContext ctx) {
			// TODO Auto-generated method stub
			super.exitText(ctx);
		}


		@Override
		public void enterTextcontent(TextcontentContext ctx) {
			// TODO Auto-generated method stub
			super.enterTextcontent(ctx);
		}


		@Override
		public void exitTextcontent(TextcontentContext ctx) {
			// TODO Auto-generated method stub
			super.exitTextcontent(ctx);
			
//			if(isToPrint == true) {
//			String op1 = ctx.getChild(0).getText().toString();
//
//			System.out.print("\n" + op1 + "\n");
//			isToPrint = false;
//			}
		}


		@Override
		public void enterFunctionDef(FunctionDefContext ctx) {

			// TODO Auto-generated method stub
			super.enterFunctionDef(ctx);
			
		}


		@Override
		public void exitFunctionDef(FunctionDefContext ctx) {

			// TODO Auto-generated method stub
			super.exitFunctionDef(ctx);
			
		}


		@Override
		public void enterFunctionCall(FunctionCallContext ctx) {

			// TODO Auto-generated method stub
			super.enterFunctionCall(ctx);
		}


		@Override
		public void exitFunctionCall(FunctionCallContext ctx) {

			// TODO Auto-generated method stub
			super.exitFunctionCall(ctx);
		}


		@Override
		public void enterNumberFunction(NumberFunctionContext ctx) {
			// TODO Auto-generated method stub
			super.enterNumberFunction(ctx);
		}


		@Override
		public void exitNumberFunction(NumberFunctionContext ctx) {
			// TODO Auto-generated method stub
			super.exitNumberFunction(ctx);
		}


		@Override
		public void enterStmt(StmtContext ctx) {
			// TODO Auto-generated method stub
			super.enterStmt(ctx);
		}


		@Override
		public void exitStmt(StmtContext ctx) {
			// TODO Auto-generated method stub
			super.exitStmt(ctx);
		}


		


		@Override
		public void enterPrint(PrintContext ctx) {
			// TODO Auto-generated method stub
			super.enterPrint(ctx);
		}


		@Override
		public void exitPrint(PrintContext ctx) {
			// TODO Auto-generated method stub
			super.exitPrint(ctx);
		}


		


		@Override
		public void enterInputStmt(InputStmtContext ctx) {
			// TODO Auto-generated method stub
			super.enterInputStmt(ctx);
		}


		@Override
		public void exitInputStmt(InputStmtContext ctx) {
			// TODO Auto-generated method stub
			super.exitInputStmt(ctx);
		}


		@Override
		public void enterCaseStmt(CaseStmtContext ctx) {
			// TODO Auto-generated method stub
			super.enterCaseStmt(ctx);
		}


		@Override
		public void exitCaseStmt(CaseStmtContext ctx) {
			// TODO Auto-generated method stub
			super.exitCaseStmt(ctx);
		}


		@Override
		public void enterBlock(BlockContext ctx) {
			// TODO Auto-generated method stub
			super.enterBlock(ctx);
		}


		@Override
		public void exitBlock(BlockContext ctx) {
			// TODO Auto-generated method stub
			super.exitBlock(ctx);
		}


		@Override
		public void enterReturnBlock(ReturnBlockContext ctx) {
			// TODO Auto-generated method stub
			super.enterReturnBlock(ctx);
		}


		@Override
		public void exitReturnBlock(ReturnBlockContext ctx) {
			// TODO Auto-generated method stub
			super.exitReturnBlock(ctx);
		}


		@Override
		public void enterCaseBlock(CaseBlockContext ctx) {
			// TODO Auto-generated method stub
			super.enterCaseBlock(ctx);
		}


		@Override
		public void exitCaseBlock(CaseBlockContext ctx) {
			// TODO Auto-generated method stub
			super.exitCaseBlock(ctx);
		}


		@Override
		public void enterCaseCondition(CaseConditionContext ctx) {
			// TODO Auto-generated method stub
			super.enterCaseCondition(ctx);
		}


		@Override
		public void exitCaseCondition(CaseConditionContext ctx) {
			// TODO Auto-generated method stub
			super.exitCaseCondition(ctx);
		}


		@Override
		public void enterIfStmt(IfStmtContext ctx) {
			// TODO Auto-generated method stub
			super.enterIfStmt(ctx);
		}


		@Override
		public void exitIfStmt(IfStmtContext ctx) {
			// TODO Auto-generated method stub
			super.exitIfStmt(ctx);
		}


		@Override
		public void enterBoolStmt(BoolStmtContext ctx) {
			// TODO Auto-generated method stub
			super.enterBoolStmt(ctx);
		}


		@Override
		public void exitBoolStmt(BoolStmtContext ctx) {
			// TODO Auto-generated method stub
			super.exitBoolStmt(ctx);
		}


		@Override
		public void enterLogicConnector(LogicConnectorContext ctx) {
			// TODO Auto-generated method stub
			super.enterLogicConnector(ctx);
		}


		@Override
		public void exitLogicConnector(LogicConnectorContext ctx) {
			// TODO Auto-generated method stub
			super.exitLogicConnector(ctx);
		}


		@Override
		public void enterOperations(OperationsContext ctx) {
			// TODO Auto-generated method stub
			super.enterOperations(ctx);
		}


		@Override
		public void exitOperations(OperationsContext ctx) {
			// TODO Auto-generated method stub
			super.exitOperations(ctx);
		}


		@Override
		public void enterMerge(MergeContext ctx) {
			// TODO Auto-generated method stub
			super.enterMerge(ctx);
		}


		@Override
		public void exitMerge(MergeContext ctx) {
			// TODO Auto-generated method stub
			super.exitMerge(ctx);
		}


		@Override
		public void enterJoin(JoinContext ctx) {
			// TODO Auto-generated method stub
			super.enterJoin(ctx);
		}


		@Override
		public void exitJoin(JoinContext ctx) {
			// TODO Auto-generated method stub
			super.exitJoin(ctx);
		}


		@Override
		public void enterLength(LengthContext ctx) {
			// TODO Auto-generated method stub
			super.enterLength(ctx);
		}


		@Override
		public void exitLength(LengthContext ctx) {
			// TODO Auto-generated method stub
			super.exitLength(ctx);
		}


		@Override
		public void enterSlice_array(Slice_arrayContext ctx) {
			// TODO Auto-generated method stub
			super.enterSlice_array(ctx);
		}


		@Override
		public void exitSlice_array(Slice_arrayContext ctx) {
			// TODO Auto-generated method stub
			super.exitSlice_array(ctx);
		}


		@Override
		public void enterIndexOf(IndexOfContext ctx) {
			// TODO Auto-generated method stub
			super.enterIndexOf(ctx);
		}


		@Override
		public void exitIndexOf(IndexOfContext ctx) {
			// TODO Auto-generated method stub
			super.exitIndexOf(ctx);
		}

		@Override
		public void enterNumberFunctions(NumberFunctionsContext ctx) {
			// TODO Auto-generated method stub
			super.enterNumberFunctions(ctx);
		}


		@Override
		public void exitNumberFunctions(NumberFunctionsContext ctx) {
			// TODO Auto-generated method stub
			super.exitNumberFunctions(ctx);
		}


		@Override
		public void enterTextOperations(TextOperationsContext ctx) {
			// TODO Auto-generated method stub
			super.enterTextOperations(ctx);
		}


		@Override
		public void exitTextOperations(TextOperationsContext ctx) {
			// TODO Auto-generated method stub
			super.exitTextOperations(ctx);
		}


		@Override
		public void enterBoolOperations(BoolOperationsContext ctx) {
			// TODO Auto-generated method stub
			super.enterBoolOperations(ctx);
		}


		@Override
		public void exitBoolOperations(BoolOperationsContext ctx) {
			// TODO Auto-generated method stub
			super.exitBoolOperations(ctx);
		}


		@Override
		public void enterBoolOperators(BoolOperatorsContext ctx) {
			// TODO Auto-generated method stub
			super.enterBoolOperators(ctx);
		}


		@Override
		public void exitBoolOperators(BoolOperatorsContext ctx) {
			// TODO Auto-generated method stub
			super.exitBoolOperators(ctx);
		}


		@Override
		public void enterForloop(ForloopContext ctx) {
			// TODO Auto-generated method stub
			super.enterForloop(ctx);
		}


		@Override
		public void exitForloop(ForloopContext ctx) {
			// TODO Auto-generated method stub
			super.exitForloop(ctx);
		}


		@Override
		public void enterWhileloop(WhileloopContext ctx) {
			// TODO Auto-generated method stub
			super.enterWhileloop(ctx);
		}


		@Override
		public void exitWhileloop(WhileloopContext ctx) {
			// TODO Auto-generated method stub
			super.exitWhileloop(ctx);
		}


		@Override
		public void enterDountil(DountilContext ctx) {
			// TODO Auto-generated method stub
			super.enterDountil(ctx);
		}


		@Override
		public void exitDountil(DountilContext ctx) {
			// TODO Auto-generated method stub
			super.exitDountil(ctx);
		}


		@Override
		public void enterOperand(OperandContext ctx) {
			// TODO Auto-generated method stub
			super.enterOperand(ctx);
		}


		@Override
		public void exitOperand(OperandContext ctx) {
			// TODO Auto-generated method stub
			super.exitOperand(ctx);
		}


		@Override
		public void enterValue(ValueContext ctx) {
			// TODO Auto-generated method stub
			super.enterValue(ctx);
		}


		@Override
		public void exitValue(ValueContext ctx) {
			// TODO Auto-generated method stub
			super.exitValue(ctx);
		}


		@Override
		public void enterVarType(VarTypeContext ctx) {
			// TODO Auto-generated method stub
			super.enterVarType(ctx);
		}


		@Override
		public void exitVarType(VarTypeContext ctx) {
			// TODO Auto-generated method stub
			super.exitVarType(ctx);
		}


		@Override
		public void enterArray(ArrayContext ctx) {
			// TODO Auto-generated method stub
			super.enterArray(ctx);
		}


		@Override
		public void exitArray(ArrayContext ctx) {
			// TODO Auto-generated method stub
			super.exitArray(ctx);
		}


		@Override
		public void enterVariable(VariableContext ctx) {
			// TODO Auto-generated method stub
			super.enterVariable(ctx);
		}


		@Override
		public void exitVariable(VariableContext ctx) {
			// TODO Auto-generated method stub
			super.exitVariable(ctx);
		}


		@Override
		public void enterDeclaration(DeclarationContext ctx) {
			// TODO Auto-generated method stub
			super.enterDeclaration(ctx);
		}


		@Override
		public void exitDeclaration(DeclarationContext ctx) {
			// TODO Auto-generated method stub
			super.exitDeclaration(ctx);
		}


		@Override
		public void enterAssignment(AssignmentContext ctx) {
			// TODO Auto-generated method stub
			super.enterAssignment(ctx);
		}


		@Override
		public void exitAssignment(AssignmentContext ctx) {
			// TODO Auto-generated method stub
			super.exitAssignment(ctx);
		}


		

}

	
	

