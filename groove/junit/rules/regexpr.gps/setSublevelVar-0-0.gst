<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<gxl xmlns="http://www.gupro.de/GXL/gxl-1.0.dtd">
    <graph edgemode="directed" edgeids="false" role="graph" id="setSublevelVar-0-0">
        <node id="n2">
            <attr name="layout">
                <string>172 245 29 31</string>
            </attr>
        </node>
        <node id="n0">
            <attr name="layout">
                <string>84 157 29 46</string>
            </attr>
        </node>
        <node id="n1">
            <attr name="layout">
                <string>192 165 28 31</string>
            </attr>
        </node>
        <edge to="n2" from="n2">
            <attr name="label">
                <string>type:A</string>
            </attr>
        </edge>
        <edge to="n2" from="n2">
            <attr name="label">
                <string>flag:a</string>
            </attr>
        </edge>
        <edge to="n0" from="n0">
            <attr name="label">
                <string>type:A</string>
            </attr>
        </edge>
        <edge to="n0" from="n0">
            <attr name="label">
                <string>flag:a</string>
            </attr>
        </edge>
        <edge to="n1" from="n0">
            <attr name="label">
                <string>aToB</string>
            </attr>
        </edge>
        <edge to="n1" from="n1">
            <attr name="label">
                <string>type:B</string>
            </attr>
        </edge>
        <edge to="n0" from="n1">
            <attr name="label">
                <string>bToA</string>
            </attr>
            <attr name="layout">
                <string>500 0 206 181 152 150 99 180 12</string>
            </attr>
        </edge>
        <edge to="n2" from="n1">
            <attr name="label">
                <string>bToA</string>
            </attr>
        </edge>
    </graph>
</gxl>
