/* GROOVE: GRaphs for Object Oriented VErification
 * Copyright 2003--2011 University of Twente
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); 
 * you may not use this file except in compliance with the License. 
 * You may obtain a copy of the License at 
 * http://www.apache.org/licenses/LICENSE-2.0 
 * 
 * Unless required by applicable law or agreed to in writing, 
 * software distributed under the License is distributed on an 
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, 
 * either express or implied. See the License for the specific 
 * language governing permissions and limitations under the License.
 *
 * $Id: DefaultHostGraphTest.java 5485 2014-07-23 17:41:40Z rensink $
 */
package groove.test.graph;

import static org.junit.Assert.assertTrue;
import groove.algebra.AlgebraFamily;
import groove.algebra.Constant;
import groove.algebra.Sort;
import groove.grammar.host.DefaultHostGraph;
import groove.grammar.host.DefaultHostNode;
import groove.grammar.host.HostNode;

import org.junit.Test;

/**
 * @author rensink
 * @version $Revision $
 */
public class DefaultHostGraphTest {
    /** Tests fresh node creation. */
    @Test
    public void testNodeType() {
        DefaultHostGraph host = new DefaultHostGraph("testGraph");
        host.removeNode(host.addNode(
            AlgebraFamily.TERM.getAlgebra(Sort.INT),
            Constant.instance(1)));
        HostNode newNode = host.addNode();
        //the assertion below is false; newNode is an instance of VariableNode
        assertTrue(newNode instanceof DefaultHostNode);
    }
}
