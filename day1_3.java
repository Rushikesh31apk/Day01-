class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res= new ArrayList(); // creating result list

        res.add(new ArrayList()); // adding empty list []

        for(int num:nums){ // itrate for loop 1,2,3 times
            for(int i=0;i< res.size();i++) // this fro loop run first 2 time then 2 then 4
            {
                List<Integer> temp=new ArrayList(res.get(i));// create empty list 
                temp.add(num); // adding [] ,1]
                res.add(temp);// add temp list in result list
            }
        }
        return res;
        
    }
}
