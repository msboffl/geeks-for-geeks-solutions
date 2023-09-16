//{ Driver Code Starts
#include <bits/stdc++.h>
using namespace std;

// } Driver Code Ends

class Solution
{
    public:
    //Function to count the number of ways in which frog can reach the top.
    long long countWays(int n){
    int m = (1e9 + 7);
    vector<long long> tribo = {1, 1, 2};
    for(int i = 3; i <= n; i++){
        tribo[i % 3] = (tribo[0] % m + tribo[1] % m + tribo[2] % m) % m;
    }
    return tribo[n % 3];
}
};


//{ Driver Code Starts.
int main()
{
    //taking testcases
	int t;
	cin >> t;
	
	while(t--)
	{
	    //taking number of steps in stair
		int n;
		cin>>n;
		Solution ob;
		//calling function countWays()
		cout << ob.countWays(n) << endl;
	}
    
    return 0;
    
}

// } Driver Code Ends