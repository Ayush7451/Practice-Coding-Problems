#include<iostream>
using namespace std;
int main(){
    int a,b;
    cout<<"Enter the numbers : ";
    cin>>a>>b;
    int* ptr1=&a;
    int* ptr2=&b;
    cout<<(*ptr1) * (*ptr2);
}