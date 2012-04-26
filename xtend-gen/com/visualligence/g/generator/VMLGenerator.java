package com.visualligence.g.generator;

import com.visualligence.g.vML.AuxType;
import com.visualligence.g.vML.AuxTypeRef;
import com.visualligence.g.vML.Box;
import com.visualligence.g.vML.BoxRef;
import com.visualligence.g.vML.Constant;
import com.visualligence.g.vML.ConstantRef;
import com.visualligence.g.vML.Factory;
import com.visualligence.g.vML.Import;
import com.visualligence.g.vML.InputRef;
import com.visualligence.g.vML.LStreamValue;
import com.visualligence.g.vML.LiteralExpression;
import com.visualligence.g.vML.Member;
import com.visualligence.g.vML.Module;
import com.visualligence.g.vML.NumberTypeRef;
import com.visualligence.g.vML.Op;
import com.visualligence.g.vML.Operation;
import com.visualligence.g.vML.OutputRef;
import com.visualligence.g.vML.RStreamValue;
import com.visualligence.g.vML.Sentence;
import com.visualligence.g.vML.SequenceLiteralPlain;
import com.visualligence.g.vML.SequenceLiteralSerie;
import com.visualligence.g.vML.SequenceTypeRef;
import com.visualligence.g.vML.Shape;
import com.visualligence.g.vML.ShapeRef;
import com.visualligence.g.vML.SingleLiteral;
import com.visualligence.g.vML.Stream;
import com.visualligence.g.vML.TupleItem;
import com.visualligence.g.vML.TupleLiteral;
import com.visualligence.g.vML.TypeRef;
import com.visualligence.g.vML.UnaryOperation;
import com.visualligence.g.vML.VoidTypeRef;
import java.util.Arrays;
import java.util.Date;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.generator.parser.antlr.splitting.simpleExpressions.NumberLiteral;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IntegerExtensions;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.StringExtensions;

