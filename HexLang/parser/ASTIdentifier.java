/* Generated By:JJTree: Do not edit this line. ASTIdentifier.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=interpreter.BaseASTNode,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package parser;

public
class ASTIdentifier extends SimpleNode {
  public ASTIdentifier(int id) {
    super(id);
  }

  public ASTIdentifier(HexLang p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(HexLangVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=1a43a4c441346cc837a5e7700fb75701 (do not edit this line) */
