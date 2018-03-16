package alterNATIVE;



import java.util.LinkedList;
import java.util.List;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import alterNATIVE.*;
import alterNATIVE.AlterNATIVEParser.*;


public class JavascriptWorker extends AlterNATIVEBaseListener {
	
	
	private boolean containsFunctions = false;
	private LinkedList<String> javaScript;
	
	public JavascriptWorker() {
		javaScript = new LinkedList<String>();
	}
	
	
	/** Translate { to " */
	
	
   
	@Override public void enterProgram(ProgramContext ctx) {
	
		
		
	} 
	   
		
		@Override public void exitProgram(ProgramContext ctx) { 
			
			
			
			if(!containsFunctions) {
				javaScript.addFirst("function main() {");
				javaScript.addLast("}");
			}
				
			
			
		}
		
		@Override
		public void enterPrintln(PrintlnContext ctx) {
			super.enterPrintln(ctx);
			javaScript.addFirst("console.log(\"" +  "\")");
		}
		
		@Override public void exitPrintln(PrintlnContext ctx) { 

			
		}


		@Override
		public void enterText(TextContext ctx) {
			 
			super.enterText(ctx);
		}


		@Override
		public void exitText(TextContext ctx) {
			 
			super.exitText(ctx);
		}


		@Override
		public void enterTextcontent(TextcontentContext ctx) {
			 
			super.enterTextcontent(ctx);
		}


		@Override
		public void exitTextcontent(TextcontentContext ctx) {
			 
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
			super.enterFunctionDef(ctx);
			//Finish of the main part of program
			javaScript.addFirst("function main() {");
			
		}


		@Override
		public void exitFunctionDef(FunctionDefContext ctx) {

			 
			super.exitFunctionDef(ctx);
			
		}


		@Override
		public void enterFunctionCall(FunctionCallContext ctx) {

			 
			super.enterFunctionCall(ctx);
		}


		@Override
		public void exitFunctionCall(FunctionCallContext ctx) {

			 
			super.exitFunctionCall(ctx);
		}


		@Override
		public void enterNumberFunction(NumberFunctionContext ctx) {
			 
			super.enterNumberFunction(ctx);
		}


		@Override
		public void exitNumberFunction(NumberFunctionContext ctx) {
			 
			super.exitNumberFunction(ctx);
		}


		@Override
		public void enterStmt(StmtContext ctx) {
			 
			super.enterStmt(ctx);
		}


		@Override
		public void exitStmt(StmtContext ctx) {
			 
			super.exitStmt(ctx);
		}


		


		@Override
		public void enterPrint(PrintContext ctx) {
			 
			super.enterPrint(ctx);
		}


		@Override
		public void exitPrint(PrintContext ctx) {
			 
			super.exitPrint(ctx);
		}


		


		@Override
		public void enterInputStmt(InputStmtContext ctx) {
			 
			super.enterInputStmt(ctx);
		}


		@Override
		public void exitInputStmt(InputStmtContext ctx) {
			 
			super.exitInputStmt(ctx);
		}


		@Override
		public void enterCaseStmt(CaseStmtContext ctx) {
			 
			super.enterCaseStmt(ctx);
		}


		@Override
		public void exitCaseStmt(CaseStmtContext ctx) {
			 
			super.exitCaseStmt(ctx);
		}


		@Override
		public void enterBlock(BlockContext ctx) {
			 
			super.enterBlock(ctx);
		}


		@Override
		public void exitBlock(BlockContext ctx) {
			 
			super.exitBlock(ctx);
		}


		@Override
		public void enterReturnBlock(ReturnBlockContext ctx) {
			 
			super.enterReturnBlock(ctx);
		}


		@Override
		public void exitReturnBlock(ReturnBlockContext ctx) {
			 
			super.exitReturnBlock(ctx);
		}


		@Override
		public void enterCaseBlock(CaseBlockContext ctx) {
			 
			super.enterCaseBlock(ctx);
		}


		@Override
		public void exitCaseBlock(CaseBlockContext ctx) {
			 
			super.exitCaseBlock(ctx);
		}


		@Override
		public void enterCaseCondition(CaseConditionContext ctx) {
			 
			super.enterCaseCondition(ctx);
		}


		@Override
		public void exitCaseCondition(CaseConditionContext ctx) {
			 
			super.exitCaseCondition(ctx);
		}


		@Override
		public void enterIfStmt(IfStmtContext ctx) {
			 
			super.enterIfStmt(ctx);
		}


		@Override
		public void exitIfStmt(IfStmtContext ctx) {
			 
			super.exitIfStmt(ctx);
		}


		@Override
		public void enterBoolStmt(BoolStmtContext ctx) {
			 
			super.enterBoolStmt(ctx);
		}


		@Override
		public void exitBoolStmt(BoolStmtContext ctx) {
			 
			super.exitBoolStmt(ctx);
		}


		@Override
		public void enterLogicConnector(LogicConnectorContext ctx) {
			 
			super.enterLogicConnector(ctx);
		}


