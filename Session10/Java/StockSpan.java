https://practice.geeksforgeeks.org/problems/stock-span-problem-1587115621/1/?page=1&status[]=solved&category[]=Stack&category[]=Queue&sortBy=submissions#

class Solution
{
    //Function to calculate the span of stockâ€™s price for all n days.
    public static int[] calculateSpan(int price[], int n)
    {
        // Your code here
       int[] span = new int[n];
       Stack<Integer> s = new Stack<>();
       s.push(0);
       span[0] = 1;
       
       for(int i=1; i<n; i++)
       {
           while(!s.isEmpty() && price[s.peek()] <= price[i])
           {
               s.pop();
           }
           
           span[i] = (s.isEmpty()) ? (i+1): (i-s.peek()); 
           
           s.push(i);
       }
       
       return span;
    }
    
}