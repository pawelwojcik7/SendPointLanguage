<?xml version="1.0" encoding="UTF-8"?>
<model ref="r:05c2b1eb-eb8e-4221-a004-7fa304525a30(send.point.structure)">
  <persistence version="9" />
  <languages>
    <devkit ref="78434eb8-b0e5-444b-850d-e7c4ad2da9ab(jetbrains.mps.devkit.aspect.structure)" />
  </languages>
  <imports>
    <import index="4fqr" ref="r:fa713d69-08ea-4732-b1f2-cb07f9e103ef(jetbrains.mps.execution.util.structure)" />
    <import index="tpck" ref="r:00000000-0000-4000-0000-011c89590288(jetbrains.mps.lang.core.structure)" implicit="true" />
  </imports>
  <registry>
    <language id="c72da2b9-7cce-4447-8389-f407dc1158b7" name="jetbrains.mps.lang.structure">
      <concept id="1169125787135" name="jetbrains.mps.lang.structure.structure.AbstractConceptDeclaration" flags="ig" index="PkWjJ">
        <property id="6714410169261853888" name="conceptId" index="EcuMT" />
        <child id="1071489727083" name="linkDeclaration" index="1TKVEi" />
      </concept>
      <concept id="1169127622168" name="jetbrains.mps.lang.structure.structure.InterfaceConceptReference" flags="ig" index="PrWs8">
        <reference id="1169127628841" name="intfc" index="PrY4T" />
      </concept>
      <concept id="1071489090640" name="jetbrains.mps.lang.structure.structure.ConceptDeclaration" flags="ig" index="1TIwiD">
        <property id="1096454100552" name="rootable" index="19KtqR" />
        <reference id="1071489389519" name="extends" index="1TJDcQ" />
        <child id="1169129564478" name="implements" index="PzmwI" />
      </concept>
      <concept id="1071489288298" name="jetbrains.mps.lang.structure.structure.LinkDeclaration" flags="ig" index="1TJgyj">
        <property id="1071599776563" name="role" index="20kJfa" />
        <property id="1071599893252" name="sourceCardinality" index="20lbJX" />
        <property id="1071599937831" name="metaClass" index="20lmBu" />
        <property id="241647608299431140" name="linkId" index="IQ2ns" />
        <reference id="1071599976176" name="target" index="20lvS9" />
      </concept>
    </language>
    <language id="ceab5195-25ea-4f22-9b92-103b95ca8c0c" name="jetbrains.mps.lang.core">
      <concept id="1169194658468" name="jetbrains.mps.lang.core.structure.INamedConcept" flags="ng" index="TrEIO">
        <property id="1169194664001" name="name" index="TrG5h" />
      </concept>
    </language>
  </registry>
  <node concept="1TIwiD" id="1LnAyieEquV">
    <property role="EcuMT" value="2042270437838792635" />
    <property role="19KtqR" value="true" />
    <property role="TrG5h" value="PostWoman" />
    <ref role="1TJDcQ" to="tpck:gw2VY9q" />
    <node concept="PrWs8" id="1LnAyieEqXO" role="PzmwI">
      <ref role="PrY4T" to="tpck:h0TrEE$" resolve="INamedConcept" />
    </node>
    <node concept="PrWs8" id="1LnAyieEwbH" role="PzmwI">
      <ref role="PrY4T" to="4fqr:431DWIovi3l" resolve="IMainClass" />
    </node>
    <node concept="1TJgyj" id="1LnAyieErDO" role="1TKVEi">
      <property role="IQ2ns" value="2042270437838797428" />
      <property role="20lmBu" value="fLJjDmT/aggregation" />
      <property role="20kJfa" value="SendPoint" />
      <property role="20lbJX" value="fLJekj5/_0__n" />
      <ref role="20lvS9" node="1LnAyieEqYE" resolve="SendPoint" />
    </node>
  </node>
  <node concept="1TIwiD" id="1LnAyieEqYE">
    <property role="EcuMT" value="2042270437838794666" />
    <property role="TrG5h" value="SendPoint" />
    <ref role="1TJDcQ" to="tpck:gw2VY9q" />
    <node concept="PrWs8" id="1LnAyieEri_" role="PzmwI">
      <ref role="PrY4T" to="tpck:h0TrEE$" resolve="INamedConcept" />
    </node>
    <node concept="1TJgyj" id="XeX8ACNTX7" role="1TKVEi">
      <property role="IQ2ns" value="1103087830832226119" />
      <property role="20lmBu" value="fLJjDmT/aggregation" />
      <property role="20kJfa" value="method" />
      <property role="20lbJX" value="fLJekj4/_1" />
      <ref role="20lvS9" node="XeX8ACNSw6" resolve="SendPointMethod" />
    </node>
    <node concept="1TJgyj" id="XeX8ACNU1X" role="1TKVEi">
      <property role="IQ2ns" value="1103087830832226429" />
      <property role="20lmBu" value="fLJjDmT/aggregation" />
      <property role="20kJfa" value="variable" />
      <property role="20lbJX" value="fLJekj5/_0__n" />
      <ref role="20lvS9" node="XeX8ACNTCR" resolve="SendPointPathVariable" />
    </node>
    <node concept="1TJgyj" id="XeX8ACNVbP" role="1TKVEi">
      <property role="IQ2ns" value="1103087830832231157" />
      <property role="20lmBu" value="fLJjDmT/aggregation" />
      <property role="20kJfa" value="parameter" />
      <property role="20lbJX" value="fLJekj5/_0__n" />
      <ref role="20lvS9" node="XeX8ACNSGG" resolve="SendPointParameter" />
    </node>
    <node concept="1TJgyj" id="XeX8ACNVtZ" role="1TKVEi">
      <property role="IQ2ns" value="1103087830832232319" />
      <property role="20lmBu" value="fLJjDmT/aggregation" />
      <property role="20kJfa" value="body" />
      <ref role="20lvS9" node="XeX8ACNS4H" resolve="SendPointBody" />
    </node>
    <node concept="1TJgyj" id="XeX8ACNWMs" role="1TKVEi">
      <property role="IQ2ns" value="1103087830832237724" />
      <property role="20lmBu" value="fLJjDmT/aggregation" />
      <property role="20kJfa" value="address" />
      <property role="20lbJX" value="fLJekj4/_1" />
      <ref role="20lvS9" node="XeX8ACNRNS" resolve="SendPointAddress" />
    </node>
    <node concept="1TJgyj" id="XeX8ACNXIQ" role="1TKVEi">
      <property role="IQ2ns" value="1103087830832241590" />
      <property role="20lmBu" value="fLJjDmT/aggregation" />
      <property role="20kJfa" value="send" />
      <property role="20lbJX" value="fLJekj4/_1" />
      <ref role="20lvS9" node="XeX8ACNSk5" resolve="SendPointButton" />
    </node>
    <node concept="1TJgyj" id="XeX8ACNXNy" role="1TKVEi">
      <property role="IQ2ns" value="1103087830832241890" />
      <property role="20lmBu" value="fLJjDmT/aggregation" />
      <property role="20kJfa" value="responseStatus" />
      <ref role="20lvS9" node="XeX8ACNThc" resolve="SendPointResponseStatus" />
    </node>
    <node concept="1TJgyj" id="XeX8ACNYRN" role="1TKVEi">
      <property role="IQ2ns" value="1103087830832246259" />
      <property role="20lmBu" value="fLJjDmT/aggregation" />
      <property role="20kJfa" value="responseBody" />
      <ref role="20lvS9" node="XeX8ACNT0W" resolve="SendPointResponseBody" />
    </node>
  </node>
  <node concept="1TIwiD" id="XeX8ACNRNS">
    <property role="EcuMT" value="1103087830832217336" />
    <property role="TrG5h" value="SendPointAddress" />
    <ref role="1TJDcQ" to="tpck:gw2VY9q" />
  </node>
  <node concept="1TIwiD" id="XeX8ACNS4H">
    <property role="EcuMT" value="1103087830832218413" />
    <property role="TrG5h" value="SendPointBody" />
    <ref role="1TJDcQ" to="tpck:gw2VY9q" />
  </node>
  <node concept="1TIwiD" id="XeX8ACNSk5">
    <property role="EcuMT" value="1103087830832219397" />
    <property role="TrG5h" value="SendPointButton" />
    <ref role="1TJDcQ" to="tpck:gw2VY9q" />
  </node>
  <node concept="1TIwiD" id="XeX8ACNSw6">
    <property role="EcuMT" value="1103087830832220166" />
    <property role="TrG5h" value="SendPointMethod" />
    <ref role="1TJDcQ" to="tpck:gw2VY9q" />
  </node>
  <node concept="1TIwiD" id="XeX8ACNSGG">
    <property role="EcuMT" value="1103087830832220972" />
    <property role="TrG5h" value="SendPointParameter" />
    <ref role="1TJDcQ" to="tpck:gw2VY9q" />
    <node concept="PrWs8" id="6ePjANl2$y8" role="PzmwI">
      <ref role="PrY4T" to="tpck:h0TrEE$" resolve="INamedConcept" />
    </node>
  </node>
  <node concept="1TIwiD" id="XeX8ACNT0W">
    <property role="EcuMT" value="1103087830832222268" />
    <property role="TrG5h" value="SendPointResponseBody" />
    <ref role="1TJDcQ" to="tpck:gw2VY9q" />
  </node>
  <node concept="1TIwiD" id="XeX8ACNThc">
    <property role="EcuMT" value="1103087830832223308" />
    <property role="TrG5h" value="SendPointResponseStatus" />
    <ref role="1TJDcQ" to="tpck:gw2VY9q" />
  </node>
  <node concept="1TIwiD" id="XeX8ACNTCR">
    <property role="EcuMT" value="1103087830832224823" />
    <property role="TrG5h" value="SendPointPathVariable" />
    <ref role="1TJDcQ" to="tpck:gw2VY9q" />
    <node concept="PrWs8" id="6ePjANl2$YU" role="PzmwI">
      <ref role="PrY4T" to="tpck:h0TrEE$" resolve="INamedConcept" />
    </node>
  </node>
</model>