@SuppressWarnings("all")
public class VMLGenerator implements IGenerator {
  protected CharSequence _id(final Object o) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("v_");
    int _hashCode = o.hashCode();
    _builder.append(_hashCode, "");
    return _builder;
  }
  
  protected CharSequence _id(final Constant k) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("v_k_");
    String _name = k.getName();
    _builder.append(_name, "");
    return _builder;
  }
  
  public CharSequence base(final String uri) {
    StringConcatenation _builder = new StringConcatenation();
    int _indexOf = uri.indexOf(".");
    String _substring = uri.substring(0, _indexOf);
    _builder.append(_substring, "");
    return _builder;
  }
  
  public CharSequence cName(final Resource r) {
    URI _uRI = r.getURI();
    String _lastSegment = _uRI.lastSegment();
    CharSequence _base = this.base(_lastSegment);
    return _base;
  }
  
  public String pName(final Resource r) {
    CharSequence _cName = this.cName(r);
    String _operator_plus = StringExtensions.operator_plus("com/visualligence/gen/", _cName);
    String _operator_plus_1 = StringExtensions.operator_plus(_operator_plus, "/");
    return _operator_plus_1;
  }
  
  public void doGenerate(final Resource resource, final IFileSystemAccess fsa) {
      EList<EObject> _contents = resource.getContents();
      EObject _head = IterableExtensions.<EObject>head(_contents);
      Module m = ((Module) _head);
      try {
        {
          CharSequence _txt = this.toTxt(m);
          CharSequence txt = _txt;
          String _pName = this.pName(resource);
          CharSequence _cName = this.cName(resource);
          String _operator_plus = StringExtensions.operator_plus(_pName, _cName);
          String _operator_plus_1 = StringExtensions.operator_plus(_operator_plus, ".dump.txt");
          fsa.generateFile(_operator_plus_1, txt);
          CharSequence _javaCode = this.toJavaCode(m);
          CharSequence java = _javaCode;
          String _pName_1 = this.pName(resource);
          CharSequence _cName_1 = this.cName(resource);
          String _operator_plus_2 = StringExtensions.operator_plus(_pName_1, _cName_1);
          String _operator_plus_3 = StringExtensions.operator_plus(_operator_plus_2, ".java");
          fsa.generateFile(_operator_plus_3, java);
          EList<Sentence> _sentences = m.getSentences();
          final Function1<Sentence,Boolean> _function = new Function1<Sentence,Boolean>() {
              public Boolean apply(final Sentence e) {
                return Boolean.valueOf((e instanceof Box));
              }
            };
          Iterable<Sentence> _filter = IterableExtensions.<Sentence>filter(_sentences, _function);
          for (final Sentence s : _filter) {
            {
              CharSequence _javaCodeBox = this.toJavaCodeBox(((Box) s), m);
              CharSequence java_box = _javaCodeBox;
              String _pName_2 = this.pName(resource);
              String _name = ((Box) s).getName();
              String _operator_plus_4 = StringExtensions.operator_plus(_pName_2, _name);
              String _operator_plus_5 = StringExtensions.operator_plus(_operator_plus_4, ".java");
              String java_box_filename = _operator_plus_5;
              fsa.generateFile(java_box_filename, java_box);
            }
          }
        }
      } catch (final Throwable _t) {
        if (_t instanceof Exception) {
          final Exception e = (Exception)_t;
          {
            String _operator_plus_6 = StringExtensions.operator_plus("/*", e);
            String _operator_plus_7 = StringExtensions.operator_plus(_operator_plus_6, "*/");
            String error = _operator_plus_7;
            String _pName_3 = this.pName(resource);
            CharSequence _cName_2 = this.cName(resource);
            String _operator_plus_8 = StringExtensions.operator_plus(_pName_3, _cName_2);
            String _operator_plus_9 = StringExtensions.operator_plus(_operator_plus_8, ".java");
            fsa.generateFile(_operator_plus_9, error);
          }
        } else {
          throw Exceptions.sneakyThrow(_t);
        }
      }
  }
  
  public CharSequence automark() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("File autogenerated by VML at ");
    Date _date = new Date();
    _builder.append(_date, "");
    return _builder;
  }
  
  public CharSequence toJavaCode(final Module m) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("/* Module ");
    String _name = m.getName();
    _builder.append(_name, "");
    _builder.newLineIfNotEmpty();
    _builder.append(" ");
    _builder.append("*");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* ");
    CharSequence _automark = this.automark();
    _builder.append(_automark, " ");
    _builder.newLineIfNotEmpty();
    _builder.append(" ");
    _builder.append("*");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* Author: ");
    String _author = m.getAuthor();
    String _string = _author==null?(String)null:_author.toString();
    _builder.append(_string, " ");
    _builder.newLineIfNotEmpty();
    _builder.append(" ");
    _builder.append("* More info: ");
    String _link = m.getLink();
    String _string_1 = _link==null?(String)null:_link.toString();
    _builder.append(_string_1, " ");
    _builder.newLineIfNotEmpty();
    _builder.append(" ");
    _builder.append("* Creation date: ");
    String _creation = m.getCreation();
    String _string_2 = _creation==null?(String)null:_creation.toString();
    _builder.append(_string_2, " ");
    _builder.newLineIfNotEmpty();
    _builder.append(" ");
    _builder.append("*");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*/");
    _builder.newLine();
    _builder.newLine();
    _builder.append("package com.visualligence.gen.");
    String _name_1 = m.getName();
    _builder.append(_name_1, "");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("import com.visualligence.g.vm.core.*;");
    _builder.newLine();
    _builder.append("import com.visualligence.g.vm.util.*;");
    _builder.newLine();
    _builder.append("import com.visualligence.g.vm.types.*;");
    _builder.newLine();
    _builder.append("import com.visualligence.g.vm.streams.*;");
    _builder.newLine();
    _builder.append("import com.visualligence.g.vm.constants.*;");
    _builder.newLine();
    _builder.append("import com.visualligence.g.vm.sequences.*;");
    _builder.newLine();
    _builder.append("import com.visualligence.g.vm.factories.*;");
    _builder.newLine();
    _builder.append("import com.visualligence.g.vm.operations.*;");
    _builder.newLine();
    _builder.append("import com.visualligence.g.vm.expressions.*;");
    _builder.newLine();
    _builder.append("import com.visualligence.g.vm.comparators.*;");
    _builder.newLine();
    _builder.newLine();
    {
      EList<Import> _imports = m.getImports();
      for(final Import i : _imports) {
        _builder.append("import com.visualligence.gen.");
        String _importURI = i.getImportURI();
        CharSequence _base = this.base(_importURI);
        _builder.append(_base, "");
        _builder.append(".*;");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      EList<Sentence> _sentences = m.getSentences();
      for(final Sentence s : _sentences) {
        CharSequence _javaCodePrev = this.toJavaCodePrev(s);
        _builder.append(_javaCodePrev, "");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.newLine();
    _builder.append("public class ");
    Resource _eResource = m.eResource();
    CharSequence _cName = this.cName(_eResource);
    _builder.append(_cName, "");
    _builder.append(" extends Node<");
    TypeRef _inputtype = m.getInputtype();
    CharSequence _type = _inputtype==null?(CharSequence)null:this.toType(_inputtype);
    _builder.append(_type, "");
    _builder.append(",");
    TypeRef _outputtype = m.getOutputtype();
    CharSequence _type_1 = _outputtype==null?(CharSequence)null:this.toType(_outputtype);
    _builder.append(_type_1, "");
    _builder.append(">{");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public static void main(String[] args) {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("System.out.println(\"Content-type: text/plain;\\n\");");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("long start = System.currentTimeMillis();");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("new ");
    Resource _eResource_1 = m.eResource();
    CharSequence _cName_1 = this.cName(_eResource_1);
    _builder.append(_cName_1, "		");
    _builder.append("().run();");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("long end = System.currentTimeMillis();");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("System.err.println((end-start) + \"ms.\");");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public void run( StreamInput<");
    TypeRef _inputtype_1 = m.getInputtype();
    CharSequence _type_2 = _inputtype_1==null?(CharSequence)null:this.toType(_inputtype_1);
    _builder.append(_type_2, "	");
    _builder.append("> sin, StreamOutput<");
    TypeRef _outputtype_1 = m.getOutputtype();
    CharSequence _type_3 = _outputtype_1==null?(CharSequence)null:this.toType(_outputtype_1);
    _builder.append(_type_3, "	");
    _builder.append("> sout )");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("{");
    _builder.newLine();
    {
      EList<Sentence> _sentences_1 = m.getSentences();
      for(final Sentence s_1 : _sentences_1) {
        _builder.append("\t\t");
        CharSequence _javaCodeDecl = this.toJavaCodeDecl(s_1);
        _builder.append(_javaCodeDecl, "		");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      EList<Sentence> _sentences_2 = m.getSentences();
      for(final Sentence s_2 : _sentences_2) {
        _builder.append("\t\t");
        CharSequence _javaCodeUsage = this.toJavaCodeUsage(s_2);
        _builder.append(_javaCodeUsage, "		");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t\t");
    _builder.append("sout.exec();");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence toJavaCodeBox(final Box b, final Module m) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("/* Box ");
    String _name = m.getName();
    _builder.append(_name, "");
    _builder.newLineIfNotEmpty();
    _builder.append(" ");
    _builder.append("*");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* ");
    CharSequence _automark = this.automark();
    _builder.append(_automark, " ");
    _builder.newLineIfNotEmpty();
    _builder.append(" ");
    _builder.append("*");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*/");
    _builder.newLine();
    _builder.newLine();
    _builder.append("package com.visualligence.gen.");
    String _name_1 = m.getName();
    _builder.append(_name_1, "");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("import com.visualligence.g.vm.core.*;");
    _builder.newLine();
    _builder.append("import com.visualligence.g.vm.util.*;");
    _builder.newLine();
    _builder.append("import com.visualligence.g.vm.types.*;");
    _builder.newLine();
    _builder.append("import com.visualligence.g.vm.streams.*;");
    _builder.newLine();
    _builder.append("import com.visualligence.g.vm.constants.*;");
    _builder.newLine();
    _builder.append("import com.visualligence.g.vm.sequences.*;");
    _builder.newLine();
    _builder.append("import com.visualligence.g.vm.factories.*;");
    _builder.newLine();
    _builder.append("import com.visualligence.g.vm.operations.*;");
    _builder.newLine();
    _builder.append("import com.visualligence.g.vm.expressions.*;");
    _builder.newLine();
    _builder.append("import com.visualligence.g.vm.comparators.*;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("public class ");
    String _name_2 = b.getName();
    _builder.append(_name_2, "");
    _builder.append(" extends VTuple{");
    _builder.newLineIfNotEmpty();
    {
      EList<Member> _members = b.getMembers();
      for(final Member f : _members) {
        _builder.append("\t");
        TypeRef _type = f.getType();
        CharSequence _type_1 = this.toType(_type);
        _builder.append(_type_1, "	");
        _builder.append(" ");
        String _name_3 = f.getName();
        _builder.append(_name_3, "	");
        _builder.append(";");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence _toType(final TypeRef tr) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _id = this.id(tr);
    _builder.append(_id, "");
    return _builder;
  }
  
  protected CharSequence _toType(final NumberTypeRef nt) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("VScalar");
    return _builder;
  }
  
  protected CharSequence _toType(final SequenceTypeRef sq) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("VSequence<");
    TypeRef _type = sq.getType();
    CharSequence _type_1 = this.toType(_type);
    _builder.append(_type_1, "");
    _builder.append(">");
    return _builder;
  }
  
  protected CharSequence _toType(final BoxRef br) {
    StringConcatenation _builder = new StringConcatenation();
    Box _ref = br.getRef();
    String _name = _ref.getName();
    _builder.append(_name, "");
    return _builder;
  }
  
  protected CharSequence _toType(final VoidTypeRef v) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("VVoid");
    return _builder;
  }
  
  protected CharSequence _toType(final AuxTypeRef at) {
    String _switchResult = null;
    AuxType _ref = at.getRef();
    final AuxType __valOfSwitchOver = _ref;
    boolean matched = false;
    if (!matched) {
      if (ObjectExtensions.operator_equals(__valOfSwitchOver,AuxType.BOOL)) {
        matched=true;
        _switchResult = "VBool";
      }
    }
    if (!matched) {
      if (ObjectExtensions.operator_equals(__valOfSwitchOver,AuxType.STRING)) {
        matched=true;
        _switchResult = "VString";
      }
    }
    return _switchResult;
  }
  
  protected CharSequence _toJavaCodePrev(final EObject e) {
    StringConcatenation _builder = new StringConcatenation();
    return _builder;
  }
  
  protected CharSequence _toJavaCodeDecl(final EObject e) {
    StringConcatenation _builder = new StringConcatenation();
    return _builder;
  }
  
  protected CharSequence _toJavaCodeUsage(final EObject e) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("// ");
    Class<? extends Object> _class = e.getClass();
    String _name = _class.getName();
    _builder.append(_name, "");
    _builder.append(" - ");
    CharSequence _id = this.id(e);
    _builder.append(_id, "");
    _builder.append(" - ");
    CharSequence _txtSig = this.toTxtSig(e);
    _builder.append(_txtSig, "");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  protected CharSequence _toLeftRef(final LStreamValue lsv, final String right) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("//");
    CharSequence _id = this.id(lsv);
    _builder.append(_id, "");
    _builder.append(" <- ");
    _builder.append(right, "");
    _builder.append(";");
    return _builder;
  }
  
  protected CharSequence _toLeftRef(final OutputRef o, final String right) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("sout.attach(");
    _builder.append(right, "");
    _builder.append(");");
    return _builder;
  }
  
  protected CharSequence _toRightRef(final RStreamValue rsv) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _id = this.id(rsv);
    _builder.append(_id, "");
    return _builder;
  }
  
  protected CharSequence _toRightRef(final ConstantRef kref) {
    StringConcatenation _builder = new StringConcatenation();
    Constant _constantref = kref.getConstantref();
    CharSequence _id = this.id(_constantref);
    _builder.append(_id, "");
    return _builder;
  }
  
  protected CharSequence _toRightRef(final InputRef i) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("sin");
    return _builder;
  }
  
  protected CharSequence _toJavaCodeDecl(final Stream s) {
    StringConcatenation _builder = new StringConcatenation();
    LStreamValue _left = s.getLeft();
    CharSequence _javaCodeDecl = this.toJavaCodeDecl(_left);
    _builder.append(_javaCodeDecl, "");
    _builder.newLineIfNotEmpty();
    RStreamValue _right = s.getRight();
    CharSequence _javaCodeDecl_1 = this.toJavaCodeDecl(_right);
    _builder.append(_javaCodeDecl_1, "");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  protected CharSequence _toJavaCodeUsage(final Stream s) {
    StringConcatenation _builder = new StringConcatenation();
    LStreamValue _left = s.getLeft();
    RStreamValue _right = s.getRight();
    CharSequence _rightRef = this.toRightRef(_right);
    String _string = _rightRef.toString();
    CharSequence _leftRef = this.toLeftRef(_left, _string);
    _builder.append(_leftRef, "");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  protected CharSequence _toJavaCodeDecl(final Operation oper) {
    CharSequence _xblockexpression = null;
    {
      String _switchResult = null;
      Op _op = oper.getOp();
      final Op __valOfSwitchOver = _op;
      boolean matched = false;
      if (!matched) {
        if (ObjectExtensions.operator_equals(__valOfSwitchOver,Op.PLUS)) {
          matched=true;
          _switchResult = "Plus";
        }
      }
      if (!matched) {
        if (ObjectExtensions.operator_equals(__valOfSwitchOver,Op.MINUS)) {
          matched=true;
          _switchResult = "Minus";
        }
      }
      if (!matched) {
        if (ObjectExtensions.operator_equals(__valOfSwitchOver,Op.TIMES)) {
          matched=true;
          _switchResult = "Times";
        }
      }
      if (!matched) {
        if (ObjectExtensions.operator_equals(__valOfSwitchOver,Op.DIVIDEBY)) {
          matched=true;
          _switchResult = "DivideBy";
        }
      }
      if (!matched) {
        if (ObjectExtensions.operator_equals(__valOfSwitchOver,Op.INTDIVISION)) {
          matched=true;
          _switchResult = "IntDivision";
        }
      }
      if (!matched) {
        if (ObjectExtensions.operator_equals(__valOfSwitchOver,Op.MODULO)) {
          matched=true;
          _switchResult = "Modulo";
        }
      }
      String opt = _switchResult;
      StringConcatenation _builder = new StringConcatenation();
      _builder.append(opt, "");
      _builder.append("<VVoid> ");
      CharSequence _id = this.id(oper);
      _builder.append(_id, "");
      _builder.append(" = new ");
      _builder.append(opt, "");
      _builder.append("<VVoid>(");
      LiteralExpression _left = oper.getLeft();
      CharSequence _id_1 = _left==null?(CharSequence)null:this.id(_left);
      _builder.append(_id_1, "");
      _builder.append(",");
      LiteralExpression _right = oper.getRight();
      CharSequence _id_2 = _right==null?(CharSequence)null:this.id(_right);
      _builder.append(_id_2, "");
      _builder.append(");");
      _xblockexpression = (_builder);
    }
    return _xblockexpression;
  }
  
  protected CharSequence _toJavaCodeDecl(final UnaryOperation oper) {
    CharSequence _xblockexpression = null;
    {
      String _switchResult = null;
      Op _op = oper.getOp();
      final Op __valOfSwitchOver = _op;
      boolean matched = false;
      if (!matched) {
        if (ObjectExtensions.operator_equals(__valOfSwitchOver,Op.PLUS)) {
          matched=true;
          _switchResult = "Plus";
        }
      }
      if (!matched) {
        if (ObjectExtensions.operator_equals(__valOfSwitchOver,Op.MINUS)) {
          matched=true;
          _switchResult = "Minus";
        }
      }
      if (!matched) {
        if (ObjectExtensions.operator_equals(__valOfSwitchOver,Op.TIMES)) {
          matched=true;
          _switchResult = "Times";
        }
      }
      if (!matched) {
        if (ObjectExtensions.operator_equals(__valOfSwitchOver,Op.DIVIDEBY)) {
          matched=true;
          _switchResult = "DivideBy";
        }
      }
      if (!matched) {
        if (ObjectExtensions.operator_equals(__valOfSwitchOver,Op.INTDIVISION)) {
          matched=true;
          _switchResult = "IntDivision";
        }
      }
      if (!matched) {
        if (ObjectExtensions.operator_equals(__valOfSwitchOver,Op.MODULO)) {
          matched=true;
          _switchResult = "Modulo";
        }
      }
      String opt = _switchResult;
      StringConcatenation _builder = new StringConcatenation();
      _builder.append(opt, "");
      _builder.append("<VVoid> ");
      CharSequence _id = this.id(oper);
      _builder.append(_id, "");
      _builder.append(" = new ");
      _builder.append(opt, "");
      _builder.append("<VVoid>(");
      LiteralExpression _right = oper.getRight();
      CharSequence _id_1 = _right==null?(CharSequence)null:this.id(_right);
      _builder.append(_id_1, "");
      _builder.append(");");
      _xblockexpression = (_builder);
    }
    return _xblockexpression;
  }
  
  protected CharSequence _toJavaCodeDecl(final SingleLiteral sl) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("VScalar ");
    CharSequence _id = this.id(sl);
    _builder.append(_id, "");
    _builder.append(" = new VScalar(");
    String _value = sl.getValue();
    _builder.append(_value, "");
    _builder.append(");");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  protected CharSequence _toJavaCodeDecl(final Constant c) {
    StringConcatenation _builder = new StringConcatenation();
    LiteralExpression _value = c.getValue();
    CharSequence _javaCodeDecl = this.toJavaCodeDecl(_value);
    _builder.append(_javaCodeDecl, "");
    _builder.newLineIfNotEmpty();
    _builder.append("Constant<");
    TypeRef _type = c.getType();
    CharSequence _type_1 = this.toType(_type);
    _builder.append(_type_1, "");
    _builder.append("> ");
    CharSequence _id = this.id(c);
    _builder.append(_id, "");
    _builder.append(" = new Constant<");
    TypeRef _type_2 = c.getType();
    CharSequence _type_3 = this.toType(_type_2);
    _builder.append(_type_3, "");
    _builder.append(">(");
    LiteralExpression _value_1 = c.getValue();
    CharSequence _id_1 = this.id(_value_1);
    _builder.append(_id_1, "");
    _builder.append(");");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  protected CharSequence _toJavaCodeDecl(final Factory f) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("FFactory f");
    int _hashCode = f.hashCode();
    _builder.append(_hashCode, "");
    _builder.append(" = new FFactory(\"");
    TypeRef _type = f.getType();
    CharSequence _txtSig = this.toTxtSig(_type);
    _builder.append(_txtSig, "");
    _builder.append("\");");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  protected CharSequence _toStreamInputCode(final InputRef i, final int h) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Object a");
    _builder.append(h, "");
    _builder.append(" = in.next();");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  protected CharSequence _toStreamInputCode(final ConstantRef c, final int h) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Object a");
    _builder.append(h, "");
    _builder.append(" = c");
    Constant _constantref = c.getConstantref();
    int _hashCode = _constantref.hashCode();
    _builder.append(_hashCode, "");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence toLiteral(final SequenceLiteralPlain t, final String c) {
    StringConcatenation _builder = new StringConcatenation();
    {
      EList<LiteralExpression> _items = t.getItems();
      for(final LiteralExpression i : _items) {
        _builder.append(c, "");
        _builder.append(".add(\"");
        CharSequence _id = this.id(i);
        _builder.append(_id, "");
        _builder.append("\");");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  public CharSequence toTxtSig(final EObject e) {
    StringConcatenation _builder = new StringConcatenation();
    EClass _eClass = e.eClass();
    String _name = _eClass.getName();
    _builder.append(_name, "");
    _builder.append(" ");
    String _string = e.toString();
    String _replaceFirst = _string.replaceFirst("[^(]*", "");
    _builder.append(_replaceFirst, "");
    return _builder;
  }
  
  protected CharSequence _toTxt(final Void n) {
    StringConcatenation _builder = new StringConcatenation();
    return _builder;
  }
  
  protected CharSequence _toTxt(final ConstantRef c) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("k(");
    Constant _constantref = c.getConstantref();
    String _name = _constantref.getName();
    _builder.append(_name, "");
    _builder.append(")");
    return _builder;
  }
  
  protected CharSequence _toTxt(final Operation o) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("(");
    LiteralExpression _left = o.getLeft();
    CharSequence _txt = this.toTxt(_left);
    _builder.append(_txt, "");
    _builder.append(")");
    Op _op = o.getOp();
    _builder.append(_op, "");
    _builder.append("(");
    LiteralExpression _right = o.getRight();
    CharSequence _txt_1 = this.toTxt(_right);
    _builder.append(_txt_1, "");
    _builder.append(")");
    return _builder;
  }
  
  protected CharSequence _toTxt(final UnaryOperation o) {
    StringConcatenation _builder = new StringConcatenation();
    Op _op = o.getOp();
    _builder.append(_op, "");
    _builder.append("(");
    LiteralExpression _right = o.getRight();
    CharSequence _txt = this.toTxt(_right);
    _builder.append(_txt, "");
    _builder.append(")");
    return _builder;
  }
  
  protected CharSequence _toTxt(final ShapeRef s) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("~> ");
    Shape _ref = s.getRef();
    String _name = _ref.getName();
    _builder.append(_name, "");
    return _builder;
  }
  
  protected CharSequence _toTxt(final NumberLiteral nl) {
    StringConcatenation _builder = new StringConcatenation();
    int _value = nl.getValue();
    _builder.append(_value, "");
    return _builder;
  }
  
  protected CharSequence _toTxt(final TupleLiteral t) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("(");
    {
      EList<TupleItem> _items = t.getItems();
      for(final TupleItem i : _items) {
        _builder.append(" ");
        CharSequence _txtSig = this.toTxtSig(i);
        _builder.append(_txtSig, "");
        _builder.append(" ,");
      }
    }
    _builder.append(")");
    return _builder;
  }
  
  protected CharSequence _toTxt(final SequenceLiteralSerie t) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("[");
    LiteralExpression _init = t.getInit();
    CharSequence _txtSig = this.toTxtSig(_init);
    _builder.append(_txtSig, "");
    _builder.append("->");
    LiteralExpression _end = t.getEnd();
    CharSequence _txtSig_1 = this.toTxtSig(_end);
    _builder.append(_txtSig_1, "");
    _builder.append(",>");
    LiteralExpression _inc = t.getInc();
    CharSequence _txtSig_2 = this.toTxtSig(_inc);
    _builder.append(_txtSig_2, "");
    _builder.append("]");
    return _builder;
  }
  
  protected CharSequence _toTxt(final SequenceLiteralPlain t) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("[");
    {
      EList<LiteralExpression> _items = t.getItems();
      for(final LiteralExpression i : _items) {
        _builder.append(" ");
        CharSequence _txtSig = this.toTxtSig(i);
        _builder.append(_txtSig, "");
        _builder.append(" ,");
      }
    }
    _builder.append("]");
    return _builder;
  }
  
  protected CharSequence _toTxt(final EObject m) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _txtSig = this.toTxtSig(m);
    _builder.append(_txtSig, "");
    _builder.newLineIfNotEmpty();
    {
      EList<EObject> _eCrossReferences = m.eCrossReferences();
      int _size = _eCrossReferences.size();
      EList<EObject> _eContents = m.eContents();
      int _size_1 = _eContents.size();
      int _operator_plus = IntegerExtensions.operator_plus(_size, _size_1);
      boolean _operator_greaterThan = IntegerExtensions.operator_greaterThan(_operator_plus, 0);
      if (_operator_greaterThan) {
        {
          EList<EObject> _eCrossReferences_1 = m.eCrossReferences();
          for(final EObject ref : _eCrossReferences_1) {
            _builder.append("\t");
            _builder.append("-> ");
            CharSequence _txtSig_1 = this.toTxtSig(ref);
            _builder.append(_txtSig_1, "	");
            _builder.newLineIfNotEmpty();
          }
        }
        {
          EList<EObject> _eContents_1 = m.eContents();
          for(final EObject child : _eContents_1) {
            _builder.append("\t");
            _builder.append("<> ");
            CharSequence _txt = this.toTxt(child);
            _builder.append(_txt, "	");
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    return _builder;
  }
  
  public CharSequence id(final Object k) {
    if (k instanceof Constant) {
      return _id((Constant)k);
    } else if (k != null) {
      return _id(k);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(k).toString());
    }
  }
  
  public CharSequence toType(final TypeRef at) {
    if (at instanceof AuxTypeRef) {
      return _toType((AuxTypeRef)at);
    } else if (at instanceof BoxRef) {
      return _toType((BoxRef)at);
    } else if (at instanceof NumberTypeRef) {
      return _toType((NumberTypeRef)at);
    } else if (at instanceof SequenceTypeRef) {
      return _toType((SequenceTypeRef)at);
    } else if (at instanceof VoidTypeRef) {
      return _toType((VoidTypeRef)at);
    } else if (at != null) {
      return _toType(at);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(at).toString());
    }
  }
  
  public CharSequence toJavaCodePrev(final EObject e) {
    {
      return _toJavaCodePrev(e);
    }
  }
  
  public CharSequence toJavaCodeDecl(final EObject sl) {
    if (sl instanceof SingleLiteral) {
      return _toJavaCodeDecl((SingleLiteral)sl);
    } else if (sl instanceof Factory) {
      return _toJavaCodeDecl((Factory)sl);
    } else if (sl instanceof Operation) {
      return _toJavaCodeDecl((Operation)sl);
    } else if (sl instanceof UnaryOperation) {
      return _toJavaCodeDecl((UnaryOperation)sl);
    } else if (sl instanceof Constant) {
      return _toJavaCodeDecl((Constant)sl);
    } else if (sl instanceof Stream) {
      return _toJavaCodeDecl((Stream)sl);
    } else if (sl != null) {
      return _toJavaCodeDecl(sl);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(sl).toString());
    }
  }
  
  public CharSequence toJavaCodeUsage(final EObject s) {
    if (s instanceof Stream) {
      return _toJavaCodeUsage((Stream)s);
    } else if (s != null) {
      return _toJavaCodeUsage(s);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(s).toString());
    }
  }
  
  public CharSequence toLeftRef(final LStreamValue o, final String right) {
    if (o instanceof OutputRef) {
      return _toLeftRef((OutputRef)o, right);
    } else if (o != null) {
      return _toLeftRef(o, right);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(o, right).toString());
    }
  }
  
  public CharSequence toRightRef(final RStreamValue kref) {
    if (kref instanceof ConstantRef) {
      return _toRightRef((ConstantRef)kref);
    } else if (kref instanceof InputRef) {
      return _toRightRef((InputRef)kref);
    } else if (kref != null) {
      return _toRightRef(kref);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(kref).toString());
    }
  }
  
  public CharSequence toStreamInputCode(final RStreamValue c, final int h) {
    if (c instanceof ConstantRef) {
      return _toStreamInputCode((ConstantRef)c, h);
    } else if (c instanceof InputRef) {
      return _toStreamInputCode((InputRef)c, h);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(c, h).toString());
    }
  }
  
  public CharSequence toTxt(final EObject t) {
    if (t instanceof SequenceLiteralPlain) {
      return _toTxt((SequenceLiteralPlain)t);
    } else if (t instanceof SequenceLiteralSerie) {
      return _toTxt((SequenceLiteralSerie)t);
    } else if (t instanceof ConstantRef) {
      return _toTxt((ConstantRef)t);
    } else if (t instanceof TupleLiteral) {
      return _toTxt((TupleLiteral)t);
    } else if (t instanceof Operation) {
      return _toTxt((Operation)t);
    } else if (t instanceof ShapeRef) {
      return _toTxt((ShapeRef)t);
    } else if (t instanceof UnaryOperation) {
      return _toTxt((UnaryOperation)t);
    } else if (t instanceof NumberLiteral) {
      return _toTxt((NumberLiteral)t);
    } else if (t != null) {
      return _toTxt(t);
    } else if (t == null) {
      return _toTxt((Void)null);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(t).toString());
    }
  }
}
