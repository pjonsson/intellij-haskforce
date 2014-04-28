/* The following code was generated by JFlex 1.4.3 on 4/27/14 11:27 PM */

package com.haskforce;
import com.intellij.lexer.*;
import com.intellij.psi.tree.IElementType;
import static com.haskforce.psi.HaskellTypes.*;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 4/27/14 11:27 PM from the specification file
 * <tt>/Users/crobbins/IdeaProjects/HaskForce/src/com/haskforce/_HaskellLexer.flex</tt>
 */
public class _HaskellLexer implements FlexLexer {
  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0, 0
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\3\1\2\1\0\1\3\1\1\22\0\1\3\1\45\1\4"+
    "\1\30\1\46\1\47\1\50\1\10\1\33\1\34\1\51\1\25\1\36"+
    "\1\26\1\22\1\52\1\12\7\15\2\6\1\61\1\37\1\53\1\54"+
    "\1\55\1\56\1\57\4\21\1\24\1\21\2\7\1\104\2\7\1\103"+
    "\1\7\1\105\1\14\3\7\1\110\3\7\1\107\1\17\2\7\1\40"+
    "\1\11\1\41\1\27\1\106\1\42\1\64\1\20\1\62\1\66\1\23"+
    "\1\32\1\74\1\101\1\31\2\5\1\63\1\75\1\73\1\13\1\100"+
    "\1\102\1\71\1\65\1\67\1\70\1\72\1\76\1\16\1\77\1\5"+
    "\1\43\1\35\1\44\1\60\uff81\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7"+
    "\1\10\1\5\1\4\1\11\1\4\1\6\1\12\1\13"+
    "\1\14\1\15\2\4\1\16\1\17\1\20\1\21\1\22"+
    "\1\23\1\24\1\25\1\26\1\27\1\30\1\31\1\32"+
    "\1\33\1\34\1\35\1\36\1\37\1\40\1\41\1\42"+
    "\1\43\1\44\12\4\1\6\1\0\1\45\3\0\1\46"+
    "\1\0\1\47\2\0\1\50\1\51\1\4\1\6\1\52"+
    "\1\53\1\54\3\0\1\55\1\56\2\4\1\57\1\60"+
    "\1\61\1\62\3\4\1\63\1\64\11\4\1\6\2\65"+
    "\1\0\2\66\2\5\1\4\1\67\2\70\1\71\2\0"+
    "\1\72\1\73\4\4\1\74\2\4\1\75\12\4\1\6"+
    "\1\76\2\0\5\4\1\77\2\4\1\100\1\101\1\102"+
    "\5\4\1\6\1\103\1\0\1\104\3\4\1\105\4\4"+
    "\1\106\2\4\1\6\1\107\1\110\1\111\1\4\1\112"+
    "\4\4\1\113\1\114\1\4\1\6\1\4\1\115\1\116"+
    "\1\4\1\117\1\4\1\120\1\121\1\122\1\4\1\123";

