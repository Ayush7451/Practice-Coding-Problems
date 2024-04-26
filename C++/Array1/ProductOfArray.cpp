#include<bits/stdc++.h>
using namespace std;
int productOfArray (int a[] , int n){
    int product = 1;
    for(int i=0;i<n;i++)
    product *= a[i];
    return product;
}
int main(){
    int n;
    cout<<"Enter the size of Array : ";
    cin>>n;
    int a[n];
    for(int i=0;i<n;i++){
        cin>>a[i];
    }
    cout<<productOfArray(a,n);
}