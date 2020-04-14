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

//how to use Comparator 2
pq.poll(a); //get the min value
PriorityQueue<Integer> pq = new PriorityQueue<Integer> (
  new Comparator<Integer> () {
    public int compare(Integer a, Integer b) {
       return b - a;
    }
  }
);
PriorityQueue<Integer> pq2 = new PriorityQueue<>((a,b)->b-a) //how to use Comparator 3:lambda expression 
pq2.poll(a); //get the max value


