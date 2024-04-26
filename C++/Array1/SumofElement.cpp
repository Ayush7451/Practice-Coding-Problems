#include<iostream>
using namespace std;
int main(){
    int n;
    cout<<"Enter the size of array : ";
    cin>>n;
    int arr[n];
    for(int i=0;i<=n-1;i++){
        cin>>arr[i];
    }
    int sum=0;
    for(int j=0;j<=n-1;j++){
        sum=sum+arr[j];
    }
    cout<<sum;
}