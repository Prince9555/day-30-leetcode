class Solution {
    public int numberOfSteps(int num) {
        int count=0;
        while(num!=0)
        {
            if(num%2==0)
            {
                num=num/2;
                count++;
            }
            else{
                num=num-1;
                count++;
            }
            
            
        }
        return count;
        
    }
}




class Solution {
    public int countDigits(int num) {
        int count=0;
        int find=num;
        while(num>0)
        {
            int lastd=num%10;
            if(find%lastd==0)
            {
                count++;
            }
            num=num/10;
            
            
        }
        return count;
        
    }
}


