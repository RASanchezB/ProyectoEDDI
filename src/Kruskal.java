import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import org.graphstream.algorithm.AbstractSpanningTree;
import org.graphstream.graph.Node;
import org.graphstream.algorithm.util.DisjointSets;
import org.graphstream.graph.Edge;
public class Kruskal extends AbstractSpanningTree{
    public static final String DEFAULT_WEIGHT_ATTRIBUTE = "weight";
    private String WeightAttribute;
    private List<Edge> TreeEdge;
    private double TreeWeight;
    public Kruskal(){
        //this(DEFAULT_WEIGHT_ATTRIBUTE,null);
    }
    public Kruskal(String Flag,Object FOn,Object FOff){
        //this(DEFAULT_WEIGHT_ATTRIBUTE, flagAttribute, flagOn, flagOff);
    }
    public Kruskal(String weightAttribute, String FlagA, Object FOn, Object FOff){
        
    }
    
    
/////////////////////////////////////////Clases abstractas
    @Override
    protected void makeTree() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public <T extends Edge> Iterator<T> getTreeEdgesIterator() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