		@Override
		public void exitLogicConnector(LogicConnectorContext ctx) {
			 
			super.exitLogicConnector(ctx);
		}


		@Override
		public void enterOperations(OperationsContext ctx) {
			 
			super.enterOperations(ctx);
		}


		@Override
		public void exitOperations(OperationsContext ctx) {
			 
			super.exitOperations(ctx);
		}


		@Override
		public void enterMerge(MergeContext ctx) {
			 
			super.enterMerge(ctx);
		}


		@Override
		public void exitMerge(MergeContext ctx) {
			 
			super.exitMerge(ctx);
		}


		@Override
		public void enterJoin(JoinContext ctx) {
			 
			super.enterJoin(ctx);
		}


		@Override
		public void exitJoin(JoinContext ctx) {
			 
			super.exitJoin(ctx);
		}


		@Override
		public void enterLength(LengthContext ctx) {
			 
			super.enterLength(ctx);
		}


		@Override
		public void exitLength(LengthContext ctx) {
			 
			super.exitLength(ctx);
		}


		@Override
		public void enterSlice_array(Slice_arrayContext ctx) {
			 
			super.enterSlice_array(ctx);
		}


		@Override
		public void exitSlice_array(Slice_arrayContext ctx) {
			 
			super.exitSlice_array(ctx);
		}


		@Override
		public void enterIndexOf(IndexOfContext ctx) {
			 
			super.enterIndexOf(ctx);
		}


		@Override
		public void exitIndexOf(IndexOfContext ctx) {
			 
			super.exitIndexOf(ctx);
		}

		@Override
		public void enterNumberFunctions(NumberFunctionsContext ctx) {
			 
			super.enterNumberFunctions(ctx);
		}


		@Override
		public void exitNumberFunctions(NumberFunctionsContext ctx) {
			 
			super.exitNumberFunctions(ctx);
		}


		@Override
		public void enterTextOperations(TextOperationsContext ctx) {
			 
			super.enterTextOperations(ctx);
		}


		@Override
		public void exitTextOperations(TextOperationsContext ctx) {
			 
			super.exitTextOperations(ctx);
		}


		@Override
		public void enterBoolOperations(BoolOperationsContext ctx) {
			 
			super.enterBoolOperations(ctx);
		}


		@Override
		public void exitBoolOperations(BoolOperationsContext ctx) {
			 
			super.exitBoolOperations(ctx);
		}


		@Override
		public void enterBoolOperators(BoolOperatorsContext ctx) {
			 
			super.enterBoolOperators(ctx);
		}


		@Override
		public void exitBoolOperators(BoolOperatorsContext ctx) {
			 
			super.exitBoolOperators(ctx);
		}


		@Override
		public void enterForloop(ForloopContext ctx) {
			 
			super.enterForloop(ctx);
		}


		@Override
		public void exitForloop(ForloopContext ctx) {
			 
			super.exitForloop(ctx);
		}


		@Override
		public void enterWhileloop(WhileloopContext ctx) {
			 
			super.enterWhileloop(ctx);
		}


		@Override
		public void exitWhileloop(WhileloopContext ctx) {
			 
			super.exitWhileloop(ctx);
		}


		@Override
		public void enterDountil(DountilContext ctx) {
			 
			super.enterDountil(ctx);
		}


		@Override
		public void exitDountil(DountilContext ctx) {
			 
			super.exitDountil(ctx);
		}


		@Override
		public void enterOperand(OperandContext ctx) {
			 
			super.enterOperand(ctx);
		}


		@Override
		public void exitOperand(OperandContext ctx) {
			 
			super.exitOperand(ctx);
		}


		@Override
		public void enterValue(ValueContext ctx) {
			 
			super.enterValue(ctx);
		}


		@Override
		public void exitValue(ValueContext ctx) {
			 
			super.exitValue(ctx);
		}


		@Override
		public void enterVarType(VarTypeContext ctx) {
			 
			super.enterVarType(ctx);
		}


		@Override
		public void exitVarType(VarTypeContext ctx) {
			 
			super.exitVarType(ctx);
		}


		@Override
		public void enterArray(ArrayContext ctx) {
			 
			super.enterArray(ctx);
		}


		@Override
		public void exitArray(ArrayContext ctx) {
			 
			super.exitArray(ctx);
		}


		@Override
		public void enterVariable(VariableContext ctx) {
			 
			super.enterVariable(ctx);
		}


		@Override
		public void exitVariable(VariableContext ctx) {
			 
			super.exitVariable(ctx);
		}


		@Override
		public void enterDeclaration(DeclarationContext ctx) {
			 
			super.enterDeclaration(ctx);
		}


		@Override
		public void exitDeclaration(DeclarationContext ctx) {
			 
			super.exitDeclaration(ctx);
		}


		@Override
		public void enterAssignment(AssignmentContext ctx) {
			 
			super.enterAssignment(ctx);
		}


		@Override
		public void exitAssignment(AssignmentContext ctx) {
			 
			super.exitAssignment(ctx);
		}


		

}

	
	

