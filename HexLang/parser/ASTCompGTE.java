/* Generated By:JJTree: Do not edit this line. ASTCompGTE.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=interpreter.BaseASTNode,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package parser;

public
class ASTCompGTE extends SimpleNode {
  public ASTCompGTE(int id) {
    super(id);
  }

  public ASTCompGTE(HexLang p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(HexLangVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=c1835b955f5246605101d2e059ec0bc2 (do not edit this line) */
