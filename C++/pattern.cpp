#include<iostream>
using namespace std;
int main(){
    int n;
    cout<<"Enter the lines : ";
    cin>>n;
    for(int i=1;i<=n;i++){
        for(int j=1;j<=n;j++){
            cout<<min(i,j);
        }
        cout<<endl;
    }
}