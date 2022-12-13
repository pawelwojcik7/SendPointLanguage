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
        <child id="1103087830832246259" name="responseBody" index="2Bwh_U" />
        <child id="1103087830832241590" name="send" index="2BwiWZ" />
        <child id="1103087830832237724" name="address" index="2Bwjwl" />
        <child id="1103087830832231157" name="parameter" index="2BwkpW" />
        <child id="1103087830832226429" name="variable" index="2BwljO" />
        <child id="1103087830832226119" name="method" index="2BwmJe" />
      </concept>
      <concept id="2042270437838792635" name="send.point.structure.PostWoman" flags="ng" index="2iZzQv">
        <child id="2042270437838797428" name="SendPoint" index="2iZy1g" />
      </concept>
      <concept id="1103087830832222268" name="send.point.structure.SendPointResponseBody" flags="ng" index="2BwmiP" />
      <concept id="1103087830832224823" name="send.point.structure.SendPointPathVariable" flags="ng" index="2BwmUY" />
      <concept id="1103087830832219397" name="send.point.structure.SendPointButton" flags="ng" index="2Bwn6c" />
      <concept id="1103087830832220166" name="send.point.structure.SendPointMethod" flags="ng" index="2BwnMf" />
      <concept id="1103087830832220972" name="send.point.structure.SendPointParameter" flags="ng" index="2BwnY_" />
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
    <node concept="2iZzme" id="3SG9oGmraTd" role="2iZy1g">
      <property role="TrG5h" value="Sendpoint4444" />
      <node concept="2BwnMf" id="3SG9oGmraTe" role="2BwmJe">
        <property role="TrG5h" value="POST" />
      </node>
      <node concept="2BwoxL" id="3SG9oGmraTf" role="2Bwjwl" />
      <node concept="2Bwn6c" id="3SG9oGmraTg" role="2BwiWZ" />
    </node>
    <node concept="2iZzme" id="6ePjANl3jfR" role="2iZy1g">
      <property role="TrG5h" value="SendPoint1" />
      <node concept="2BwnY_" id="6ePjANl3kH_" role="2BwkpW">
        <property role="TrG5h" value="parameter1" />
      </node>
      <node concept="2BwnY_" id="6ePjANl3kJK" role="2BwkpW">
        <property role="TrG5h" value="parameter2" />
      </node>
      <node concept="2BwnY_" id="3SG9oGmrarN" role="2BwkpW">
        <property role="TrG5h" value="parameter3" />
      </node>
      <node concept="2BwnMf" id="6ePjANl3jfS" role="2BwmJe">
        <property role="TrG5h" value="GET" />
      </node>
      <node concept="2BwoxL" id="6ePjANl3jfT" role="2Bwjwl" />
      <node concept="2Bwn6c" id="6ePjANl3jfU" role="2BwiWZ" />
      <node concept="2BwmUY" id="6ePjANl3kAd" role="2BwljO">
        <property role="TrG5h" value="pathVariable1" />
      </node>
      <node concept="2BwmUY" id="6ePjANl3kDL" role="2BwljO">
        <property role="TrG5h" value="pathVariable2" />
      </node>
      <node concept="2BwmiP" id="4FuWsvSsOGQ" role="2Bwh_U" />
    </node>
    <node concept="2iZzme" id="4FuWsvSsOH3" role="2iZy1g">
      <property role="TrG5h" value="SendPoint2" />
      <node concept="2BwnY_" id="4FuWsvSsOVW" role="2BwkpW">
        <property role="TrG5h" value="parameterinny" />
      </node>
      <node concept="2BwmUY" id="4FuWsvSsOUS" role="2BwljO">
        <property role="TrG5h" value="pathvariable1" />
      </node>
      <node concept="2BwnMf" id="4FuWsvSsOH4" role="2BwmJe">
        <property role="TrG5h" value="Post" />
      </node>
      <node concept="2BwoxL" id="4FuWsvSsOH5" role="2Bwjwl" />
      <node concept="2Bwn6c" id="4FuWsvSsOH6" role="2BwiWZ" />
    </node>
  </node>
</model>

