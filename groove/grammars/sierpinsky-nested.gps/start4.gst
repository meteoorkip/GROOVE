<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<gxl xmlns="http://www.gupro.de/GXL/gxl-1.0.dtd">
    <graph edgemode="directed" edgeids="false" role="graph" id="start4">
        <node id="n3">
            <attr name="layout">
                <string>105 237 15 15</string>
            </attr>
        </node>
        <node id="n0">
            <attr name="layout">
                <string>141 29 35 14</string>
            </attr>
        </node>
        <node id="n4">
            <attr name="layout">
                <string>498 29 6 14</string>
            </attr>
        </node>
        <node id="n6">
            <attr name="layout">
                <string>240 27 6 14</string>
            </attr>
        </node>
        <node id="n1">
            <attr name="layout">
                <string>425 30 6 14</string>
            </attr>
        </node>
        <node id="n2">
            <attr name="layout">
                <string>342 30 6 14</string>
            </attr>
        </node>
        <node id="n5">
            <attr name="layout">
                <string>153 135 15 15</string>
            </attr>
        </node>
        <node id="n7">
            <attr name="layout">
                <string>205 237 15 15</string>
            </attr>
        </node>
        <edge to="n4" from="n4">
            <attr name="label">
                <string>4</string>
            </attr>
        </edge>
        <edge to="n7" from="n3">
            <attr name="label">
                <string>h</string>
            </attr>
        </edge>
        <edge to="n2" from="n2">
            <attr name="label">
                <string>2</string>
            </attr>
        </edge>
        <edge to="n4" from="n1">
            <attr name="label">
                <string>next</string>
            </attr>
        </edge>
        <edge to="n1" from="n2">
            <attr name="label">
                <string>next</string>
            </attr>
        </edge>
        <edge to="n5" from="n7">
            <attr name="label">
                <string>v</string>
            </attr>
        </edge>
        <edge to="n1" from="n1">
            <attr name="label">
                <string>3</string>
            </attr>
        </edge>
        <edge to="n0" from="n0">
            <attr name="label">
                <string>flag:current</string>
            </attr>
        </edge>
        <edge to="n6" from="n0">
            <attr name="label">
                <string>next</string>
            </attr>
        </edge>
        <edge to="n5" from="n3">
            <attr name="label">
                <string>v</string>
            </attr>
        </edge>
        <edge to="n6" from="n6">
            <attr name="label">
                <string>1</string>
            </attr>
        </edge>
        <edge to="n2" from="n6">
            <attr name="label">
                <string>next</string>
            </attr>
        </edge>
    </graph>
</gxl>
