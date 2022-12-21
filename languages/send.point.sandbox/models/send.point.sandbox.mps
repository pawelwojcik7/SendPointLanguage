<?xml version="1.0" encoding="UTF-8"?>
<model ref="r:be7c0b0d-2604-4cd3-84d0-54ee0d2e66e6(send.point.sandbox)">
  <persistence version="9" />
  <languages>
    <use id="d7b95e9e-ebcd-4c13-b8b7-68e41a0acda9" name="send.point" version="0" />
    <use id="4caf0310-491e-41f5-8a9b-2006b3a94898" name="jetbrains.mps.execution.util" version="0" />
  </languages>
  <imports />
  <registry>
    <language id="d7b95e9e-ebcd-4c13-b8b7-68e41a0acda9" name="send.point">
      <concept id="2042270437838794666" name="send.point.structure.SendPoint" flags="ng" index="2iZzme">
        <child id="1103087830832241590" name="send" index="2BwiWZ" />
        <child id="1103087830832237724" name="address" index="2Bwjwl" />
        <child id="1103087830832226119" name="method" index="2BwmJe" />
      </concept>
      <concept id="2042270437838792635" name="send.point.structure.PostWoman" flags="ng" index="2iZzQv">
        <child id="2042270437838797428" name="SendPoint" index="2iZy1g" />
      </concept>
      <concept id="1103087830832219397" name="send.point.structure.SendPointButton" flags="ng" index="2Bwn6c" />
      <concept id="1103087830832220166" name="send.point.structure.SendPointMethod" flags="ng" index="2BwnMf" />
      <concept id="1103087830832217336" name="send.point.structure.SendPointAddress" flags="ng" index="2BwoxL" />
    </language>
    <language id="ceab5195-25ea-4f22-9b92-103b95ca8c0c" name="jetbrains.mps.lang.core">
      <concept id="1169194658468" name="jetbrains.mps.lang.core.structure.INamedConcept" flags="ng" index="TrEIO">
        <property id="1169194664001" name="name" index="TrG5h" />
      </concept>
    </language>
  </registry>
  <node concept="2iZzQv" id="1LnAyieEvRL">
    <property role="TrG5h" value="MyPostWoman" />
    <node concept="2iZzme" id="1uZCPpqFccL" role="2iZy1g">
      <property role="TrG5h" value="SendPoint" />
      <node concept="2BwnMf" id="1uZCPpqFccM" role="2BwmJe" />
      <node concept="2BwoxL" id="1uZCPpqFccN" role="2Bwjwl" />
      <node concept="2Bwn6c" id="1uZCPpqFccO" role="2BwiWZ" />
    </node>
  </node>
</model>

