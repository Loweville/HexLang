/* Generated By:JJTree: Do not edit this line. ASTCompLT.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=interpreter.BaseASTNode,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package parser;

public
class ASTCompLT extends SimpleNode {
  public ASTCompLT(int id) {
    super(id);
  }

  public ASTCompLT(HexLang p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(HexLangVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=025d9a0ca9efb89e632fa9459a5cfe8a (do not edit this line) */
