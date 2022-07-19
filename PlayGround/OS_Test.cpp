#include<bits/stdc++.h>
using namespace std;
int counter=0;

void task(){
    for(int i=0;i<0;i++){
        counter+=1;
    }
}

int main(){
    std::thread t1(task);
    std::thread t2(task);
    t1.join();
    t2.join();

  //task();

  cout<<counter;
  return 0;
}
