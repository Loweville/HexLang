/* Generated By:JJTree: Do not edit this line. ASTFnInvoke.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=interpreter.BaseASTNode,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package parser;

public
class ASTFnInvoke extends SimpleNode {
  public ASTFnInvoke(int id) {
    super(id);
  }

  public ASTFnInvoke(HexLang p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(HexLangVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=fa4c8f2458cf8f7a240957508ef6db15 (do not edit this line) */
