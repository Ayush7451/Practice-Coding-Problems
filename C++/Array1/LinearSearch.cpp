#include<iostream>
using namespace std;
int main(){
    int n;
    cout<<"Enter the size of array : ";
    cin>>n;
    int arr[n];
    //input
    for(int i=0;i<=n-1;i++){
        cin>>arr[i];
    }
    int x;
    cout<<"Enter the number you want to find : ";
    cin>>x;
    //search
    bool flag = false; //pehle se hi man lege ki element nhi hai
    for(int i=0;i<=n-1;i++){
        if(arr[i]==x) flag=true;
    }
    if(flag==true) cout<<"Element is present ";
    else cout<<"Element not present ";
}