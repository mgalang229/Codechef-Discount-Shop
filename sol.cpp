#include <bits/stdc++.h>
#include <ext/pb_ds/assoc_container.hpp>
using namespace std;
using namespace __gnu_pbds;

#define ll long long
#define ar array

typedef tree<int, null_type, less<int>, rb_tree_tag,
tree_order_statistics_node_update> indexed_set;

void solve() {
	string s;
	cin >> s;
	ll ans=LONG_MAX;
	for(ll i=0; i<(ll)s.size(); ++i) {
		ll tmp=0, p=1;
		for(ll j=(ll)s.size()-1; j>=0; --j)
			if(i!=j) {
				tmp+=p*(s[j]-'0');
				p*=10;	
			}
		ans=min(ans, tmp);
	}
	cout << ans << "\n";
}

int main() {
	ios::sync_with_stdio(0);
	cin.tie(0);
	
	int t;
	cin >> t;
	while(t--)
		solve();
}
