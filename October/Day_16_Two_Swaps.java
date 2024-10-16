class Solution {

    public boolean checkSorted(List<Integer> arr) {
        int count=0;
        int i,j;
        for(i=0;i<arr.size();i++)
        {
            if(arr.get(i)!=i+1)
            {
                for(j=i;j<arr.size();j++)
                {
                    if(arr.get(j)==i+1)
                    break;
                }
                int temp=arr.get(j);
                 arr.set(j,arr.get(i));
                arr.set(i,temp);
                count++;
            }
            if(count>2)
            break;
        }
        
        if(count==2|| count==0) return true;
        return false;
    }
}