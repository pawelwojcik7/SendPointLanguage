<?xml version="1.0" encoding="UTF-8"?>
<model ref="r:f22a6a0c-c439-4eb5-87ef-a6d12823261c(send.point.editor)">
  <persistence version="9" />
  <languages>
    <use id="18bc6592-03a6-4e29-a83a-7ff23bde13ba" name="jetbrains.mps.lang.editor" version="14" />
    <use id="aee9cad2-acd4-4608-aef2-0004f6a1cdbd" name="jetbrains.mps.lang.actions" version="4" />
    <devkit ref="fbc25dd2-5da4-483a-8b19-70928e1b62d7(jetbrains.mps.devkit.general-purpose)" />
  </languages>
  <imports>
    <import index="7nfd" ref="r:05c2b1eb-eb8e-4221-a004-7fa304525a30(send.point.structure)" implicit="true" />
    <import index="tpck" ref="r:00000000-0000-4000-0000-011c89590288(jetbrains.mps.lang.core.structure)" implicit="true" />
  </imports>
  <registry>
    <language id="18bc6592-03a6-4e29-a83a-7ff23bde13ba" name="jetbrains.mps.lang.editor">
      <concept id="1071666914219" name="jetbrains.mps.lang.editor.structure.ConceptEditorDeclaration" flags="ig" index="24kQdi" />
      <concept id="1140524381322" name="jetbrains.mps.lang.editor.structure.CellModel_ListWithRole" flags="ng" index="2czfm3">
        <child id="1140524464360" name="cellLayout" index="2czzBx" />
      </concept>
      <concept id="1237303669825" name="jetbrains.mps.lang.editor.structure.CellLayout_Indent" flags="nn" index="l2Vlx" />
      <concept id="1237307900041" name="jetbrains.mps.lang.editor.structure.IndentLayoutIndentStyleClassItem" flags="ln" index="lj46D" />
      <concept id="1237308012275" name="jetbrains.mps.lang.editor.structure.IndentLayoutNewLineStyleClassItem" flags="ln" index="ljvvj" />
      <concept id="1237375020029" name="jetbrains.mps.lang.editor.structure.IndentLayoutNewLineChildrenStyleClassItem" flags="ln" index="pj6Ft" />
      <concept id="1080736578640" name="jetbrains.mps.lang.editor.structure.BaseEditorComponent" flags="ig" index="2wURMF">
        <child id="1080736633877" name="cellModel" index="2wV5jI" />
      </concept>
      <concept id="1186414536763" name="jetbrains.mps.lang.editor.structure.BooleanStyleSheetItem" flags="ln" index="VOi$J">
        <property id="1186414551515" name="flag" index="VOm3f" />
      </concept>
      <concept id="1139848536355" name="jetbrains.mps.lang.editor.structure.CellModel_WithRole" flags="ng" index="1$h60E">
        <reference id="1140103550593" name="relationDeclaration" index="1NtTu8" />
      </concept>
      <concept id="1073389446423" name="jetbrains.mps.lang.editor.structure.CellModel_Collection" flags="sn" stub="3013115976261988961" index="3EZMnI">
        <child id="1106270802874" name="cellLayout" index="2iSdaV" />
        <child id="1073389446424" name="childCellModel" index="3EZMnx" />
      </concept>
      <concept id="1073389577006" name="jetbrains.mps.lang.editor.structure.CellModel_Constant" flags="sn" stub="3610246225209162225" index="3F0ifn">
        <property id="1073389577007" name="text" index="3F0ifm" />
      </concept>
      <concept id="1073389658414" name="jetbrains.mps.lang.editor.structure.CellModel_Property" flags="sg" stub="730538219796134133" index="3F0A7n" />
      <concept id="1219418625346" name="jetbrains.mps.lang.editor.structure.IStyleContainer" flags="ng" index="3F0Thp">
        <child id="1219418656006" name="styleItem" index="3F10Kt" />
      </concept>
      <concept id="1073389882823" name="jetbrains.mps.lang.editor.structure.CellModel_RefNode" flags="sg" stub="730538219795960754" index="3F1sOY" />
      <concept id="1073390211982" name="jetbrains.mps.lang.editor.structure.CellModel_RefNodeList" flags="sg" stub="2794558372793454595" index="3F2HdR" />
      <concept id="1166049232041" name="jetbrains.mps.lang.editor.structure.AbstractComponent" flags="ng" index="1XWOmA">
        <reference id="1166049300910" name="conceptDeclaration" index="1XX52x" />
      </concept>
    </language>
  </registry>
  <node concept="24kQdi" id="1LnAyieErla">
    <ref role="1XX52x" to="7nfd:1LnAyieEqYE" resolve="SendPoint" />
    <node concept="3EZMnI" id="1LnAyieErmO" role="2wV5jI">
      <node concept="3F0ifn" id="1LnAyieErxy" role="3EZMnx">
        <property role="3F0ifm" value="SendPoint" />
      </node>
      <node concept="3F0A7n" id="1LnAyieEr_G" role="3EZMnx">
        <ref role="1NtTu8" to="tpck:h0TrG11" resolve="name" />
        <node concept="ljvvj" id="6ePjANl2Q9l" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
      </node>
      <node concept="3F1sOY" id="6ePjANl2SiM" role="3EZMnx">
        <ref role="1NtTu8" to="7nfd:XeX8ACNWMs" resolve="address" />
        <node concept="ljvvj" id="6ePjANl2Sws" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
        <node concept="lj46D" id="6ePjANl2T2q" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
      </node>
      <node concept="3F2HdR" id="6ePjANl2SAX" role="3EZMnx">
        <ref role="1NtTu8" to="7nfd:XeX8ACNU1X" resolve="variable" />
        <node concept="l2Vlx" id="6ePjANl2SB0" role="2czzBx" />
        <node concept="pj6Ft" id="6ePjANl2SOO" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
        <node concept="lj46D" id="6ePjANl2SVx" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
        <node concept="ljvvj" id="6ePjANl2T94" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
      </node>
      <node concept="3F2HdR" id="6ePjANl2Tl1" role="3EZMnx">
        <ref role="1NtTu8" to="7nfd:XeX8ACNVbP" resolve="parameter" />
        <node concept="l2Vlx" id="6ePjANl2Tl4" role="2czzBx" />
        <node concept="lj46D" id="6ePjANl2TsS" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
        <node concept="pj6Ft" id="6ePjANl2TwJ" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
        <node concept="ljvvj" id="6ePjANl2TR0" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
      </node>
      <node concept="3F1sOY" id="6ePjANl2TYL" role="3EZMnx">
        <ref role="1NtTu8" to="7nfd:XeX8ACNVtZ" resolve="body" />
        <node concept="lj46D" id="6ePjANl2U25" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
        <node concept="ljvvj" id="6ePjANl2Ue8" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
      </node>
      <node concept="3F1sOY" id="6ePjANl2Uo7" role="3EZMnx">
        <ref role="1NtTu8" to="7nfd:XeX8ACNXIQ" resolve="send" />
        <node concept="lj46D" id="6ePjANl2Uqv" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
        <node concept="ljvvj" id="6ePjANl2UwX" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
      </node>
      <node concept="3F1sOY" id="6ePjANl2UDA" role="3EZMnx">
        <ref role="1NtTu8" to="7nfd:XeX8ACNTX7" resolve="method" />
        <node concept="lj46D" id="6ePjANl2UGP" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
        <node concept="ljvvj" id="6ePjANl2UVl" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
      </node>
      <node concept="3F1sOY" id="6ePjANl2V3P" role="3EZMnx">
        <ref role="1NtTu8" to="7nfd:XeX8ACNXNy" resolve="responseStatus" />
        <node concept="lj46D" id="6ePjANl2V77" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
        <node concept="ljvvj" id="6ePjANl2Vdb" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
      </node>
      <node concept="3F1sOY" id="6ePjANl2VNK" role="3EZMnx">
        <ref role="1NtTu8" to="7nfd:XeX8ACNYRN" resolve="responseBody" />
        <node concept="lj46D" id="6ePjANl2VQs" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
      </node>
      <node concept="l2Vlx" id="1LnAyieErmR" role="2iSdaV" />
    </node>
  </node>
  <node concept="24kQdi" id="1LnAyieEsbM">
    <ref role="1XX52x" to="7nfd:1LnAyieEquV" resolve="PostWoman" />
    <node concept="3EZMnI" id="XeX8ACNN$L" role="2wV5jI">
      <node concept="l2Vlx" id="XeX8ACNN$M" role="2iSdaV" />
      <node concept="3F0ifn" id="XeX8ACNNGG" role="3EZMnx">
        <property role="3F0ifm" value="PostWoman" />
      </node>
      <node concept="3F0A7n" id="XeX8ACNNNJ" role="3EZMnx">
        <ref role="1NtTu8" to="tpck:h0TrG11" resolve="name" />
        <node concept="ljvvj" id="XeX8ACNNVa" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
      </node>
      <node concept="3F2HdR" id="XeX8ACNO1f" role="3EZMnx">
        <ref role="1NtTu8" to="7nfd:1LnAyieErDO" resolve="SendPoint" />
        <node concept="l2Vlx" id="XeX8ACNO1i" role="2czzBx" />
        <node concept="pj6Ft" id="XeX8ACNOla" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
      </node>
    </node>
  </node>
  <node concept="24kQdi" id="6ePjANl2uQc">
    <ref role="1XX52x" to="7nfd:XeX8ACNRNS" resolve="SendPointAddress" />
    <node concept="3EZMnI" id="6ePjANl2v1p" role="2wV5jI">
      <node concept="3F0ifn" id="6ePjANl2vdX" role="3EZMnx">
        <property role="3F0ifm" value="Address" />
      </node>
      <node concept="l2Vlx" id="6ePjANl2v1s" role="2iSdaV" />
    </node>
  </node>
  <node concept="24kQdi" id="6ePjANl2vhL">
    <ref role="1XX52x" to="7nfd:XeX8ACNS4H" resolve="SendPointBody" />
    <node concept="3EZMnI" id="6ePjANl2vjA" role="2wV5jI">
      <node concept="3F0ifn" id="6ePjANl2voY" role="3EZMnx">
        <property role="3F0ifm" value="Body" />
      </node>
      <node concept="l2Vlx" id="6ePjANl2vjD" role="2iSdaV" />
    </node>
  </node>
  <node concept="24kQdi" id="6ePjANl2vsd">
    <ref role="1XX52x" to="7nfd:XeX8ACNSk5" resolve="SendPointButton" />
    <node concept="3EZMnI" id="6ePjANl2vud" role="2wV5jI">
      <node concept="3F0ifn" id="6ePjANl2vBD" role="3EZMnx">
        <property role="3F0ifm" value="Send" />
      </node>
      <node concept="l2Vlx" id="6ePjANl2vug" role="2iSdaV" />
    </node>
  </node>
  <node concept="24kQdi" id="6ePjANl2zVU">
    <ref role="1XX52x" to="7nfd:XeX8ACNSw6" resolve="SendPointMethod" />
    <node concept="3EZMnI" id="6ePjANl2zXl" role="2wV5jI">
      <node concept="3F0ifn" id="6ePjANl2$3G" role="3EZMnx">
        <property role="3F0ifm" value="Method" />
      </node>
      <node concept="3F0A7n" id="6ePjANl2$n3" role="3EZMnx">
        <ref role="1NtTu8" to="tpck:h0TrG11" resolve="name" />
      </node>
      <node concept="l2Vlx" id="6ePjANl2zXo" role="2iSdaV" />
    </node>
  </node>
  <node concept="24kQdi" id="6ePjANl2$A6">
    <ref role="1XX52x" to="7nfd:XeX8ACNSGG" resolve="SendPointParameter" />
    <node concept="3EZMnI" id="6ePjANl2$C6" role="2wV5jI">
      <node concept="3F0ifn" id="6ePjANl2$J6" role="3EZMnx">
        <property role="3F0ifm" value="Parameter" />
      </node>
      <node concept="3F0A7n" id="6ePjANl2$O0" role="3EZMnx">
        <ref role="1NtTu8" to="tpck:h0TrG11" resolve="name" />
      </node>
      <node concept="l2Vlx" id="6ePjANl2$C9" role="2iSdaV" />
    </node>
  </node>
  <node concept="24kQdi" id="6ePjANl2_2H">
    <ref role="1XX52x" to="7nfd:XeX8ACNTCR" resolve="SendPointPathVariable" />
    <node concept="3EZMnI" id="6ePjANl2_48" role="2wV5jI">
      <node concept="3F0ifn" id="6ePjANl2_53" role="3EZMnx">
        <property role="3F0ifm" value="PathVariable" />
      </node>
      <node concept="3F0A7n" id="6ePjANl2_gT" role="3EZMnx">
        <ref role="1NtTu8" to="tpck:h0TrG11" resolve="name" />
      </node>
      <node concept="l2Vlx" id="6ePjANl2_4b" role="2iSdaV" />
    </node>
  </node>
  <node concept="24kQdi" id="6ePjANl2_kz">
    <ref role="1XX52x" to="7nfd:XeX8ACNT0W" resolve="SendPointResponseBody" />
    <node concept="3EZMnI" id="6ePjANl2_mX" role="2wV5jI">
      <node concept="3F0ifn" id="6ePjANl2_w$" role="3EZMnx">
        <property role="3F0ifm" value="ResponseBody" />
      </node>
      <node concept="l2Vlx" id="6ePjANl2_n0" role="2iSdaV" />
    </node>
  </node>
  <node concept="24kQdi" id="6ePjANl2_$d">
    <ref role="1XX52x" to="7nfd:XeX8ACNThc" resolve="SendPointResponseStatus" />
    <node concept="3EZMnI" id="6ePjANl2_Ad" role="2wV5jI">
      <node concept="3F0ifn" id="6ePjANl2_Ke" role="3EZMnx">
        <property role="3F0ifm" value="ResponseBody" />
      </node>
      <node concept="l2Vlx" id="6ePjANl2_Ag" role="2iSdaV" />
    </node>
  </node>
</model>

