package send.point.generator.templates;

/*Generated by MPS */

import jetbrains.mps.generator.runtime.Generated;
import jetbrains.mps.generator.impl.query.QueryProviderBase;
import jetbrains.mps.generator.template.PropertyMacroContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.generator.template.ReferenceMacroContext;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.generator.template.SourceSubstituteMacroNodesContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import java.util.Map;
import jetbrains.mps.generator.impl.query.SourceNodesQuery;
import java.util.HashMap;
import org.jetbrains.annotations.NotNull;
import jetbrains.mps.generator.impl.query.QueryKey;
import java.util.Collection;
import jetbrains.mps.generator.impl.GenerationFailureException;
import jetbrains.mps.util.IterableUtil;
import jetbrains.mps.generator.impl.query.PropertyValueQuery;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import org.jetbrains.mps.openapi.language.SProperty;
import org.jetbrains.annotations.Nullable;
import jetbrains.mps.generator.impl.query.ReferenceTargetQuery;
import org.jetbrains.mps.openapi.language.SContainmentLink;

@Generated
public class QueriesGenerated extends QueryProviderBase {
  public QueriesGenerated() {
    super(1);
  }
  public static Object propertyMacro_GetValue_1_0(final PropertyMacroContext _context) {
    return _context.createUniqueName("sendPoint", null);
  }
  public static Object propertyMacro_GetValue_1_1(final PropertyMacroContext _context) {
    return SPropertyOperations.getString(_context.getNode(), PROPS.name$MnvL);
  }
  public static Object propertyMacro_GetValue_2_0(final PropertyMacroContext _context) {
    return _context.createUniqueName("addressField", null);
  }
  public static Object propertyMacro_GetValue_2_1(final PropertyMacroContext _context) {
    return _context.createUniqueName("parameterField", null);
  }
  public static Object propertyMacro_GetValue_2_2(final PropertyMacroContext _context) {
    return _context.createUniqueName("pathVariableField", null);
  }
  public static Object propertyMacro_GetValue_2_3(final PropertyMacroContext _context) {
    return _context.createUniqueName(SPropertyOperations.getString(_context.getNode(), PROPS.name$MnvL) + "bodyField", null);
  }
  public static Object propertyMacro_GetValue_2_4(final PropertyMacroContext _context) {
    return _context.createUniqueName("sendButton", null);
  }
  public static Object propertyMacro_GetValue_2_5(final PropertyMacroContext _context) {
    return _context.createUniqueName("method", null);
  }
  public static Object propertyMacro_GetValue_2_6(final PropertyMacroContext _context) {
    return _context.createUniqueName("responseStatus", null);
  }
  public static Object propertyMacro_GetValue_2_7(final PropertyMacroContext _context) {
    return _context.createUniqueName("responseBody", null);
  }
  public static Object propertyMacro_GetValue_2_8(final PropertyMacroContext _context) {
    return SPropertyOperations.getString(_context.getNode(), PROPS.name$MnvL);
  }
  public static Object propertyMacro_GetValue_2_9(final PropertyMacroContext _context) {
    return SPropertyOperations.getString(_context.getNode(), PROPS.name$MnvL);
  }
  public static Object propertyMacro_GetValue_2_10(final PropertyMacroContext _context) {
    return SPropertyOperations.getString(_context.getNode(), PROPS.name$MnvL);
  }
  public static Object propertyMacro_GetValue_2_11(final PropertyMacroContext _context) {
    return SPropertyOperations.getString(_context.getNode(), PROPS.name$MnvL);
  }
  public static Object referenceMacro_GetReferent_2_0(final ReferenceMacroContext _context) {
    return _context.getOutputNodeByInputNodeAndMappingLabel(_context.getNode(), "ParameterFieldDecoration");
  }
  public static Object referenceMacro_GetReferent_2_1(final ReferenceMacroContext _context) {
    return _context.getOutputNodeByInputNodeAndMappingLabel(_context.getNode(), "PathVariableFieldDecoration");
  }
  public static Object referenceMacro_GetReferent_2_2(final ReferenceMacroContext _context) {
    return _context.getOutputNodeByInputNodeAndMappingLabel(_context.getNode(), "AddressFieldDecoration");
  }
  public static Object referenceMacro_GetReferent_2_3(final ReferenceMacroContext _context) {
    return _context.getOutputNodeByInputNodeAndMappingLabel(_context.getNode(), "ParameterFieldDecoration");
  }
  public static Object referenceMacro_GetReferent_2_4(final ReferenceMacroContext _context) {
    return _context.getOutputNodeByInputNodeAndMappingLabel(_context.getNode(), "PathVariableFieldDecoration");
  }
  public static Object referenceMacro_GetReferent_2_5(final ReferenceMacroContext _context) {
    return _context.getOutputNodeByInputNodeAndMappingLabel(_context.getNode(), "BodyFieldDecoration");
  }
  public static Object referenceMacro_GetReferent_2_6(final ReferenceMacroContext _context) {
    return _context.getOutputNodeByInputNodeAndMappingLabel(_context.getNode(), "SendButtonDecoration");
  }
  public static Object referenceMacro_GetReferent_2_7(final ReferenceMacroContext _context) {
    return _context.getOutputNodeByInputNodeAndMappingLabel(_context.getNode(), "MethodFieldDecoration");
  }
  public static Object referenceMacro_GetReferent_2_8(final ReferenceMacroContext _context) {
    return _context.getOutputNodeByInputNodeAndMappingLabel(_context.getNode(), "ResponseStatusFieldDecoration");
  }
  public static Object referenceMacro_GetReferent_2_9(final ReferenceMacroContext _context) {
    return _context.getOutputNodeByInputNodeAndMappingLabel(_context.getNode(), "ResponseBodyFieldDecoration");
  }
  public static Iterable<SNode> sourceNodesQuery_1_0(final SourceSubstituteMacroNodesContext _context) {
    return SLinkOperations.getChildren(_context.getNode(), LINKS.SendPoint$sqgP);
  }
  public static Iterable<SNode> sourceNodesQuery_1_1(final SourceSubstituteMacroNodesContext _context) {
    return SLinkOperations.getChildren(_context.getNode(), LINKS.SendPoint$sqgP);
  }
  public static Iterable<SNode> sourceNodesQuery_2_0(final SourceSubstituteMacroNodesContext _context) {
    return SLinkOperations.getChildren(_context.getNode(), LINKS.parameter$zeph);
  }
  public static Iterable<SNode> sourceNodesQuery_2_1(final SourceSubstituteMacroNodesContext _context) {
    return SLinkOperations.getChildren(_context.getNode(), LINKS.variable$lXsj);
  }
  public static Iterable<SNode> sourceNodesQuery_2_2(final SourceSubstituteMacroNodesContext _context) {
    return SLinkOperations.getChildren(_context.getNode(), LINKS.parameter$zeph);
  }
  public static Iterable<SNode> sourceNodesQuery_2_3(final SourceSubstituteMacroNodesContext _context) {
    return SLinkOperations.getChildren(_context.getNode(), LINKS.variable$lXsj);
  }
  public static Iterable<SNode> sourceNodesQuery_2_4(final SourceSubstituteMacroNodesContext _context) {
    return SLinkOperations.getChildren(_context.getNode(), LINKS.parameter$zeph);
  }
  public static Iterable<SNode> sourceNodesQuery_2_5(final SourceSubstituteMacroNodesContext _context) {
    return SLinkOperations.getChildren(_context.getNode(), LINKS.variable$lXsj);
  }
  private final Map<String, SourceNodesQuery> snsqMethods = new HashMap<String, SourceNodesQuery>();
  {
    int i = 0;
    snsqMethods.put("2042270437839413595", new SNsQ(i++));
    snsqMethods.put("2042270437839516334", new SNsQ(i++));
    snsqMethods.put("7184735009877408670", new SNsQ(i++));
    snsqMethods.put("4620405792280132641", new SNsQ(i++));
    snsqMethods.put("8579157963846899922", new SNsQ(i++));
    snsqMethods.put("1711265974708387279", new SNsQ(i++));
    snsqMethods.put("7184735009877768879", new SNsQ(i++));
    snsqMethods.put("4620405792280845911", new SNsQ(i++));
  }
  @NotNull
  @Override
  public SourceNodesQuery getSourceNodesQuery(@NotNull QueryKey identity) {
    SourceNodesQuery query = identity.forFunctionNode(snsqMethods);
    return (query != null ? query : super.getSourceNodesQuery(identity));
  }
  private static class SNsQ implements SourceNodesQuery {
    private final int methodKey;
    public SNsQ(int methodKey) {
      this.methodKey = methodKey;
    }
    @NotNull
    public Collection<SNode> evaluate(@NotNull SourceSubstituteMacroNodesContext ctx) throws GenerationFailureException {
      switch (methodKey) {
        case 0:
          return IterableUtil.asCollection(QueriesGenerated.sourceNodesQuery_1_0(ctx));
        case 1:
          return IterableUtil.asCollection(QueriesGenerated.sourceNodesQuery_1_1(ctx));
        case 2:
          return IterableUtil.asCollection(QueriesGenerated.sourceNodesQuery_2_0(ctx));
        case 3:
          return IterableUtil.asCollection(QueriesGenerated.sourceNodesQuery_2_1(ctx));
        case 4:
          return IterableUtil.asCollection(QueriesGenerated.sourceNodesQuery_2_2(ctx));
        case 5:
          return IterableUtil.asCollection(QueriesGenerated.sourceNodesQuery_2_3(ctx));
        case 6:
          return IterableUtil.asCollection(QueriesGenerated.sourceNodesQuery_2_4(ctx));
        case 7:
          return IterableUtil.asCollection(QueriesGenerated.sourceNodesQuery_2_5(ctx));
        default:
          throw new GenerationFailureException(String.format("Inconsistent QueriesGenerated: there's no method for query %s (key: #%d)", ctx.getTemplateReference(), methodKey));
      }
    }
  }
  private final Map<String, PropertyValueQuery> pvqMethods = new HashMap<String, PropertyValueQuery>();
  {
    int i = 0;
    pvqMethods.put("2042270437839416577", new PVQ(i++, MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name"), "sendPoint"));
    pvqMethods.put("2042270437839125248", new PVQ(i++, MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name"), "PostWomanImplementation"));
    pvqMethods.put("5395015244804193932", new PVQ(i++, MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name"), "addressField"));
    pvqMethods.put("7184735009877420598", new PVQ(i++, MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name"), "parameterField"));
    pvqMethods.put("4620405792280105022", new PVQ(i++, MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name"), "pathVariableField"));
    pvqMethods.put("4620405792280217441", new PVQ(i++, MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name"), "bodyField"));
    pvqMethods.put("4620405792280492467", new PVQ(i++, MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name"), "sendButton"));
    pvqMethods.put("4620405792280577299", new PVQ(i++, MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name"), "method"));
    pvqMethods.put("4620405792280602732", new PVQ(i++, MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name"), "responseStatusField"));
    pvqMethods.put("4620405792280623937", new PVQ(i++, MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name"), "responseBodyField"));
    pvqMethods.put("7184735009877870462", new PVQ(i++, MetaAdapterFactory.getProperty(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf93d565d10L, 0xf93d565d11L, "value"), "Title"));
    pvqMethods.put("4620405792280786621", new PVQ(i++, MetaAdapterFactory.getProperty(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf93d565d10L, 0xf93d565d11L, "value"), "Title"));
    pvqMethods.put("8579157963842130281", new PVQ(i++, MetaAdapterFactory.getProperty(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf93d565d10L, 0xf93d565d11L, "value"), "SendPoint"));
    pvqMethods.put("4620405792279817698", new PVQ(i++, MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name"), "SendPointImplementation"));
  }
  @NotNull
  @Override
  public PropertyValueQuery getPropertyValueQuery(@NotNull QueryKey identity) {
    PropertyValueQuery query = identity.forTemplateNode(pvqMethods);
    return (query != null ? query : super.getPropertyValueQuery(identity));
  }
  private static class PVQ extends PropertyValueQuery.Base {
    private final int methodKey;
    /*package*/ PVQ(int methodKey, SProperty property, String templateValue) {
      super(property, templateValue);
      this.methodKey = methodKey;
    }
    @Nullable
    public Object evaluate(@NotNull PropertyMacroContext ctx) throws GenerationFailureException {
      switch (methodKey) {
        case 0:
          return QueriesGenerated.propertyMacro_GetValue_1_0(ctx);
        case 1:
          return QueriesGenerated.propertyMacro_GetValue_1_1(ctx);
        case 2:
          return QueriesGenerated.propertyMacro_GetValue_2_0(ctx);
        case 3:
          return QueriesGenerated.propertyMacro_GetValue_2_1(ctx);
        case 4:
          return QueriesGenerated.propertyMacro_GetValue_2_2(ctx);
        case 5:
          return QueriesGenerated.propertyMacro_GetValue_2_3(ctx);
        case 6:
          return QueriesGenerated.propertyMacro_GetValue_2_4(ctx);
        case 7:
          return QueriesGenerated.propertyMacro_GetValue_2_5(ctx);
        case 8:
          return QueriesGenerated.propertyMacro_GetValue_2_6(ctx);
        case 9:
          return QueriesGenerated.propertyMacro_GetValue_2_7(ctx);
        case 10:
          return QueriesGenerated.propertyMacro_GetValue_2_8(ctx);
        case 11:
          return QueriesGenerated.propertyMacro_GetValue_2_9(ctx);
        case 12:
          return QueriesGenerated.propertyMacro_GetValue_2_10(ctx);
        case 13:
          return QueriesGenerated.propertyMacro_GetValue_2_11(ctx);
        default:
          throw new GenerationFailureException(String.format("Inconsistent QueriesGenerated: there's no method for query %s (key: #%d)", ctx.getTemplateReference(), methodKey));
      }
    }
  }
  private final Map<String, ReferenceTargetQuery> rtqMethods = new HashMap<String, ReferenceTargetQuery>();
  {
    rtqMethods.put("8579157963847256380", new RTQ(0, "parameterField"));
    rtqMethods.put("1711265974708278722", new RTQ(1, "pathVariableField"));
    rtqMethods.put("5395015244805436158", new RTQ(2, "addressField"));
    rtqMethods.put("7184735009877891086", new RTQ(3, "parameterField"));
    rtqMethods.put("4620405792280840313", new RTQ(4, "parameterField"));
    rtqMethods.put("4620405792281124884", new RTQ(5, "bodyField"));
    rtqMethods.put("4620405792281355515", new RTQ(6, "sendButton"));
    rtqMethods.put("4620405792281464692", new RTQ(7, "method"));
    rtqMethods.put("4620405792281755149", new RTQ(8, "responseStatusField"));
    rtqMethods.put("4620405792281657797", new RTQ(9, "responseBodyField"));
  }
  @NotNull
  @Override
  public ReferenceTargetQuery getReferenceTargetQuery(@NotNull QueryKey queryKey) {
    ReferenceTargetQuery query = queryKey.forTemplateNode(rtqMethods);
    return (query != null ? query : super.getReferenceTargetQuery(queryKey));
  }
  private static class RTQ extends ReferenceTargetQuery.Base {
    private final int methodKey;
    /*package*/ RTQ(int methodKey, String templateValue) {
      super(templateValue);
      this.methodKey = methodKey;
    }
    @Nullable
    public Object evaluate(@NotNull ReferenceMacroContext ctx) throws GenerationFailureException {
      switch (methodKey) {
        case 0:
          return QueriesGenerated.referenceMacro_GetReferent_2_0(ctx);
        case 1:
          return QueriesGenerated.referenceMacro_GetReferent_2_1(ctx);
        case 2:
          return QueriesGenerated.referenceMacro_GetReferent_2_2(ctx);
        case 3:
          return QueriesGenerated.referenceMacro_GetReferent_2_3(ctx);
        case 4:
          return QueriesGenerated.referenceMacro_GetReferent_2_4(ctx);
        case 5:
          return QueriesGenerated.referenceMacro_GetReferent_2_5(ctx);
        case 6:
          return QueriesGenerated.referenceMacro_GetReferent_2_6(ctx);
        case 7:
          return QueriesGenerated.referenceMacro_GetReferent_2_7(ctx);
        case 8:
          return QueriesGenerated.referenceMacro_GetReferent_2_8(ctx);
        case 9:
          return QueriesGenerated.referenceMacro_GetReferent_2_9(ctx);
        default:
          throw new GenerationFailureException(String.format("Inconsistent QueriesGenerated: there's no method for query %s (key: #%d)", ctx.getTemplateReference(), methodKey));
      }
    }
  }

  private static final class PROPS {
    /*package*/ static final SProperty name$MnvL = MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name");
  }

  private static final class LINKS {
    /*package*/ static final SContainmentLink SendPoint$sqgP = MetaAdapterFactory.getContainmentLink(0xd7b95e9eebcd4c13L, 0xb8b768e41a0acda9L, 0x1c579a248ea9a7bbL, 0x1c579a248ea9ba74L, "SendPoint");
    /*package*/ static final SContainmentLink parameter$zeph = MetaAdapterFactory.getContainmentLink(0xd7b95e9eebcd4c13L, 0xb8b768e41a0acda9L, 0x1c579a248ea9afaaL, 0xf4ef489a8cfb2f5L, "parameter");
    /*package*/ static final SContainmentLink variable$lXsj = MetaAdapterFactory.getContainmentLink(0xd7b95e9eebcd4c13L, 0xb8b768e41a0acda9L, 0x1c579a248ea9afaaL, 0xf4ef489a8cfa07dL, "variable");
  }
}
