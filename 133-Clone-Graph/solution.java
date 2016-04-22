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
		ArrayList<UndirectedGraphNode> nodes = new ArrayList<>();
		HashMap<UndirectedGraphNode, UndirectedGraphNode> map = new HashMap<>();
		nodes.add(node);
		map.put(node, new UndirectedGraphNode(node.label));
		
		// copy the nodes to the hashmap
		int start = 0;
		while (start < nodes.size()){
			for (UndirectedGraphNode one: nodes.get(start).neighbors){
				if (map.containsKey(one)){
					continue;
				} else {
					nodes.add(one);
					map.put(one, new UndirectedGraphNode(one.label));
				}
			}
			start += 1;
		}
		
		// copy the edges.
		start = 0;
		while (start < nodes.size()){
			for (UndirectedGraphNode one: nodes.get(start).neighbors){
				map.get(nodes.get(start)).neighbors.add(map.get(one));
			}
			start += 1;
		}
		return map.get(node);
	}
}