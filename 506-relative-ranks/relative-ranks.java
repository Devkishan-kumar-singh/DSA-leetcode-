class Solution {
    public String[] findRelativeRanks(int[] score) {
        int n = score.length;
        String[] answer = new String[n];

        Integer[] index = new Integer[n];
        //storing original indexes
        for(int i =0;i<n;i++){
            index[i] = i;
        }
        //sorting in descending order using comparator.
        Arrays.sort(index,(a,b) -> score[b] - score[a]);
        //Giving ranks
        for(int i =0;i<n;i++){
            if(i==0){
                answer[index[i]] = "Gold Medal";
            }
            else if(i==1){
                answer[index[i]] = "Silver Medal";
            }
            else if(i==2){
                answer[index[i]] = "Bronze Medal";
            }
            else{
                answer[index[i]] = String.valueOf(i+1);
            }
        }
        return answer;
        
    }
}