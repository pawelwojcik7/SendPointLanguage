package send.point.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.runtime.BaseStructureAspectDescriptor;
import jetbrains.mps.smodel.runtime.ConceptDescriptor;
import java.util.Collection;
import java.util.Arrays;
import org.jetbrains.annotations.Nullable;
import jetbrains.mps.smodel.adapter.ids.SConceptId;
import org.jetbrains.mps.openapi.language.SAbstractConcept;
import jetbrains.mps.smodel.runtime.impl.ConceptDescriptorBuilder2;

public class StructureAspectDescriptor extends BaseStructureAspectDescriptor {
  /*package*/ final ConceptDescriptor myConceptPostWoman = createDescriptorForPostWoman();
  /*package*/ final ConceptDescriptor myConceptSendPoint = createDescriptorForSendPoint();
  /*package*/ final ConceptDescriptor myConceptSendPointAddress = createDescriptorForSendPointAddress();
  /*package*/ final ConceptDescriptor myConceptSendPointBody = createDescriptorForSendPointBody();
  /*package*/ final ConceptDescriptor myConceptSendPointButton = createDescriptorForSendPointButton();
  /*package*/ final ConceptDescriptor myConceptSendPointMethod = createDescriptorForSendPointMethod();
  /*package*/ final ConceptDescriptor myConceptSendPointParameter = createDescriptorForSendPointParameter();
  /*package*/ final ConceptDescriptor myConceptSendPointPathVariable = createDescriptorForSendPointPathVariable();
  /*package*/ final ConceptDescriptor myConceptSendPointResponseBody = createDescriptorForSendPointResponseBody();
  /*package*/ final ConceptDescriptor myConceptSendPointResponseStatus = createDescriptorForSendPointResponseStatus();
  private final LanguageConceptSwitch myIndexSwitch;

  public StructureAspectDescriptor() {
    myIndexSwitch = new LanguageConceptSwitch();
  }


  @Override
  public void reportDependencies(jetbrains.mps.smodel.runtime.StructureAspectDescriptor.Dependencies deps) {
    deps.extendedLanguage(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, "jetbrains.mps.lang.core");
  }

  @Override
  public Collection<ConceptDescriptor> getDescriptors() {
    return Arrays.asList(myConceptPostWoman, myConceptSendPoint, myConceptSendPointAddress, myConceptSendPointBody, myConceptSendPointButton, myConceptSendPointMethod, myConceptSendPointParameter, myConceptSendPointPathVariable, myConceptSendPointResponseBody, myConceptSendPointResponseStatus);
  }

  @Override
  @Nullable
  public ConceptDescriptor getDescriptor(SConceptId id) {
    switch (myIndexSwitch.index(id)) {
      case LanguageConceptSwitch.PostWoman:
        return myConceptPostWoman;
      case LanguageConceptSwitch.SendPoint:
        return myConceptSendPoint;
      case LanguageConceptSwitch.SendPointAddress:
        return myConceptSendPointAddress;
      case LanguageConceptSwitch.SendPointBody:
        return myConceptSendPointBody;
      case LanguageConceptSwitch.SendPointButton:
        return myConceptSendPointButton;
      case LanguageConceptSwitch.SendPointMethod:
        return myConceptSendPointMethod;
      case LanguageConceptSwitch.SendPointParameter:
        return myConceptSendPointParameter;
      case LanguageConceptSwitch.SendPointPathVariable:
        return myConceptSendPointPathVariable;
      case LanguageConceptSwitch.SendPointResponseBody:
        return myConceptSendPointResponseBody;
      case LanguageConceptSwitch.SendPointResponseStatus:
        return myConceptSendPointResponseStatus;
      default:
        return null;
    }
  }


  /*package*/ int internalIndex(SAbstractConcept c) {
    return myIndexSwitch.index(c);
  }

