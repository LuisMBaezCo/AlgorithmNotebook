// Made by Luis Miguel Baez
// es.luismiguelbaez@gmail.com

#include <bits/stdc++.h>
 
using namespace std;

#define endl '\n'
#define precise(n,k) fixed << setprecision(k) << n
#define all(x) (x).begin(), (x).end()
#define rall(x) (x).rbegin(), (x).rend()

#define uint  unsigned int
#define ll    long long
#define ull   unsigned long long
#define ld    long double

const int MOD = int(1e9+7);
const ll oo  = (ll)(1e9+20);
const ll lloo  = (ll)(1e18)+40;

class Task {
public:
    
    ll solve(istream &in, ostream &out) {
         
        return -1;  
    }
    
    void run(istream &in, ostream &out) {
        int t;
        in >> t;
        while(t--) {
            out << solve(in, out) << endl;
        }
    }
};
    
auto main() -> int {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);
    
    Task solver;
    istream &in(cin);
    ostream &out(cout);
    cout << solver.solve(in, out) << endl;
    //solver.run(in, out);
    return 0;
}