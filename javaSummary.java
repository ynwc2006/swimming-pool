//how to use Comparator 1
    private class SolCompare implements Comparator<SearchNode> {
        public int compare(SearchNode a, SearchNode b) {
            int weightA = a.move + a.ws.estimatedDistanceToGoal();
            int weightB = b.move + b.ws.estimatedDistanceToGoal();
            return weightA - weightB;
        }
    }

    public Solver(WorldState initial) {
        SolCompare sc = new SolCompare();
        MinPQ<SearchNode> pq = new MinPQ(sc);
        }
//how to use comparator & priority queue to get the max from the PQ
PriorityQueue<Integer> pq = new PriorityQueue<Integer> (
  new Comparator<Integer> () {
    public int compare(Integer a, Integer b) {
       return b - a;
    }
  }
);
