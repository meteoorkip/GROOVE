package simple;

import groove.grammar.type.TypeGraph;
import groove.grammar.type.TypeLabel;
import groove.grammar.type.TypeNode;
import groove.graph.EdgeRole;
import javagraph.graph.JavaGraph;
import javagraph.graph.JavaNode;

public class GraphExample {
    public static void main(String[] args) {
        JavaGraph graph = new JavaGraph();
        nodeExample(graph);
        edgeExample(graph);
    }

    public static void nodeExample(JavaGraph graph) {
        TypeGraph typeGraph = graph.getTypeGraph();
        TypeNode nodeExampleType = typeGraph.getNodeByName("NodeExample");

        System.out.println("TypeGraph=" + typeGraph);
        System.out.println("Nodes=" + graph.visitNodes());

        // Create a node
        JavaNode nodeExample = graph.createNode(nodeExampleType);
        System.out.println("CreateNode(NodeExample)=" + nodeExample);
        System.out.println("Nodes=" + graph.visitNodes());

        // Delete the created node
        System.out.println("DeleteNode(NodeExamlpe)=" + nodeExample.deleteNode());
        System.out.println("Nodes=" + graph.visitNodes());
        System.out.println();
    }

    public static void edgeExample(JavaGraph graph) {
        TypeGraph typeGraph = graph.getTypeGraph();
        TypeNode edgeExampleType = typeGraph.getNodeByName("EdgeExample");
        TypeNode nodeExampleType = typeGraph.getNodeByName("NodeExample");
        TypeNode anotherNodeExampleType = typeGraph.getNodeByName("AnotherNodeExample");

        System.out.println("TypeGraph=" + typeGraph);
        System.out.println("Nodes=" + graph.visitNodes());

        // Create nodes
        JavaNode sourceNode = graph.createNode(edgeExampleType);
        JavaNode targetNode1 = graph.createNode(nodeExampleType);
        JavaNode targetNode2 = graph.createNode(anotherNodeExampleType);
        System.out.println("CreateNode(EdgeExample)=" + sourceNode);
        System.out.println("CreateNode(NodeExample)=" + targetNode1);
        System.out.println("CreateNode(AnotherNodeExample)=" + targetNode2);
        System.out.println("Nodes=" + graph.visitNodes());
        System.out.println("Nodes(EdgeExample)=" + graph.visitNode(edgeExampleType));

        // Create edges
        TypeLabel labelExample = TypeLabel.createLabel(EdgeRole.BINARY, "LabelExample");
        System.out.println("CreateEdge(EdgeExample, NodeExample)=" + sourceNode.createEdge(labelExample, targetNode1));
        System.out.println("CreateEdge(EdgeExample, AnotherNodeExample)=" + sourceNode.createEdge(labelExample, targetNode2));
        System.out.println("VisitEdge(EdgeExample,NodeExample)=" + sourceNode.visitEdge(labelExample, nodeExampleType));
        System.out.println("VisitEdges(EdgeExample)=" + sourceNode.visitEdges());

        // Delete edge
        System.out.println("DeleteEdge(EdgeExample, NodeExample)=" + sourceNode.deleteEdge(labelExample, targetNode1));
        System.out.println("VisitEdges(EdgeExample)=" + sourceNode.visitEdges());
        System.out.println();
    }
}
