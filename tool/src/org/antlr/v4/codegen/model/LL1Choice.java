package org.antlr.v4.codegen.model;

import org.antlr.v4.codegen.OutputModelFactory;
import org.antlr.v4.tool.GrammarAST;

import java.util.List;

public abstract class LL1Choice extends Choice {
	/** Token names for each alt 0..n-1 */
	public List<String[]> altLook;
	@ModelElement public ThrowNoViableAlt error;

	public LL1Choice(OutputModelFactory factory, GrammarAST blkAST,
					 List<SrcOp> alts)
	{
		super(factory, blkAST, alts);
	}
}