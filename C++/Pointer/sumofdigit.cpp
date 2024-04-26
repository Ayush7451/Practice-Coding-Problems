#include<iostream>
using namespace std;
int main(){
    int x=10;
    int y=20;
    int* p1 = &x;
    int* p2 = &y;
    cout<<*p1+*p2;

}