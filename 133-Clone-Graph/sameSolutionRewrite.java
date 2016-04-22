/**
 * Definition for undirected graph.
 * class UndirectedGraphNode {
 *     int label;
 *     List<UndirectedGraphNode> neighbors;
 *     UndirectedGraphNode(int x) { label = x; neighbors = new ArrayList<UndirectedGraphNode>(); }
 * };
 */
public class Solution {
	/**
	 * @param node: A undirected graph node
	 * @return: A undirected graph node
	 */
	public UndirectedGraphNode cloneGraph(UndirectedGraphNode node) {
		// write your code here
		if (node == null){
		    return null;
		}
		
		HashMap<UndirectedGraphNode, UndirectedGraphNode> map = new HashMap<>();
		ArrayList<UndirectedGraphNode> nodes = new ArrayList<>();
		
		// BFS to get all the nodes and do the 1 to 1 match using hashmap.
		
		int start = 0;
		nodes.add(node);
		map.put(node, new UndirectedGraphNode(node.label));
		
		while(start < nodes.size()){
		    UndirectedGraphNode curr = nodes.get(start);
		    for (UndirectedGraphNode n : curr.neighbors){
		        if (map.containsKey(n)){
		            continue;
		        } else {
		            nodes.add(n);
		            map.put(n, new UndirectedGraphNode(n.label));
		        }
		    }
		    start += 1;
		}
		
		// Then handling the neighbors of the nodes.
		start = 0;
		while(start < nodes.size()){
		    UndirectedGraphNode curr = nodes.get(start);
		    for(UndirectedGraphNode n : curr.neighbors){
		        map.get(curr).neighbors.add(map.get(n));
		    }
		    start += 1;
		}
		
		return map.get(node);
	}
}