  private static int [] zzUnpackAction() {
    int [] result = new int[191];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\111\0\222\0\333\0\u0124\0\u016d\0\u01b6\0\u01ff"+
    "\0\u0248\0\u0291\0\u02da\0\u0323\0\u036c\0\u03b5\0\111\0\u03fe"+
    "\0\111\0\u0447\0\u0490\0\u04d9\0\111\0\111\0\111\0\111"+
    "\0\111\0\111\0\111\0\111\0\u0522\0\111\0\111\0\111"+
    "\0\111\0\111\0\111\0\111\0\u056b\0\u05b4\0\111\0\111"+
    "\0\111\0\111\0\u05fd\0\u0646\0\u068f\0\u06d8\0\u0721\0\u076a"+
    "\0\u07b3\0\u07fc\0\u0845\0\u088e\0\u08d7\0\u0920\0\333\0\111"+
    "\0\u0969\0\u09b2\0\u09fb\0\111\0\u0a44\0\111\0\u0a8d\0\u0ad6"+
    "\0\u0124\0\111\0\u0b1f\0\u0b68\0\u0bb1\0\111\0\111\0\u0bfa"+
    "\0\u0c43\0\u0c8c\0\u0124\0\u0cd5\0\u0d1e\0\u0d67\0\u0db0\0\111"+
    "\0\111\0\111\0\u0df9\0\u0e42\0\u0e8b\0\u0124\0\u0124\0\u0ed4"+
    "\0\u0f1d\0\u0f66\0\u0faf\0\u0ff8\0\u1041\0\u108a\0\u10d3\0\u111c"+
    "\0\u1165\0\u11ae\0\u11f7\0\u11f7\0\111\0\u09fb\0\u0a8d\0\u0ad6"+
    "\0\u1240\0\u01b6\0\u1289\0\111\0\u12d2\0\u131b\0\u1364\0\111"+
    "\0\u13ad\0\u13f6\0\u143f\0\u1488\0\u14d1\0\111\0\u151a\0\u1563"+
    "\0\u0124\0\u15ac\0\u15f5\0\u163e\0\u1687\0\u16d0\0\u1719\0\u1762"+
    "\0\u17ab\0\u17f4\0\u183d\0\u1886\0\u0124\0\u18cf\0\u1918\0\u1961"+
    "\0\u19aa\0\u19f3\0\u1a3c\0\u1a85\0\u0124\0\u1ace\0\u1b17\0\u0124"+
    "\0\u0124\0\u0124\0\u1b60\0\u1ba9\0\u1bf2\0\u1c3b\0\u1c84\0\u1ccd"+
    "\0\111\0\u1d16\0\u1d5f\0\u1da8\0\u1df1\0\u1e3a\0\u0124\0\u1e83"+
    "\0\u1ecc\0\u1f15\0\u1f5e\0\u0124\0\u1fa7\0\u1ff0\0\u2039\0\111"+
    "\0\u0124\0\u0124\0\u2082\0\u0124\0\u20cb\0\u2114\0\u215d\0\u21a6"+
    "\0\u0124\0\u0124\0\u21ef\0\u2238\0\u2281\0\u0124\0\u0124\0\u22ca"+
    "\0\u0124\0\u2313\0\u01b6\0\u0124\0\u0124\0\u235c\0\u0124";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[191];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\3\3\1\4\1\5\1\6\1\7\1\10\1\11"+
    "\1\12\1\13\1\7\1\6\1\5\1\7\1\5\1\7"+
    "\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23"+
    "\1\24\1\25\1\26\1\27\1\30\1\31\1\32\1\33"+
    "\1\34\1\35\1\36\1\37\1\40\1\41\1\42\1\43"+
    "\1\44\1\45\1\46\1\47\1\50\1\51\1\52\1\53"+
    "\1\54\1\55\1\56\1\5\1\57\1\60\3\5\1\61"+
    "\1\5\1\62\1\63\2\5\1\64\1\65\1\66\2\7"+
    "\1\5\2\7\112\0\3\3\105\0\4\67\1\70\104\67"+
    "\5\0\4\5\1\0\10\5\1\0\2\5\4\0\2\5"+
    "\27\0\27\5\6\0\1\6\3\0\1\6\2\0\1\6"+
    "\4\0\1\71\2\72\71\0\4\7\1\0\10\7\1\0"+
    "\2\7\4\0\2\7\27\0\27\7\10\73\1\74\1\75"+
    "\77\73\50\0\1\76\46\0\1\6\3\0\1\6\2\77"+
    "\1\6\2\100\2\0\1\71\2\72\71\0\4\5\1\0"+
    "\10\5\1\0\2\5\4\0\1\5\1\101\27\0\27\5"+
    "\22\0\1\102\73\0\4\5\1\0\10\5\1\0\2\5"+
    "\4\0\2\5\27\0\1\5\1\103\25\5\5\0\4\7"+
    "\1\0\2\7\1\104\5\7\1\0\2\7\4\0\2\7"+
    "\27\0\27\7\26\0\1\105\15\0\1\106\10\0\1\107"+
    "\56\0\1\110\2\0\1\111\2\0\1\112\64\0\4\5"+
    "\1\0\10\5\1\0\2\5\4\0\1\5\1\113\27\0"+
    "\11\5\1\114\1\5\1\115\13\5\5\0\4\5\1\0"+
    "\1\5\1\116\6\5\1\0\2\5\4\0\2\5\27\0"+
    "\27\5\26\0\1\117\110\0\1\120\137\0\1\121\114\0"+
    "\1\122\34\0\4\5\1\0\10\5\1\0\2\5\4\0"+
    "\2\5\27\0\1\5\1\123\1\124\24\5\5\0\4\5"+
    "\1\0\10\5\1\0\1\125\1\5\4\0\2\5\27\0"+
    "\27\5\5\0\4\5\1\0\10\5\1\0\2\5\4\0"+
    "\2\5\27\0\3\5\1\126\23\5\5\0\4\5\1\0"+
    "\1\5\1\127\6\5\1\0\1\130\1\5\4\0\2\5"+
    "\27\0\2\5\1\131\24\5\5\0\4\5\1\0\10\5"+
    "\1\0\2\5\4\0\2\5\27\0\15\5\1\132\1\5"+
    "\1\133\7\5\5\0\4\5\1\0\10\5\1\0\1\134"+
    "\1\5\4\0\2\5\27\0\27\5\5\0\4\5\1\0"+
    "\1\5\1\135\6\5\1\0\2\5\4\0\2\5\27\0"+
    "\27\5\5\0\4\5\1\0\10\5\1\0\2\5\4\0"+
    "\2\5\27\0\17\5\1\136\7\5\5\0\4\5\1\0"+
    "\10\5\1\0\2\5\4\0\1\137\1\5\27\0\27\5"+
    "\5\0\4\5\1\0\10\5\1\0\2\5\4\0\2\5"+
    "\27\0\6\5\1\140\20\5\5\0\4\7\1\0\10\7"+
    "\1\0\2\7\4\0\2\7\27\0\22\7\1\141\4\7"+
    "\6\0\1\142\3\0\1\142\2\0\1\142\101\0\1\143"+
    "\3\0\1\143\2\0\1\143\7\0\2\144\72\0\1\145"+
    "\100\0\2\73\1\0\5\73\1\146\100\73\12\0\1\147"+
    "\2\0\1\147\101\0\1\150\3\0\1\150\2\0\1\150"+
    "\2\0\2\150\1\0\2\150\5\0\1\150\27\0\1\150"+
    "\1\0\1\150\1\0\1\150\27\0\4\5\1\0\10\5"+
    "\1\0\2\5\4\0\2\5\27\0\3\5\1\151\23\5"+
    "\5\0\4\7\1\0\10\7\1\0\2\7\4\0\2\7"+
    "\27\0\21\7\1\152\5\7\1\153\2\154\24\153\1\155"+
    "\61\153\63\0\1\156\7\0\1\157\61\0\1\160\76\0"+
    "\1\161\63\0\4\5\1\0\10\5\1\0\2\5\4\0"+
    "\1\5\1\162\27\0\3\5\1\163\23\5\5\0\4\5"+
    "\1\0\10\5\1\0\2\5\4\0\2\5\27\0\16\5"+
    "\1\164\10\5\5\0\4\5\1\0\10\5\1\0\2\5"+
    "\4\0\2\5\27\0\7\5\1\165\17\5\30\0\1\166"+
    "\65\0\4\5\1\0\10\5\1\0\2\5\4\0\2\5"+
    "\27\0\2\5\1\167\24\5\5\0\4\5\1\0\10\5"+
    "\1\0\2\5\4\0\2\5\27\0\3\5\1\170\23\5"+
    "\5\0\4\5\1\0\10\5\1\0\2\5\4\0\2\5"+
    "\27\0\5\5\1\171\21\5\5\0\4\5\1\0\10\5"+
    "\1\0\2\5\4\0\1\5\1\172\27\0\7\5\1\173"+
    "\17\5\5\0\4\5\1\0\10\5\1\0\2\5\4\0"+
    "\2\5\27\0\5\5\1\174\21\5\5\0\4\5\1\0"+
    "\10\5\1\0\2\5\4\0\2\5\27\0\16\5\1\175"+
    "\10\5\5\0\4\5\1\0\10\5\1\0\1\176\1\5"+
    "\4\0\2\5\27\0\27\5\5\0\4\5\1\0\10\5"+
    "\1\0\2\5\4\0\2\5\27\0\14\5\1\177\12\5"+
    "\5\0\4\5\1\0\10\5\1\0\2\5\4\0\2\5"+
    "\27\0\4\5\1\200\22\5\5\0\4\5\1\0\10\5"+
    "\1\0\1\201\1\5\4\0\2\5\27\0\27\5\5\0"+
    "\4\5\1\0\10\5\1\0\2\5\4\0\2\5\27\0"+
    "\4\5\1\202\22\5\5\0\4\5\1\0\10\5\1\0"+
    "\2\5\4\0\2\5\27\0\2\5\1\203\24\5\5\0"+
    "\4\7\1\0\10\7\1\0\2\7\4\0\2\7\27\0"+
    "\23\7\1\204\3\7\6\0\1\142\3\0\1\142\2\0"+
    "\1\142\5\0\2\72\72\0\1\143\3\0\1\143\2\0"+
    "\1\143\100\0\4\5\1\0\10\5\1\0\1\205\1\5"+
    "\4\0\2\5\27\0\27\5\1\153\2\0\106\153\1\155"+
    "\2\0\106\155\65\0\1\206\111\0\1\207\22\0\1\161"+
    "\2\0\106\161\5\0\4\5\1\0\10\5\1\0\2\5"+
    "\4\0\1\210\1\5\27\0\27\5\5\0\4\5\1\0"+
    "\10\5\1\0\2\5\4\0\2\5\27\0\5\5\1\211"+
    "\21\5\5\0\4\5\1\0\1\5\1\212\6\5\1\0"+
    "\2\5\4\0\2\5\27\0\27\5\5\0\4\5\1\0"+
    "\10\5\1\0\1\213\1\5\4\0\2\5\27\0\27\5"+
    "\5\0\4\5\1\0\10\5\1\0\2\5\4\0\2\5"+
    "\27\0\3\5\1\214\23\5\5\0\4\5\1\0\10\5"+
    "\1\0\1\215\1\5\4\0\2\5\27\0\27\5\5\0"+
    "\4\5\1\0\10\5\1\0\2\5\4\0\2\5\27\0"+
    "\2\5\1\216\24\5\5\0\4\5\1\0\10\5\1\0"+
    "\2\5\4\0\1\217\1\5\27\0\27\5\5\0\4\5"+
    "\1\0\10\5\1\0\2\5\4\0\2\5\27\0\2\5"+
    "\1\220\24\5\5\0\4\5\1\0\10\5\1\0\1\221"+
    "\1\5\4\0\2\5\27\0\27\5\5\0\4\5\1\0"+
    "\10\5\1\0\2\5\4\0\2\5\27\0\11\5\1\222"+
    "\15\5\5\0\4\5\1\0\10\5\1\0\2\5\4\0"+
    "\2\5\27\0\5\5\1\223\21\5\5\0\4\5\1\0"+
    "\10\5\1\0\2\5\4\0\2\5\27\0\6\5\1\224"+
    "\20\5\5\0\4\5\1\0\10\5\1\0\2\5\4\0"+
    "\2\5\27\0\7\5\1\225\17\5\5\0\4\5\1\0"+
    "\10\5\1\0\2\5\4\0\1\226\1\5\27\0\27\5"+
    "\5\0\4\5\1\0\10\5\1\0\2\5\4\0\2\5"+
    "\27\0\1\5\1\227\25\5\5\0\4\7\1\0\10\7"+
    "\1\0\1\7\1\230\4\0\2\7\27\0\27\7\23\0"+
    "\1\231\116\0\1\232\64\0\4\5\1\0\4\5\1\233"+
    "\3\5\1\0\2\5\4\0\2\5\27\0\27\5\5\0"+
    "\4\5\1\0\10\5\1\0\2\5\4\0\2\5\27\0"+
    "\2\5\1\234\24\5\5\0\4\5\1\0\10\5\1\0"+
    "\2\5\4\0\2\5\27\0\7\5\1\235\17\5\5\0"+
    "\4\5\1\0\10\5\1\0\2\5\4\0\1\236\1\5"+
    "\27\0\27\5\5\0\4\5\1\0\10\5\1\0\2\5"+
    "\4\0\2\5\27\0\3\5\1\237\23\5\5\0\4\5"+
    "\1\0\10\5\1\0\2\5\4\0\2\5\27\0\6\5"+
    "\1\240\20\5\5\0\4\5\1\0\10\5\1\0\2\5"+
    "\4\0\2\5\27\0\10\5\1\241\16\5\5\0\4\5"+
    "\1\0\10\5\1\0\2\5\4\0\2\5\27\0\15\5"+
    "\1\242\11\5\5\0\4\5\1\0\10\5\1\0\2\5"+
    "\4\0\2\5\27\0\1\5\1\243\25\5\5\0\4\5"+
    "\1\0\10\5\1\0\1\244\1\5\4\0\2\5\27\0"+
    "\27\5\5\0\4\5\1\0\10\5\1\0\2\5\4\0"+
    "\2\5\27\0\11\5\1\245\15\5\5\0\4\5\1\0"+
    "\10\5\1\0\2\5\4\0\1\246\1\5\27\0\27\5"+
    "\5\0\4\7\1\0\10\7\1\0\2\7\4\0\2\7"+
    "\27\0\24\7\1\247\2\7\32\0\1\250\63\0\4\5"+
    "\1\0\10\5\1\0\2\5\4\0\2\5\27\0\1\5"+
    "\1\251\5\5\1\252\17\5\5\0\4\5\1\0\10\5"+
    "\1\0\2\5\4\0\2\5\27\0\11\5\1\253\15\5"+
    "\5\0\4\5\1\0\10\5\1\0\2\5\4\0\2\5"+
    "\27\0\5\5\1\254\21\5\5\0\4\5\1\0\10\5"+
    "\1\0\2\5\4\0\2\5\27\0\12\5\1\255\14\5"+
    "\5\0\4\5\1\0\10\5\1\0\2\5\4\0\2\5"+
    "\27\0\1\5\1\256\25\5\5\0\4\5\1\0\10\5"+
    "\1\0\2\5\4\0\1\257\1\5\27\0\27\5\5\0"+
    "\4\5\1\0\10\5\1\0\2\5\4\0\2\5\27\0"+
    "\16\5\1\260\10\5\5\0\4\5\1\0\10\5\1\0"+
    "\1\261\1\5\4\0\2\5\27\0\27\5\5\0\4\5"+
    "\1\0\10\5\1\0\2\5\4\0\2\5\27\0\12\5"+
    "\1\262\14\5\5\0\4\5\1\0\10\5\1\0\2\5"+
    "\4\0\1\5\1\263\27\0\27\5\5\0\4\7\1\0"+
    "\10\7\1\0\2\7\4\0\2\7\27\0\25\7\1\264"+
    "\1\7\5\0\4\5\1\0\10\5\1\0\2\5\4\0"+
    "\2\5\27\0\1\265\26\5\5\0\4\5\1\0\10\5"+
    "\1\0\2\5\4\0\2\5\27\0\11\5\1\266\15\5"+
    "\5\0\4\5\1\0\10\5\1\0\2\5\4\0\2\5"+
    "\27\0\5\5\1\267\21\5\5\0\4\5\1\0\10\5"+
    "\1\0\2\5\4\0\2\5\27\0\11\5\1\270\15\5"+
    "\5\0\4\5\1\0\10\5\1\0\1\271\1\5\4\0"+
    "\2\5\27\0\27\5\5\0\4\5\1\0\10\5\1\0"+
    "\2\5\4\0\1\272\1\5\27\0\27\5\5\0\4\7"+
    "\1\0\10\7\1\0\2\7\4\0\2\7\27\0\26\7"+
    "\1\273\5\0\4\5\1\0\10\5\1\0\1\274\1\5"+
    "\4\0\2\5\27\0\27\5\5\0\4\5\1\0\10\5"+
    "\1\0\2\5\4\0\2\5\27\0\12\5\1\275\14\5"+
    "\5\0\4\5\1\0\10\5\1\0\1\276\1\5\4\0"+
    "\2\5\27\0\27\5\5\0\4\5\1\0\10\5\1\0"+
    "\2\5\4\0\2\5\27\0\4\5\1\277\22\5";

  private static int [] zzUnpackTrans() {
    int [] result = new int[9125];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;
  private static final char[] EMPTY_BUFFER = new char[0];
  private static final int YYEOF = -1;
  private static java.io.Reader zzReader = null; // Fake

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unkown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\11\14\1\1\11\1\1\1\11\3\1\10\11"+
    "\1\1\7\11\2\1\4\11\14\1\1\0\1\11\3\0"+
    "\1\11\1\0\1\11\2\0\1\1\1\11\3\1\2\11"+
    "\3\0\5\1\3\11\21\1\1\0\1\11\6\1\1\11"+
    "\1\1\2\0\1\11\5\1\1\11\17\1\2\0\21\1"+
    "\1\11\1\0\15\1\1\11\27\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[191];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private CharSequence zzBuffer = "";

  /** this buffer may contains the current text array to be matched when it is cheap to acquire it */
  private char[] zzBufferArray;

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the textposition at the last state to be included in yytext */
  private int zzPushbackPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /**
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /* user code: */
  public _HaskellLexer() {
    this((java.io.Reader)null);
  }


  public _HaskellLexer(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  public _HaskellLexer(java.io.InputStream in) {
    this(new java.io.InputStreamReader(in));
  }

  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x10000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 170) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }

  public final int getTokenStart(){
    return zzStartRead;
  }

  public final int getTokenEnd(){
    return getTokenStart() + yylength();
  }

  public void reset(CharSequence buffer, int start, int end,int initialState){
    zzBuffer = buffer;
    zzBufferArray = com.intellij.util.text.CharArrayUtil.fromSequenceWithoutCopying(buffer);
    zzCurrentPos = zzMarkedPos = zzStartRead = start;
    zzPushbackPos = 0;
    zzAtEOF  = false;
    zzAtBOL = true;
    zzEndRead = end;
    yybegin(initialState);
  }

  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   *
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {
    return true;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final CharSequence yytext() {
    return zzBuffer.subSequence(zzStartRead, zzMarkedPos);
  }


  /**
   * Returns the character at position <tt>pos</tt> from the
   * matched text.
   *
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch.
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBufferArray != null ? zzBufferArray[zzStartRead+pos]:zzBuffer.charAt(zzStartRead+pos);
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of
   * yypushback(int) and a match-all fallback rule) this method
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  }


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public IElementType advance() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    CharSequence zzBufferL = zzBuffer;
    char[] zzBufferArrayL = zzBufferArray;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

      zzState = ZZ_LEXSTATE[zzLexicalState];


      zzForAction: {
        while (true) {

          if (zzCurrentPosL < zzEndReadL)
            zzInput = (zzBufferArrayL != null ? zzBufferArrayL[zzCurrentPosL++] : zzBufferL.charAt(zzCurrentPosL++));
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = (zzBufferArrayL != null ? zzBufferArrayL[zzCurrentPosL++] : zzBufferL.charAt(zzCurrentPosL++));
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          int zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
        case 8: 
          { return BACKSLASH;
          }
        case 84: break;
        case 83: 
          { return QUALIFIED;
          }
        case 85: break;
        case 61: 
          { return LET;
          }
        case 86: break;
        case 14: 
          { return LPAREN;
          }
        case 87: break;
        case 33: 
          { return QUESTION;
          }
        case 88: break;
        case 31: 
          { return EQUALS;
          }
        case 89: break;
        case 20: 
          { return RBRACKET;
          }
        case 90: break;
        case 26: 
          { return PERCENT;
          }
        case 91: break;
        case 36: 
          { return COLON;
          }
        case 92: break;
        case 80: 
          { return LINE_WS;
          }
        case 93: break;
        case 48: 
          { return LEFTARROW;
          }
        case 94: break;
        case 30: 
          { return LESSTHAN;
          }
        case 95: break;
        case 69: 
          { return CLASSTOKEN;
          }
        case 96: break;
        case 60: 
          { return OPENPRAGMA;
          }
        case 97: break;
        case 58: 
          { return CLOSEPRAGMA;
          }
        case 98: break;
        case 81: 
          { return INSTANCE;
          }
        case 99: break;
        case 5: 
          { return INTEGERTOKEN;
          }
        case 100: break;
        case 41: 
          { return DOUBLEPERIOD;
          }
        case 101: break;
        case 12: 
          { return CARET;
          }
        case 102: break;
        case 2: 
          { return com.intellij.psi.TokenType.WHITE_SPACE;
          }
        case 103: break;
        case 43: 
          { return CLOSECOM;
          }
        case 104: break;
        case 19: 
          { return LBRACKET;
          }
        case 105: break;
        case 7: 
          { return SINGLEQUOTE;
          }
        case 106: break;
        case 82: 
          { return DERIVING;
          }
        case 107: break;
        case 18: 
          { return SEMICOLON;
          }
        case 108: break;
        case 17: 
          { return COMMA;
          }
        case 109: break;
        case 64: 
          { return DATA;
          }
        case 110: break;
        case 38: 
          { return THQUOTE;
          }
        case 111: break;
        case 53: 
          { return FLOATTOKEN;
          }
        case 112: break;
        case 75: 
          { return MODULE;
          }
        case 113: break;
        case 3: 
          { return DOUBLEQUOTE;
          }
        case 114: break;
        case 10: 
          { return PLUS;
          }
        case 115: break;
        case 4: 
          { return VARIDREGEXP;
          }
        case 116: break;
        case 65: 
          { return TYPE;
          }
        case 117: break;
        case 9: 
          { return PERIOD;
          }
        case 118: break;
        case 32: 
          { return GREATERTHAN;
          }
        case 119: break;
        case 13: 
          { return HASH;
          }
        case 120: break;
        case 28: 
          { return ASTERISK;
          }
        case 121: break;
        case 71: 
          { return CPPENDIF;
          }
        case 122: break;
        case 78: 
          { return DEFAULT;
          }
        case 123: break;
        case 52: 
          { return DO;
          }
        case 124: break;
        case 46: 
          { return IN;
          }
        case 125: break;
        case 25: 
          { return DOLLAR;
          }
        case 126: break;
        case 59: 
          { return CPPIF;
          }
        case 127: break;
        case 56: 
          { return COMMENT;
          }
        case 128: break;
        case 79: 
          { return NEWTYPE;
          }
        case 129: break;
        case 77: 
          { return FOREIGN;
          }
        case 130: break;
        case 23: 
          { return RBRACE;
          }
        case 131: break;
        case 27: 
          { return AMPERSAND;
          }
        case 132: break;
        case 47: 
          { return OPENCOM;
          }
        case 133: break;
        case 21: 
          { return BACKTICK;
          }
        case 134: break;
        case 42: 
          { return DASHES;
          }
        case 135: break;
        case 76: 
          { return HIDING;
          }
        case 136: break;
        case 40: 
          { return OF;
          }
        case 137: break;
        case 68: 
          { return INFIX;
          }
        case 138: break;
        case 34: 
          { return AMPERSAT;
          }
        case 139: break;
        case 22: 
          { return LBRACE;
          }
        case 140: break;
        case 35: 
          { return TILDE;
          }
        case 141: break;
        case 57: 
          { return HADDOCK;
          }
        case 142: break;
        case 16: 
          { return PIPE;
          }
        case 143: break;
        case 49: 
          { return DOUBLEARROW;
          }
        case 144: break;
        case 29: 
          { return SLASH;
          }
        case 145: break;
        case 70: 
          { return WHERE;
          }
        case 146: break;
        case 72: 
          { return INFIXL;
          }
        case 147: break;
        case 74: 
          { return IMPORT;
          }
        case 148: break;
        case 37: 
          { return STRINGTOKEN;
          }
        case 149: break;
        case 73: 
          { return INFIXR;
          }
        case 150: break;
        case 24: 
          { return EXLAMATION;
          }
        case 151: break;
        case 62: 
          { return ELSE;
          }
        case 152: break;
        case 45: 
          { return IF;
          }
        case 153: break;
        case 55: 
          { return EOL;
          }
        case 154: break;
        case 67: 
          { return CPPELSE;
          }
        case 155: break;
        case 66: 
          { return THEN;
          }
        case 156: break;
        case 1: 
          { return com.intellij.psi.TokenType.BAD_CHARACTER;
          }
        case 157: break;
        case 44: 
          { return RIGHTARROW;
          }
        case 158: break;
        case 11: 
          { return MINUS;
          }
        case 159: break;
        case 54: 
          { return CHARTOKEN;
          }
        case 160: break;
        case 63: 
          { return CASE;
          }
        case 161: break;
        case 15: 
          { return RPAREN;
          }
        case 162: break;
        case 50: 
          { return DOUBLECOLON;
          }
        case 163: break;
        case 51: 
          { return AS;
          }
        case 164: break;
        case 39: 
          { return NULLCHARACTER;
          }
        case 165: break;
        case 6: 
          { return CONID;
          }
        case 166: break;
        default:
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            return null;
          }
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
