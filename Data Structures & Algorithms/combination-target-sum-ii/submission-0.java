class Solution {
     List<List<Integer>>result=new ArrayList<>();
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
          Arrays.sort(candidates);

        backtrack(candidates, target, 0, new ArrayList<>());

        return result;
        
    }
     public void backtrack(int[] candidates, int target,
                           int index, List<Integer> current) {

        if (target == 0) {
            result.add(new ArrayList<>(current));
            return;
        }

        if (target < 0) {
            return;
        }

        for (int i = index; i < candidates.length; i++) {

            // Skip duplicate elements at the same level
            if (i > index && candidates[i] == candidates[i - 1]) {
                continue;
            }

            // Since array is sorted
            if (candidates[i] > target) {
                break;
            }

            current.add(candidates[i]);

            // i + 1 because each element can be used only once
            backtrack(candidates,
                      target - candidates[i],
                      i + 1,
                      current);

            // Backtrack
            current.remove(current.size() - 1);
        }
    }
}
