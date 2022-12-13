package send.point.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.EditorAspectDescriptorBase;
import org.jetbrains.annotations.NotNull;
import java.util.Collection;
import jetbrains.mps.openapi.editor.descriptor.ConceptEditor;
import org.jetbrains.mps.openapi.language.SAbstractConcept;
import java.util.Collections;
import jetbrains.mps.lang.smodel.ConceptSwitchIndex;
import jetbrains.mps.lang.smodel.ConceptSwitchIndexBuilder;
import jetbrains.mps.smodel.adapter.ids.MetaIdFactory;

public class EditorAspectDescriptorImpl extends EditorAspectDescriptorBase {
  @NotNull
  public Collection<ConceptEditor> getDeclaredEditors(SAbstractConcept concept) {
    SAbstractConcept cncpt = ((SAbstractConcept) concept);
    switch (conceptIndex.index(cncpt)) {
      case 0:
        return Collections.<ConceptEditor>singletonList(new PostWoman_Editor());
      case 1:
        return Collections.<ConceptEditor>singletonList(new SendPoint_Editor());
      case 2:
        return Collections.<ConceptEditor>singletonList(new SendPointAddress_Editor());
      case 3:
        return Collections.<ConceptEditor>singletonList(new SendPointBody_Editor());
      case 4:
        return Collections.<ConceptEditor>singletonList(new SendPointButton_Editor());
      case 5:
        return Collections.<ConceptEditor>singletonList(new SendPointMethod_Editor());
      case 6:
        return Collections.<ConceptEditor>singletonList(new SendPointParameter_Editor());
      case 7:
        return Collections.<ConceptEditor>singletonList(new SendPointPathVariable_Editor());
      case 8:
        return Collections.<ConceptEditor>singletonList(new SendPointResponseBody_Editor());
      case 9:
        return Collections.<ConceptEditor>singletonList(new SendPointResponseStatus_Editor());
      default:
    }
    return Collections.<ConceptEditor>emptyList();
  }



  private static final ConceptSwitchIndex conceptIndex = new ConceptSwitchIndexBuilder().put(MetaIdFactory.conceptId(0xd7b95e9eebcd4c13L, 0xb8b768e41a0acda9L, 0x1c579a248ea9a7bbL), MetaIdFactory.conceptId(0xd7b95e9eebcd4c13L, 0xb8b768e41a0acda9L, 0x1c579a248ea9afaaL), MetaIdFactory.conceptId(0xd7b95e9eebcd4c13L, 0xb8b768e41a0acda9L, 0xf4ef489a8cf7cf8L), MetaIdFactory.conceptId(0xd7b95e9eebcd4c13L, 0xb8b768e41a0acda9L, 0xf4ef489a8cf812dL), MetaIdFactory.conceptId(0xd7b95e9eebcd4c13L, 0xb8b768e41a0acda9L, 0xf4ef489a8cf8505L), MetaIdFactory.conceptId(0xd7b95e9eebcd4c13L, 0xb8b768e41a0acda9L, 0xf4ef489a8cf8806L), MetaIdFactory.conceptId(0xd7b95e9eebcd4c13L, 0xb8b768e41a0acda9L, 0xf4ef489a8cf8b2cL), MetaIdFactory.conceptId(0xd7b95e9eebcd4c13L, 0xb8b768e41a0acda9L, 0xf4ef489a8cf9a37L), MetaIdFactory.conceptId(0xd7b95e9eebcd4c13L, 0xb8b768e41a0acda9L, 0xf4ef489a8cf903cL), MetaIdFactory.conceptId(0xd7b95e9eebcd4c13L, 0xb8b768e41a0acda9L, 0xf4ef489a8cf944cL)).seal();
}