/*GOD     IS    GREAT,
  SO    AM    I*/
#include<bits/stdc++.h>
using namespace std;
#define ll long long int
#define ford(i,a,n) for(long long int i=a;i<n;++i)
#define fore(i,a,n) for(long long int i=a;i<=n;i++)
#define test ll t;cin>>t;while(t--)
#define op(z) cout<<z<<endl
#define ops(z) cout<<z<<" "
#define fastIO ios_base::sync_with_stdio(0);cin.tie(0);cout.tie(0);
#define debug(x) cout<<#x<<" "<<x<<endl
#define pp pair<ll,ll>
#define maxe 1000000
#define MOD 1000000007
ll prime[maxe] = {0};
// TO COUNT THE DIGIT IN A NUMBER => floor(log10(n)+1)
void file()
{
#ifndef ONLINE_JUDGE
    freopen("input.txt", "r", stdin);
    freopen("output.txt", "w", stdout);
#endif
}
ll sumofdigits(ll n) {
    ll sum = 0;
    while (n > 0) {
        sum += n % 10;
        n /= 10;
    }
    return sum;
}
void sieve()
{
    prime[0] = 0;
    prime[1] = 0;
    prime[2] = 1;
    ll i, j, k;
    file();
    for (i = 3; i <= maxe; i += 2)
    {
        prime[i] = 1;
    }
    for (i = 3; i <= maxe; i++)
    {
        if (prime[i])
        {
            for (j = i * i; j <= maxe; j += 2 * i)prime[j] = 0;
        }
    }
}
bool cmp(pp &a, pp &b)
{
    if (a.first != b.first)
    {
        return b.first > a.first;
    }
    else
    {
        return b.second > a.second;
    }
}
void solve()
{
    ll n, m, y;
    cin >> n >> m;
    pp match[m];
    ford(i, 0, m)
    {
        cin >> match[i].second;
        cin >> match[i].first;
    }
    sort(match, match + m, cmp);
    ford(i, 0, m)
    {
        ops(match[i].first);
        op(match[i].second);
    }
    ll ans = 0;
    for (ll i = 0; i < m; i++)
    {
        if (n >= match[i].second)
        {
            ans += match[i].first * match[i].second;
            n -= match[i].second;
        }
        else
        {
            ans += n * match[i].first;
            n = 0;
        }
        if (n == 0)
            break;
    }
    op(ans);
}
int main()
{
    fastIO
    //sieve();
    file();
    //test
    {
        solve();
    }
    return 0;
}