  private static ConceptDescriptor createDescriptorForPostWoman() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("send.point", "PostWoman", 0xd7b95e9eebcd4c13L, 0xb8b768e41a0acda9L, 0x1c579a248ea9a7bbL);
    b.class_(false, false, true);
    b.parent(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L);
    b.parent(0x4caf0310491e41f5L, 0x8a9b2006b3a94898L, 0x40c1a7cb987d20d5L);
    b.origin("r:05c2b1eb-eb8e-4221-a004-7fa304525a30(send.point.structure)/2042270437838792635");
    b.version(3);
    b.aggregate("SendPoint", 0x1c579a248ea9ba74L).target(0xd7b95e9eebcd4c13L, 0xb8b768e41a0acda9L, 0x1c579a248ea9afaaL).optional(true).ordered(true).multiple(true).origin("2042270437838797428").done();
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForSendPoint() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("send.point", "SendPoint", 0xd7b95e9eebcd4c13L, 0xb8b768e41a0acda9L, 0x1c579a248ea9afaaL);
    b.class_(false, false, false);
    b.parent(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L);
    b.origin("r:05c2b1eb-eb8e-4221-a004-7fa304525a30(send.point.structure)/2042270437838794666");
    b.version(3);
    b.aggregate("method", 0xf4ef489a8cf9f47L).target(0xd7b95e9eebcd4c13L, 0xb8b768e41a0acda9L, 0xf4ef489a8cf8806L).optional(false).ordered(true).multiple(false).origin("1103087830832226119").done();
    b.aggregate("variable", 0xf4ef489a8cfa07dL).target(0xd7b95e9eebcd4c13L, 0xb8b768e41a0acda9L, 0xf4ef489a8cf9a37L).optional(true).ordered(true).multiple(true).origin("1103087830832226429").done();
    b.aggregate("parameter", 0xf4ef489a8cfb2f5L).target(0xd7b95e9eebcd4c13L, 0xb8b768e41a0acda9L, 0xf4ef489a8cf8b2cL).optional(true).ordered(true).multiple(true).origin("1103087830832231157").done();
    b.aggregate("body", 0xf4ef489a8cfb77fL).target(0xd7b95e9eebcd4c13L, 0xb8b768e41a0acda9L, 0xf4ef489a8cf812dL).optional(true).ordered(true).multiple(false).origin("1103087830832232319").done();
    b.aggregate("address", 0xf4ef489a8cfcc9cL).target(0xd7b95e9eebcd4c13L, 0xb8b768e41a0acda9L, 0xf4ef489a8cf7cf8L).optional(false).ordered(true).multiple(false).origin("1103087830832237724").done();
    b.aggregate("send", 0xf4ef489a8cfdbb6L).target(0xd7b95e9eebcd4c13L, 0xb8b768e41a0acda9L, 0xf4ef489a8cf8505L).optional(false).ordered(true).multiple(false).origin("1103087830832241590").done();
    b.aggregate("responseStatus", 0xf4ef489a8cfdce2L).target(0xd7b95e9eebcd4c13L, 0xb8b768e41a0acda9L, 0xf4ef489a8cf944cL).optional(true).ordered(true).multiple(false).origin("1103087830832241890").done();
    b.aggregate("responseBody", 0xf4ef489a8cfedf3L).target(0xd7b95e9eebcd4c13L, 0xb8b768e41a0acda9L, 0xf4ef489a8cf903cL).optional(true).ordered(true).multiple(false).origin("1103087830832246259").done();
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForSendPointAddress() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("send.point", "SendPointAddress", 0xd7b95e9eebcd4c13L, 0xb8b768e41a0acda9L, 0xf4ef489a8cf7cf8L);
    b.class_(false, false, false);
    b.origin("r:05c2b1eb-eb8e-4221-a004-7fa304525a30(send.point.structure)/1103087830832217336");
    b.version(3);
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForSendPointBody() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("send.point", "SendPointBody", 0xd7b95e9eebcd4c13L, 0xb8b768e41a0acda9L, 0xf4ef489a8cf812dL);
    b.class_(false, false, false);
    b.origin("r:05c2b1eb-eb8e-4221-a004-7fa304525a30(send.point.structure)/1103087830832218413");
    b.version(3);
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForSendPointButton() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("send.point", "SendPointButton", 0xd7b95e9eebcd4c13L, 0xb8b768e41a0acda9L, 0xf4ef489a8cf8505L);
    b.class_(false, false, false);
    b.origin("r:05c2b1eb-eb8e-4221-a004-7fa304525a30(send.point.structure)/1103087830832219397");
    b.version(3);
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForSendPointMethod() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("send.point", "SendPointMethod", 0xd7b95e9eebcd4c13L, 0xb8b768e41a0acda9L, 0xf4ef489a8cf8806L);
    b.class_(false, false, false);
    b.parent(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L);
    b.origin("r:05c2b1eb-eb8e-4221-a004-7fa304525a30(send.point.structure)/1103087830832220166");
    b.version(3);
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForSendPointParameter() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("send.point", "SendPointParameter", 0xd7b95e9eebcd4c13L, 0xb8b768e41a0acda9L, 0xf4ef489a8cf8b2cL);
    b.class_(false, false, false);
    b.parent(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L);
    b.origin("r:05c2b1eb-eb8e-4221-a004-7fa304525a30(send.point.structure)/1103087830832220972");
    b.version(3);
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForSendPointPathVariable() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("send.point", "SendPointPathVariable", 0xd7b95e9eebcd4c13L, 0xb8b768e41a0acda9L, 0xf4ef489a8cf9a37L);
    b.class_(false, false, false);
    b.parent(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L);
    b.origin("r:05c2b1eb-eb8e-4221-a004-7fa304525a30(send.point.structure)/1103087830832224823");
    b.version(3);
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForSendPointResponseBody() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("send.point", "SendPointResponseBody", 0xd7b95e9eebcd4c13L, 0xb8b768e41a0acda9L, 0xf4ef489a8cf903cL);
    b.class_(false, false, false);
    b.origin("r:05c2b1eb-eb8e-4221-a004-7fa304525a30(send.point.structure)/1103087830832222268");
    b.version(3);
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForSendPointResponseStatus() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("send.point", "SendPointResponseStatus", 0xd7b95e9eebcd4c13L, 0xb8b768e41a0acda9L, 0xf4ef489a8cf944cL);
    b.class_(false, false, false);
    b.origin("r:05c2b1eb-eb8e-4221-a004-7fa304525a30(send.point.structure)/1103087830832223308");
    b.version(3);
    return b.create();
  }
}